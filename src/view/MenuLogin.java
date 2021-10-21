package view;

import controller.ManagerLogin;

import java.io.IOException;
import java.util.Scanner;

public class MenuLogin {
    public static void menu() throws IOException, ClassNotFoundException {
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
                        ManagerLogin.login();
                        break;
                    case 2:
                        ManagerLogin.signUp();
                        break;
                }
            } catch (Exception ex) {
                System.out.println("nhấn 1 hoặc 2");
            }
        }
    }
}
