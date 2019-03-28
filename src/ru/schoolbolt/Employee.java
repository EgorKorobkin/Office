package ru.schoolbolt;

public class Employee {
    private float success;
    private int points;
    private Employee boss;
    private Department department;
    private Task employeeTask;

    public boolean hasTask(){
        return employeeTask==null;
    }
    public void addTask(Task task){
        employeeTask = task;
    }

    public void step(){
        if(employeeTask!=null){
            System.out.println("Step у сотрудника увеличиваем итерацию");
            employeeTask.incIteration();
            /*проверка на завершение задачи*/
            if(employeeTask.isCompleted()){
                System.out.println("isCompleted задача выполнена");
                //department.notify(employeeTask);//оповещает о сделанной задаче
            }
        }
    }
}
