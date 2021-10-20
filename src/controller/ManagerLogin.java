package controller;

import model.User;
import storage.ReadWriteLogin;
import view.Menu;

import java.io.IOException;
import java.util.Scanner;

public class ManagerLogin {
    static Scanner scanner = new Scanner(System.in);
    static User temp;


    public static User getTemp() {
        return temp;
    }

    public static void menu() throws IOException, ClassNotFoundException {
        while (true) {
            try {
                System.out.println("--------Welcome--------");
                System.out.println("|  1. đăng nhập       |");
                System.out.println("|  2. đăng ký         |");
                System.out.println("|  Chọn để tiếp tục:  |");
                System.out.println("_______________________");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1 -> login();
                    case 2 -> signUp();
                }
            } catch (Exception ex) {
                System.out.println("nhấn 1 hoặc 2");
            }
        }
    }


    private static void login() throws IOException, ClassNotFoundException {
        while (true) {
            System.out.println("----------------------");
            System.out.println("Nhập tên đăng nhập: ");
            String userName = scanner.nextLine();
            System.out.println("Nhập mật khẩu : ");
            String password = scanner.nextLine();
            System.out.println("___________________________________________________________________");
            ReadWriteLogin.readFileLogin();
            for (User user : ReadWriteLogin.users) {
                if (user.getUserName().equalsIgnoreCase(userName) && user.getPassWord().equals(password)) {
                    System.out.println("------------------------------Welcom " + userName + " -------------------------- ");
                    temp = user;
                    temp = user;
                    Menu.menuEmployee();
                    return;
                }
            }
            System.out.println("Sai mật khẩu/tên đăng nhập");
        }
    }

    public static void signUp() throws IOException, ClassNotFoundException {
        while (true) {
            System.out.println("-------------------");
            System.out.println("nhập tên đăng ký : ");
            String userName = scanner.nextLine();
            System.out.println("nhập mật khẩu : ");
            String password = scanner.nextLine();
            ReadWriteLogin.readFileLogin();
            for (User user : ReadWriteLogin.users) {
                if (user.getUserName().equals(userName)) {
                    System.err.println("Tên đã tồn tại");
                    return;
                }
            }
            System.out.println("Đăng nhập vào hệ thống");
            ReadWriteLogin.users.add(new User(userName, password));
            ReadWriteLogin.writeFileLogin();
            break;
        }
        login();
    }
}
