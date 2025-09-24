package SingletonPattern;

public class Single {
    public Single instance;
    public Single getInstance() {
        if(instance == null) {
            instance = new Single();
        }
        return instance;
    }
    public void info(String message) {
        System.out.println("Message [info] :" + message);
    }
    public void error(String message) {
        System.out.println("Message [error] :" + message);
    }
    public void warning(String message) {
        System.out.println("Message [warning] :" + message);
    }
}
