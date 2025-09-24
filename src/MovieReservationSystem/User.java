package MovieReservationSystem;

public class User {
    private int user_Id;
    private String userName;
    private String password;
    public User(int user_Id, String userName, String password) {
        this.user_Id = user_Id;
        this.userName = userName;
        this.password = password;
    }
    public void setUser_Id() {
        this.user_Id = user_Id;
    }
    public int getUser_Id() {
        return user_Id;
    }
    public void setUserName() {
        this.userName = userName;
    }
    public String getUserName() {
        return userName;
    }
    public void setPassword() {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

}
