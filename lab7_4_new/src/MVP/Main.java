package MVP;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaskView view = new TaskConsoleView();
        TaskPresenter presenter = new TaskPresenter(view);
        Calendar calendar = new GregorianCalendar(2024, 11, 21);
        presenter.addTask("Task 1", calendar);
        presenter.addTask("Task 2", calendar);
        presenter.completeTask("Task 1");
        presenter.displayTasks();
    }
}
