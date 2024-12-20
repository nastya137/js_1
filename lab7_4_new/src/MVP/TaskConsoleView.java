package MVP;

import java.util.Calendar;
import java.util.List;

public class TaskConsoleView implements TaskView {
    @Override
    public void addTask(List<Task> tasks, String title, Calendar deadline){
        Task newTask = new Task(title, deadline);
        tasks.add(newTask);
    }
    @Override
    public void addTask(List<Task> tasks, Task task){
        tasks.add(task);
    }
    @Override
    public void completeTask(Task task){
        task.complete();
    };
    @Override
    public void printTasks(Task task){
            System.out.print(task.getTitle()+" "+task.getDueDate().getTime());
            if(task.isCompleted())
                System.out.println(" is completed");
            else
                System.out.println(" is not completed");
    }
}
