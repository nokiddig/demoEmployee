package src;

import src.model.Employee;
import src.model.FullTime;
import src.model.PartTime;

import java.util.*;

public class EmployeeManage {
    private Map<Integer, Employee> listEmployees = new HashMap<>();
    private Integer index = 0;
    Scanner scanner = new Scanner(System.in);
    public void Show() {
        for (int i = 0; i < listEmployees.size(); i++) {
            System.out.println(listEmployees.get(i).toString());
        }
    }

    public void add() {
        System.out.println("input 1 FullTime" +
                "input 2 PartTime");
        int input = Integer.parseInt(scanner.nextLine());
        if (input == 1) {
            FullTime f = new FullTime("sy", 18, 2000000, 2.4, 2);
            listEmployees.put(index,f);
            index ++;
        }
        else {
            PartTime p = new PartTime("Cuong", 25, 200000, 10);
            listEmployees.put(index, p);
            index ++;
        }
    }

    public void delete() {
    }
}
