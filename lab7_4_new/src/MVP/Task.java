package MVP;

import java.util.Calendar;

public class Task {
    private String title;
    private Calendar dueDate;
    private Boolean isCompleted;
    public Task(String title, Calendar dueDate) {
        this.title = title;
        this.dueDate = dueDate;
        this.isCompleted = false;
    }
    public String getTitle() {
        return title;
    }
    public Calendar getDueDate() {
        return dueDate;
    }
    public void complete() {
        isCompleted = true;
    }
    public boolean isCompleted() {
        return isCompleted;
    }
}
