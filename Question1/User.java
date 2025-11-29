package Question1;
// create abstract class StudentManagement

public abstract class User {
    private String userID;
    private String userName;
    public User(String userID, String userName) {
        this.userID = userID;
        this.userName = userName;
    }
    public String getUserID() {
        return userID;
    }
    public String getUserName() {
        return userName;
    }
    public abstract void getRole();
}