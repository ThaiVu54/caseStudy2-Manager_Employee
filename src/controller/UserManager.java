package controller;

import model.User;

import java.util.ArrayList;

public class UserManager {
    ArrayList<User> users = new ArrayList<>();

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
    public void addUser(User user){
        users.add(user);
    }
    public boolean checkUser(String name, String pass){
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName().equals(name) && users.get(i).getPassWord().equals(pass)){
                return true;
            }
        }
        return false;
    }
}
