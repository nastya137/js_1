package MVP;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TaskPresenter {
    private List<Task> tasks;
    private TaskView view;
    public TaskPresenter(TaskView view) {
        this.tasks = new ArrayList<>();
        this.view = view;
    }
    public void addTask(Task task) {
        view.addTask(this.tasks, task);
    }
    public void addTask(String title, Calendar deadline) {
        view.addTask(this.tasks, title, deadline);
    }
    public void completeTask(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equals(title)) {
                view.completeTask(task);
            }
        }
    }
    public void displayTasks() {
        for (Task task : this.tasks) {
            view.printTasks(task);
        }
    }
}
