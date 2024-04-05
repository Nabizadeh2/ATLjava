package loopsTaskPackage;

import java.util.Scanner;

public class Task6Cls {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();

        if (n>=1 &&n<=3){
            System.out.println("First");
        }else if (n>=4 && n<=6){
            System.out.println("Second");
        }else if (n>=7 && n<=9){
            System.out.println("Third");
        }else if (n>=10 && n<=12){
            System.out.println("Fourth");
        }
    }
}
