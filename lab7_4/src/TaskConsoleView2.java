import java.util.List;

public class TaskConsoleView2 implements TaskView2 {
    @Override
    public void createTask(List<Task2> tasks, Task2 task) {
        tasks.add(task);
    }

    @Override
    public void updateTask(Task2 task) {
        task.setIsCompleted();
    }

}
