package storage;

import model.NhanVien;

import java.io.*;
import java.util.ArrayList;

public class ReadWriteEmployee {
    public static final String PATH_EMPLOYEE = "employee.txt";
    public static ArrayList<NhanVien> employees = new ArrayList<>();

    public void writeFileEmployee() throws IOException {
        File file = new File(PATH_EMPLOYEE);
        if (!file.exists()){
            file.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(PATH_EMPLOYEE);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(employees);
        fos.close();
        oos.close();
    }

    public ArrayList<NhanVien> readFileEmployee() throws IOException, ClassNotFoundException {
        File file = new File(PATH_EMPLOYEE);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileInputStream fis = new FileInputStream(PATH_EMPLOYEE);
        ObjectInputStream ois = new ObjectInputStream(fis);
        employees = (ArrayList<NhanVien>) ois.readObject();
        fis.close();
        ois.close();
        return employees;
    }
}
