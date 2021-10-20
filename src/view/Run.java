package view;

import controller.ManagerEmployee;

public class Run {
    public static void main(String[] args) {
        ManagerEmployee managerEmployee = new ManagerEmployee();
        managerEmployee.addEmployee("fulltime");
//        managerEmployee.findEmployee();
//        managerEmployee.displayByStatus();
//        managerEmployee.checkStatus();
//        managerEmployee.editStatusByName();
//        managerEmployee.showByTypeEmployee();
        managerEmployee.updateEmployee();
        managerEmployee.showAll();
    }
}
