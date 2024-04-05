package loopsTaskPackage;

import java.util.Scanner;

public class Task9Cls {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int x= scanner.nextInt();
        int b= scanner.nextInt();

        if (x<a || x>b){
            System.out.println("Out");
        }else {
            System.out.println("In");
        }

    }
}
