package isci;

import java.util.Scanner;

public class IsciMaas {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Maaslari daxil edin");
        double maxSalary=-1;
        double salary;
        while (scanner.hasNext()){
            salary=scanner.nextDouble();
            if (maxSalary<salary)
                maxSalary=salary;

        }
        System.out.printf("%.2f" ,maxSalary);

    }
}
