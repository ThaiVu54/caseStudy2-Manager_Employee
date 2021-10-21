package view;

import controller.ManagerEmployee;

import java.util.Scanner;

public class Menu {
    private static final String PATH_LOGIN ="file.txt";
    static Scanner scanner = new Scanner(System.in);

    public static void menuEmployee() {
        ManagerEmployee managerEmployee = new ManagerEmployee(PATH_LOGIN);
        while (true) {
            try {
                System.out.println("___________________________________________________________________");
                System.out.println("1.Thêm nhân viên                    | 9.Trở Lại đăng nhập         |");
                System.out.println("2.Cập nhật nhân viên                | 10.Show tài khoản người dùng|");
                System.out.println("3.Tìm kiếm nhân viên                | 11.Thoát                    |");
                System.out.println("4.Kiểm tra trạng thái nhân viên                                   |");
                System.out.println("5.Xóa nhân viên                                                   |");
                System.out.println("6.Hiển thị nhân viên theo loại                                   |");
                System.out.println("7.Hiển thị nhân viên theo trạng thái                              |");
                System.out.println("8.Hiện thị thông tin nhân viên                                    |");
                System.out.println("__________________________________________________________________|");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("1. Thêm nhân viên fulltime");
                        System.out.println("2. Thêm nhân viên parttime");
                        int choose = Integer.parseInt(scanner.nextLine());
                        if (choose == 1) {
                            managerEmployee.addEmployee("fulltime");
                        } else {
                            managerEmployee.addEmployee("parttime");
                        }
                        break;
                    case 2:
                        managerEmployee.updateEmployee();
                        break;
                    case 3:
                        managerEmployee.findEmployee();
                        break;
                    case 4:
                        managerEmployee.checkStatus();
                        break;
                    case 5:
                        managerEmployee.removeEmployee();
                        break;
                    case 6:
                        managerEmployee.showByTypeEmployee();
                        break;
                    case 7:
                        managerEmployee.displayByStatus();
                        break;
                    case 8:
                        managerEmployee.showAll();
                        break;
                    case 9:
//                        trở lại đăng nhập
                        break;
                    case 10:
//                        show tai khoản người dung
                        break;
                    case 11:
                        //thoat
                        break;
                }
            } catch (Exception e) {
                System.out.println("Nhập số để chọn");
            }
        }
    }
}
