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

    public void stepper(){
        for(Department d:departments){
            d.step();
        }
    }

    public boolean step(){
        if(tasks.size()<10){
            Task task = new Task("DS",(int) (Math.random() * 5));
            task.setDurations("FE",(int) (Math.random() * 5));
            task.setDurations("BE",(int) (Math.random() * 5));
            tasks.add(task);
            departments.get(0).sendTask(task);
            stepper();
            return false;
        }else {
            return true;
        }
    }

    public void printResult(){
    }

}
