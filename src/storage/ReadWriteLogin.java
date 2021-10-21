package storage;

public class ReadWriteLogin {
//    public static final String PATH_LOGIN = "login.txt";
//    public static ArrayList<User> users = new ArrayList<>();
//
//    public static void writeFileLogin() throws IOException {
//        File file = new File(PATH_LOGIN);
//        if (!file.exists()){
//            file.createNewFile();
//        }
//        FileOutputStream fos = new FileOutputStream(PATH_LOGIN);
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(users);
//        oos.close();
//        fos.close();
//    }
//    public static ArrayList<User> readFileLogin() throws IOException, ClassNotFoundException {
//        File file = new File(PATH_LOGIN);
//        if (!file.exists()) {
//           file.createNewFile();
//        }
//        FileInputStream fis = new FileInputStream(PATH_LOGIN);
//        ObjectInputStream ois = new ObjectInputStream(fis);
//        users = (ArrayList<User>) ois.readObject();
//        ois.close();
//        fis.close();
//        return users;
//    }


//    public static void removeFileLogin(String nameLogin) throws IOException, ClassNotFoundException {
//        readFileLogin();
//        for (int i = 0; i < users.size(); i++) {
//            if (users.get(i).getUserName().equals(nameLogin)){
//                users.remove(i);
//            }
//        }
//        writeFileLogin();
//    }

}
