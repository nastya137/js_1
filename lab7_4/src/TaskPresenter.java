import java.util.List;

public class TaskPresenter {
    private List<Task2> task;
    private TaskView2 taskView;

    public TaskPresenter(List<Task2> task, TaskView2 taskView) {
        this.task = task;
        this.taskView = taskView;
    }

    public void addNew(Task2 task) {
        taskView.createTask(this.task, task);
    }

    public void setCompleted(Task2 task) {
        if (this.task.contains(task)){
            this.task.get(this.task.indexOf(task)).setIsCompleted();
        }
    }
}
