package model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
    List<User> users = new ArrayList<>();
    private String userName;
    private String passWord;
    private String role;

    public void addUser(User user){
        users.add(user);
    }
    public boolean checkUser(String userName, String passWord){
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName().equals(userName)){
                return true;
            }
        }
        return false;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public User() {
    }

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}

