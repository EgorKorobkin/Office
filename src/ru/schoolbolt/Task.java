package ru.schoolbolt;

import java.util.HashMap;

public class Task {
    private int iteration = 0;
    private HashMap<String,Integer> durations = new HashMap<>();
    private String department;


    public Task(){}

    public int getDuration(String s){
        return durations.get(s);
    }
    public int getIteration(){
        return iteration;
    }
    public void incIteration(){
        System.out.println("incIteration у Task");
        iteration++;
    }
    public void resetIteration(){
        iteration = 0;
    }
    public boolean isCompleted(){
        /*принимает в параметре отдел если количесвто итераций на отдел
         * равно количесву существующих итераций то задача выполнена */
        if(iteration == durations.get(department)){
            System.out.println("задача выполнена "+department);
            return true;
        } else return false;
    }
    public void setDurations(String department,int iteration){
        durations.put(department,iteration);
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
/*если задача переходит в другой отдел iteration обнуляется*/
/*мне кажется что задача должна содержать поле в котором находится название отела в котором она сейчас*/
