package ru.schoolbolt;

import java.util.ArrayList;

public class Stepper {
    private ArrayList<Department> departments = new ArrayList<>();
    private ArrayList<Task> tasks = new ArrayList<>();

    Stepper(){
        Department DS = new Department(5);
        Department FE = new Department(4);
        Department BE = new Department(5);

        departments.add(DS);
        departments.add(FE);
        departments.add(BE);
    }
    public boolean step(){
        if(tasks.size()<10){
            Task task = new Task();
            task.setDurations("DS",(int) (Math.random() * 5));
            task.setDurations("FE",(int) (Math.random() * 5));
            task.setDurations("BE",(int) (Math.random() * 5));
            departments.get(0).sendTask(task); //кладет задачу первому отделу
            tasks.add(task);
        }
        /*вызывает step у каждого отдела*/
        for(Department d:departments){
            d.step();
        }
        /*проверить все ли задачи выполнены если все выполнены то true*/
        boolean flag = true;
        for(Task b :tasks){
            if(b.isCompleted()==false) {
                flag = false;
            }
        }
        return flag;
    }
    public void printResult(){
    }
}
