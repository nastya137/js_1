import java.util.List;

public class Task2 {
    private String title;
    private java.util.Date DueDate;
    private Boolean isCompleted;
    private Task2 t;

    public Task2(String title, java.util.Date DueDate, Boolean isCompleted) {
        this.title = title;
        this.DueDate = DueDate;
        this.isCompleted = isCompleted;
    }

    public String getTitle() {
        return title;
    }
    public java.util.Date getDueDate() {
        return DueDate;
    }
    public Boolean getIsCompleted() {
        return isCompleted;
    }
    public void setIsCompleted() {
        this.isCompleted = true;
    }
}
