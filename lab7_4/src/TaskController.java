public class TaskController {
    private Task task;
    private TaskView view;
    public TaskController(Task task, TaskView view) {
        this.task = task;
        this.view = view;
    }
    public void addTask(String name) {
        task.addTask(name);
    }
    public void removeTask(String name) {
        task.removeTask(name);
    }
    public void doTask(String name) {
        task.doTask(name);
    }
    public void updateView() {
        view.displayTasksState(task.getIsCompleted());
    }
    public static void main(String[] args){
        Task task = new Task();
        TaskView view;
        view = new TaskView();
        TaskController controller = new TaskController(task, view);
        controller.addTask("Task 1");
        controller.addTask("Task 2");
        controller.doTask("Task 1");
        controller.updateView();
    }
}
