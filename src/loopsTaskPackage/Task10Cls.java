package loopsTaskPackage;

import java.util.Scanner;

public class Task10Cls {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int m= scanner.nextInt();
        int netice=n*m;
        System.out.println(netice);
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                System.out.print("#");
            }
            System.out.println();
        }



    }
}
