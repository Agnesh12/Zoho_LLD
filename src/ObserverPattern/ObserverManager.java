package ObserverPattern;

public class ObserverManager {
    public static void main(String[] args) {
        User user1 = new User("Agnesh");
        User user2 = new User("Suresh");
        Topic topic = new Topic();
        topic.Subscribe(user1);
        topic.Subscribe(user2);
        topic.PostMessage("Welcome to My Channel");
        topic.UnSubscribe(user2);
        topic.PostMessage("Welcome To My Channel");
    }
}
