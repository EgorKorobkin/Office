package ru.schoolbolt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Department {
    private LinkedList<Task> tasksList = new LinkedList<>();
    private Employee boss;
    private ArrayList<Employee> employees = new ArrayList<>();
    private String name;
    private Map<String,Department> observers = new HashMap<>();

    public Department(String departmentName, int emp){
        this.name = departmentName;
        for(int i = 0;i<emp;i++){
            employees.add(new Employee());
        }
        System.out.println("Создание отдела "+name);
    }

    public void sendTask(Task t){
        //если есть свободный сотрудник то отпралять ему если нет добовлять в список
        boolean taskAdd = true;
        for(Employee e:employees){
            if(e.hasTask()){
                e.addTask(t);
                taskAdd = false;//отдает свободному сотруднику
                System.out.println("дали задачу свободному сотруднику");
            }
        }
        if(taskAdd){
            tasksList.addLast(t);//добавляет в лист
            System.out.println("пометсили задачу в лист ");
        }

    }
    public ArrayList<Employee> getRating(){
        return new ArrayList<>();
    }

    public void Subscribe(Department d){ //добавляет слушателей(department)
        observers.put(d.name, d);
        /*обсерверы назодятся в map*/
    }

    public void notify(Task task){ //передает задачу между отделами
        /*обнулет итерцию*/
        task.resetIteration();
        /*сравниваю имена отделов если и передаю задачу следующему отделу */


        if(task.getDepartment()=="DS"){
            //предаю задачу из ds в fe
            observers.get("FE").sendTask(task);
        } else if(task.getDepartment()=="FE"){
            //передаю задачу из fe в be
            observers.get("BE").sendTask(task);
        } //поменять на map
        //вызывается из емплой
    }

    public void step(){
        for(int i=0;i<employees.size();i++){
            System.out.println("собираемся дать задачу ");
            /*если сотрудник свободный и есьт задача в очереди то даем задачу сотруднику*/
            if((employees.get(i).hasTask()) && (tasksList.peekFirst()!=null)){
                System.out.println("дали задачу сотрудику из "+name);
                employees.get(i).addTask(tasksList.getFirst());
                tasksList.remove(0);//удаляем задачу из списка задач
            }
        }
        for(Employee e:employees){
            System.out.println("Вызываем step у всех сотрудников "+name);
            e.step();
        }
    }

    public String getName() {
        return name;
    }
}
/* отдел подписывается и подписан и когда приходит задача он отправляет ее всем */