package MVC;

public class TaskView {//реализует отображение данных, получаемых от модели
    public void IsCompleted(Task task) {
        System.out.print(task.getTitle());
        if (task.IsCompleted())
            System.out.println(" is completed");
        else
            System.out.println(" is not completed");
    }
}
