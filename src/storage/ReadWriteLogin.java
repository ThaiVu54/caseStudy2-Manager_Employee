package storage;

import model.User;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ReadWriteLogin {
    private static final String PATH_LOGIN = "login.txt";
    ArrayList<User> users = new ArrayList<>();
    public void writeFileLogin() throws IOException {
        FileOutputStream fos = new FileOutputStream(PATH_LOGIN);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(users);
        fos.close();
        oos.close();
    }
}
