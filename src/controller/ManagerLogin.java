package controller;

import model.User;
import storage.ReadWriteLogin;
import view.Menu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerLogin {
    static User temp;
    static Scanner scanner = new Scanner(System.in);


    public static User getTemp() {
        return temp;
    }
    public static void login() throws IOException, ClassNotFoundException {
        while (true) {
            System.out.println("----------------------");
            System.out.println("Nhập tên đăng nhập: ");
            String userName = scanner.nextLine();
            System.out.println("Nhập mật khẩu : ");
            String password = scanner.nextLine();
            System.out.println("___________________________________________________________________");
            ArrayList<User> users = ReadWriteLogin.readFileLogin();
            for (User lg : users) {
                if (lg.getUserName().equalsIgnoreCase(userName) && lg.getPassWord().equals(password)) {
                    System.out.println("------------------------------Welcom " + userName + " -------------------------- ");
                    temp = lg;
                    Menu.menuEmployee();
                    return;
                }
            }
            System.err.println("sai mật khẩu / tên đăng nhập");
        }
    }
//    public static void login() throws IOException, ClassNotFoundException {
//        while (true) {
//            System.out.println("----------------------");
//            System.out.println("Nhập tên đăng nhập: ");
//            String userName = scanner.nextLine();
//            System.out.println("Nhập mật khẩu : ");
//            String password = scanner.nextLine();
//            System.out.println("___________________________________________________________________");
//            ReadWriteLogin.readFileLogin();
//            ArrayList<User> users = ReadWriteLogin.readFileLogin();
//            for (User user : ReadWriteLogin.users) {
//                if (user.getUserName().equalsIgnoreCase(userName) && user.getPassWord().equals(password)) {
//                    System.out.println("------------------------------Welcom " + userName + " -------------------------- ");
//                    temp = user;
//                    Menu.menuEmployee();
//                    return;
//                }
//            }
//            System.out.println("Sai mật khẩu/tên đăng nhập");
//        }
//    }

    public static void signUp() throws IOException, ClassNotFoundException {
        while (true) {
            System.out.println("-------------------");
            System.out.println("Nhập tên đăng ký : ");
            String userName = scanner.nextLine();
            System.out.println("Nhập mật khẩu : ");
            String password = scanner.nextLine();
            ReadWriteLogin.readFileLogin();
            ArrayList<User> users1 = new ArrayList<>();
            for (User lg : users1) {
                if (lg.getUserName().equals(userName)) {
                    System.err.println("Tên này đã tồn tại!!!");
                    return;
                }
            }

            System.out.println("đăng nhập để vào hệ thống");
            ReadWriteLogin.users.add(new User(userName, password));
            ReadWriteLogin.writeFileLogin();
            break;
        }
        login();
    }
//    public static void signUp() throws IOException, ClassNotFoundException {
//        while (true) {
//            System.out.println("-------------------");
//            System.out.println("nhập tên đăng ký: ");
//            String userName = scanner.nextLine();
//            System.out.println("nhập mật khẩu đăng ký: ");
//            String password = scanner.nextLine();
////            ReadWriteLogin.readFileLogin();
//            ArrayList<User> users = ReadWriteLogin.readFileLogin();
//            for (User user : users) {
//                if (user.getUserName().equals(userName)) {
//                    System.err.println("Tên đã tồn tại");
//                    return;
//                }
//            }
//            System.out.println("Đăng nhập vào hệ thống");
//            ReadWriteLogin.users.add(new User(userName, password));
//            ReadWriteLogin.writeFileLogin();
//            break;
//        }
//        login();
//    }
//    public static void removeFileLogin(String nameLogin) throws IOException, ClassNotFoundException {
//        ReadWriteLogin.readFileLogin();
//        for (int i = 0; i < ReadWriteLogin.users.size(); i++) {
//            if (ReadWriteLogin.users.get(i).getUserName().equals(nameLogin)){
//                ReadWriteLogin.users.remove(i);
//            }
//        }
//        ReadWriteLogin.writeFileLogin();
//    }
}
