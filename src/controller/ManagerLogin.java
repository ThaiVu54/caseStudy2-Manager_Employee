package controller;

import model.User;

import java.io.*;
import java.util.ArrayList;

public class ManagerLogin {
    static ArrayList<User> users = new ArrayList<>();
//    public static final String PATH_LOGIN = "login.txt";


    public static  void writeFileLogin() throws IOException {
        File file = new File("src/login.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream("src/login.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(users);
    }

    public static void readFileLogin() throws IOException, ClassNotFoundException {
        File file = new File("src/login.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        FileInputStream fis = new FileInputStream("src/login.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        users = (ArrayList<User>) ois.readObject();
        ois.close();
        fis.close();
    }

    public static void removeLogin(String nameLogin) throws IOException, ClassNotFoundException {
        readFileLogin();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName().equals(nameLogin)) {
                users.remove(i);
            }
        }
        writeFileLogin();
    }
}
