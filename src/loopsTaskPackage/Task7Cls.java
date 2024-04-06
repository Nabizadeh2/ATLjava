package loopsTaskPackage;

import java.util.Scanner;

public class Task7Cls {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();

        if (a>0) System.out.println("Positive");
        else if (a<0)System.out.println("Negative ");
        else System.out.println("number is zero");

    }
}
