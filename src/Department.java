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

        for(int i=0;i<employees.size();i++){
            if(employees.get(i).getTask()){
                if(tasksList.peekFirst()!=null){
                    employees.get(i).addTask(tasksList.getFirst());
                }
            }
        }
    }
    public ArrayList<Employee> getRating(){
        return new ArrayList<>();
    }

    public void Subscribe(Department d){

    }
    public void notify(Task task){

    }

    public void step(){
        for(int i = 0;i<employees.size();i++){
            if(employees.get(i).getTask()){
                System.out.println("this is here_0");
                if(tasksList.peekFirst()!=null){
                    System.out.println("this is here");
                    employees.get(i).addTask(tasksList.getFirst());//get СЂР°Р·Сѓ РёР·РІР»РµРєР°РµС‚ РїРѕСЌС‚РѕРјСѓ РёСЃРєР»СЋС‡РµРЅРёРµ С‡С‚РѕР±РІ РїРѕСЃРјРѕС‚СЂРµС‚СЊ РЅР°РґРѕ РёСЃРїР»СЊР·РѕРІР°С‚СЊ peek
                }
            }
        }
        for(Employee e:employees){
            e.step();
        }
    }
}
