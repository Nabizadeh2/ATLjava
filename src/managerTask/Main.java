package managerTask;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employe> employees = new ArrayList<>();

        Employe employe1 = new Employe(1, "Daniel Black", 2019, "IT");
        Manager manager1 = new Manager(2, "Gusein Rahim", 2023, "Finance", "Finance");
        Director director1 = new Director(3, "Jony Mee", 2010, "Law", "Law", 10000);
        employees.add(employe1);
        employees.add(manager1);
        employees.add(director1);
        System.out.println("Employees at work:");
        showWhoIsWorking(employees);
        System.out.println(employe1.getName()+" Base salary "+employe1.calculateSalary());
        System.out.println(manager1.getName()+" Salary "+manager1.calculateSalary());
        System.out.println(director1.getName()+" Salary "+director1.calculateSalary());
    }

    public static void showWhoIsWorking(List<Employe> employees) {

    }
}




