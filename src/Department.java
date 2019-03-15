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
        System.out.println("this is sendTask");
        tasksList.addLast(t);
    }
    public ArrayList<Employee> getRating(){
        return new ArrayList<>();
    }

    public void Subscribe(Department d){

    }
    public void notify(Task task){

    }

    public void step(){
        for(int i=0;i<employees.size();i++){
            /*если сотрудник свободный и есьт задача в очереди то даем задачу сотруднику*/
            if((employees.get(i).getTask()) && (tasksList.peekFirst()!=null)){
                System.out.println("даем задачу");
                employees.get(i).addTask(tasksList.getFirst());
            }
        }
        for(Employee e:employees){
            e.step();
        }
    }
}
//if(tasks.size()<10){
//        Task task = new Task("DS",(int) (Math.random() * 5));
//        task.setDurations("FE",(int) (Math.random() * 5));
//        task.setDurations("BE",(int) (Math.random() * 5));
//        departments.get(0).sendTask(task); //кладет задачу первому отделу
//        tasks.add(task);
//        }
