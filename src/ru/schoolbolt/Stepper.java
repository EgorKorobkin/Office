package ru.schoolbolt;

import java.util.ArrayList;

public class Stepper {
    private ArrayList<Department> departments = new ArrayList<>();
    private ArrayList<Task> tasks = new ArrayList<>();
    int i = 0;

    Stepper(){
        Department DS = new Department("DS",5);
        Department FE = new Department("FE",4);
        Department BE = new Department("BE",5);

        departments.add(DS);
        departments.add(FE);
        departments.add(BE);

        departments.get(0).Subscribe(departments.get(0)); //подписываемся
        departments.get(0).Subscribe(departments.get(1));
        departments.get(0).Subscribe(departments.get(2));

    }
    public boolean step(){
        System.out.println("Итерация №"+i);
        i++; //это я проверяю сколько раз запускается step
        if(tasks.size()<10){
            Task task = new Task();
            task.setDurations("DS",5);
            task.setDurations("FE",5);
            task.setDurations("BE",5);
            departments.get(0).sendTask(task); //кладет задачу первому отделу
            System.out.println("создает задачу и кладет в список ");
            task.setDepartment("DS");

            tasks.add(task);
        }
        /*вызывает step у каждого отдела*/
        for(Department d:departments){
            d.step();
        }
        /*проверить все ли задачи выполнены если все выполнены то true*/
        boolean flag = true;
        if(tasks.size()==10){
            for(Task b :tasks){
                if(!b.isCompleted()) {
                    flag = false;
                }
            }
        }
        return flag;
    }
    public void printResult(){
        System.out.println("все задачи выполнены");
    }
}
