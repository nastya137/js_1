package MVC;

import java.util.ArrayList;
import java.util.List;

public class Controller {//изменения в model, затем вывод представления
    private List<Task> model;
    private TaskView taskView;
    public Controller(TaskView View) {
        this.model = new ArrayList<>();
        this.taskView = View;
    }
    public void addTask(String name) {
        model.add(new Task(name));
    }
    public void addTask(Task task) {
        model.add(task);
    }
    public void removeTask(Task task) {
        model.remove(task);
    }
    public void completeTask(String name) {
        for (Task task : model) {
            if (task.getTitle().equals(name)) {
                task.complete();
                updateTask(task);
            }
        }
    }
    public void removeTask(String name) {
        for (Task task : model) {
            if (task.getTitle().equals(name)) {
                model.remove(task);
            }
        }
    }
    public void updateTask(Task task) {
        taskView.IsCompleted(task);
    }
    public void updateTasks() {
        for (Task task : model) {
            updateTask(task);
        }
    }
}
