import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task {
    private String title;
    private Map<String, Boolean> isCompleted;
    public Task() {
        this.title = "To do list:";
        isCompleted = new HashMap<String, Boolean>();
    };
    public Task(String title, Map<String, Boolean> isCompleted) {
        this.title = title;
        this.isCompleted = isCompleted;
    }
    public String getTitle() {
        return title;
    }
    public Map<String, Boolean> getIsCompleted() {
        return isCompleted;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void addTask(String name){
        isCompleted.put(name, false);
    }
    public void doTask(String name){
        isCompleted.replace(name, true);
    }
    public void removeTask(String name){
        isCompleted.remove(name);
    }
}
