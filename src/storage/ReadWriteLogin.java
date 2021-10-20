package storage;

import model.User;

import java.io.*;
import java.util.ArrayList;

public class ReadWriteLogin {
    private static final String PATH_LOGIN = "login.txt";
    public static ArrayList<User> users = new ArrayList<>();
    public static void writeFileLogin() throws IOException {
        FileOutputStream fos = new FileOutputStream(PATH_LOGIN);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(users);
        fos.close();
        oos.close();
    }
    public static void readFileLogin() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(PATH_LOGIN);
        ObjectInputStream ois = new ObjectInputStream(fis);
        users = (ArrayList<User>) ois.readObject();
    }

    public static void removeFileLogin(String nameLogin) throws IOException, ClassNotFoundException {
        readFileLogin();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName().equals(nameLogin)){
                users.remove(i);
            }
        }
        writeFileLogin();
    }

}
