package controller;

import model.User;

import java.util.Scanner;

public class ManagerLogin {
    static Scanner scanner = new Scanner(System.in);
    static User temp;

    public User getTemp() {
        return temp;
    }
    public static void menu(){
        while (true){
            try{
                System.out.println("--------Welcome--------");
                System.out.println("|  1. đăng nhập       |");
                System.out.println("|  2. đăng ký         |");
                System.out.println("|  Chọn để tiếp tục:  |");
                System.out.println("_______________________");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        login();
                        break;
                    case 2:
                        signUp();
                        break;
                }
            }catch (Exception e){
                System.out.println("Nhập 1 hoặc 2");
            }
        }
    }

    private static void signUp() {

    }

    private static void login() {
        while (true){
            System.out.println("--------------------");
            System.out.println("Nhập tên đăng nhập: ");
            String userName = scanner.nextLine();
            System.out.println("Nhập mật khẩu: ");
            String password = scanner.nextLine();
            System.out.println("--------------------");

        }
    }
}
