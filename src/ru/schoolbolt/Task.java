package ru.schoolbolt;

import java.util.HashMap;

public class Task {
    private int iteration = 0;
    private HashMap<String,Integer> durations = new HashMap<>();

    public Task(){}

    public int getDuration(String s){
        return durations.get(s);
    }
    public int getIteration(){
        return iteration;
    }
    public void incIteration(){
        iteration++;
    }
    public boolean isCompleted(){
        /*как здесь должна возвращать количесво итераций задача в зависимости от отдела ?
        * как передавать задачу по отделам ? */
//        if(){
//            return true;
//        } else return false;
        return false;
    }
    public void setDurations(String department,int iteration){
        durations.put(department,iteration);
    }
}
/*если задача переходит в другой отдел iteration обнуляется*/
