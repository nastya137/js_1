package MVC;

public class Main {
    public static void main(String[] args) {
        TaskView view = new TaskView();
        Controller controller = new Controller(view);
        controller.addTask("Task 1");
        controller.addTask("Task 2");
        controller.updateTasks();
        controller.completeTask("Task 1");

    }
}