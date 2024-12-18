import java.util.Map;

public class TaskView {
    public TaskView(){

    }
    public void displayTaskState(String task, Map<String, Boolean> tasks){
        if (tasks.containsKey(task)){
            if(tasks.get(task)){
                System.out.println(task + " is completed");
            }
            else{
                System.out.println(task + " is not completed");
            }
        }
    }
    public void displayTasksState(Map<String, Boolean> tasks){
        for (String key : tasks.keySet()){
            if (!tasks.get(key)) System.out.println(key + " is not completed");
            else {
                System.out.println(key + " is completed");
            }
        }
    }
}
