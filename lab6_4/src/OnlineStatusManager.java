import java.util.ArrayList;
import java.util.List;


class OnlineStatusManager {
    private List<Observer> players = new ArrayList<>();
    public void addObserver(Observer observer) {
        players.add(observer);
    }
    public void removeObserver(Observer observer) {
        players.remove(observer);
    }
    public void notifyObservers() {
        for (Observer observer : players) {
            observer.isOnline( );
        }
    }
}

