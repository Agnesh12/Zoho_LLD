package ObserverPattern;
import java.util.*;

public class Topic implements Subject{
    List<Observer> observers =  new ArrayList<>();
    @Override
    public void Subscribe(Observer o) {
        observers.add(o);
    }
    @Override
    public void UnSubscribe(Observer o) {
        observers.remove(o);
    }
    @Override
    public void NotifyUsers(String message) {
        for(Observer user : observers) {
            user.update(message);
        }
    }
    public void PostMessage(String message) {
        NotifyUsers(message);
    }


}
