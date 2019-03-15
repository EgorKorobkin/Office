package ru.schoolbolt;

import java.util.ArrayList;
import java.util.LinkedList;

public class Department {
    private LinkedList<Task> tasksList = new LinkedList<>();
    private Employee boss;
    private ArrayList<Employee> employees = new ArrayList<>();
    private String name;
    private ArrayList<Department> observers = new ArrayList<>();

    public Department(int emp){
        for(int i = 0;i<emp;i++){
            employees.add(new Employee());
        }
    }

    public void sendTask(Task t){
        //если есть свободный сотрудник то отпралять ему если нет добовлять в список
        boolean taskAdd = true;
        for(Employee e:employees){
            if(e.hasTask()){
                e.addTask(t);
                taskAdd = false;//отдает свободному сотруднику
            }
        }
        if(taskAdd){
            tasksList.addLast(t);//добавляет в лист
        }
        System.out.println("this is sendTask");

    }
    public ArrayList<Employee> getRating(){
        return new ArrayList<>();
    }

    public void Subscribe(Department d){

    }
    public void notify(Task task){
        //вызывается из емплой
    }

    public void step(){
        for(int i=0;i<employees.size();i++){
            /*если сотрудник свободный и есьт задача в очереди то даем задачу сотруднику*/
            if((employees.get(i).hasTask()) && (tasksList.peekFirst()!=null)){
                System.out.println("даем задачу");
                employees.get(i).addTask(tasksList.getFirst());
            }
        }
        for(Employee e:employees){
            e.step();
        }
    }
}
