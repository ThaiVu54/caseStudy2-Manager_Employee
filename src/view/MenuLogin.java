package view;

import controller.ManagerLogin;
import controller.UserManager;
import model.User;

import java.io.IOException;
import java.util.Scanner;

public class MenuLogin {
    private static UserManager userManager = new UserManager();
    private static Scanner scanner = new Scanner(System.in);
    public static void menu() throws IOException, ClassNotFoundException {
        ManagerLogin login = new ManagerLogin();

        while (true) {
            try {
                System.out.println("--------Welcome--------");
                System.out.println("|  1. đăng nhập       |");
                System.out.println("|  2. đăng ký         |");
                System.out.println("|  Chọn để tiếp tục:  |");
                System.out.println("_______________________");
                Scanner scanner = new Scanner(System.in);
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Nhập vào tài khoản:");
                        String nickName = scanner.nextLine();
                        System.out.println("Nhập vào password:");
                        String password = scanner.nextLine();
                        if (userManager.checkUser(nickName,password)){
                            Menu.menuEmployee();
                        }else System.out.println("Tài khoản/mật khẩu sai");
                        break;
                    case 2:
                        userManager.addUser(createUser());
                        break;
                }
            } catch (Exception ex) {
                System.out.println("nhấn 1 hoặc 2");
            }
        }
    }
    public static User createUser(){
        User user = new User();
        System.out.println("----------------------");
        System.out.println("Nhập tên đăng nhập: ");
        String userName = scanner.nextLine();
        System.out.println("Nhập mật khẩu : ");
        String password = scanner.nextLine();
        System.out.println("___________________________________________________________________");
        user.setUserName(userName);
        user.setPassWord(password);
        return user;
    }

}
