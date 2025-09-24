package ObserverPattern;

public interface Subject {
    void Subscribe(Observer o);
    void UnSubscribe(Observer o);
    void NotifyUsers(String message);
}
