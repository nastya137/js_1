package MVC;

public class Task {//функциональная логика приложения
    private String title;
    private Boolean IsCompleted;
    public Task(String title) {
        this.title = title;
        this.IsCompleted = false;
    }
    public String getTitle() {
        return title;
    }
    public void complete(){
        this.IsCompleted = true;
    }
    public Boolean IsCompleted() {
        return IsCompleted;
    }
}
