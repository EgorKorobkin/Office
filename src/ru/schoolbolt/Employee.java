package ru.schoolbolt;

public class Employee {
    private float success;
    private int points;
    private Employee boss;
    private Department department;
    private Task employeeTask;

    public boolean hasTask(){
        return employeeTask != null;
    }
    public void addTask(Task task){
        employeeTask = task;
    }

    public void step(){
        if(employeeTask!=null){
            employeeTask.incIteration();
        }
        if(employeeTask!=null){
            if(employeeTask.isCompleted()){
                System.out.println("задача выполнена");
            }
        }
    }
}
