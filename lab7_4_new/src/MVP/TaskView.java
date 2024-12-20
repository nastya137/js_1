package MVP;

import java.util.Calendar;
import java.util.List;

interface TaskView {
    public void addTask(List<Task> tasks, String title, Calendar deadline);
    public void addTask(List<Task> tasks, Task task);
    public void completeTask(Task task);
    public void printTasks(Task task);
}
