package lessons3;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        String mystring= scanner.next();
        System.out.println(mystring);
        int myInt= scanner.nextInt();
        System.out.println(myInt);

    }
}
