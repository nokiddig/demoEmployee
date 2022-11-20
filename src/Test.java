package src;

import src.model.Employee;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        EmployeeManage manager = new EmployeeManage();
        String menu = "1.Show\n" +
                "2.Add employee\n" +
                "3.Delete employee\n" +
                "Input your request.";
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true){
            System.out.println(menu);
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    manager.Show();
                    break;
                case 2:
                    manager.add();
                    break;
                case 3:
                    manager.delete();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
