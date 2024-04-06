package loopsTaskPackage;

import java.util.Scanner;

public class Task8Cls {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();

        if ( a%b !=0) {
            System.out.println(a / b + " " + a % b);
        }else{
                System.out.println("Divisible ");

        }
    }
}
