import java.util.HashMap;

public class Task {
    private int iteration = 0;
    private HashMap<String,Integer> durations = new HashMap<>();

    public Task(String department,int iteration){
        durations.put(department,iteration);
    }

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
        return false;
    }
    public void setDurations(String department,int iteration){
        durations.put(department,iteration);
    }
}
