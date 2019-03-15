public class Employee {
    private float success;
    private int points;
    private Employee boss;
    private Department department;
    private Task employeeTask;

    public boolean getTask(){
        if(employeeTask == null){
            return true;
        } else return false;
    }
    public void addTask(Task task){
        employeeTask = task;
    }

    public void step(){
        if(employeeTask!=null){
            employeeTask.incIteration();
        }
    }

}