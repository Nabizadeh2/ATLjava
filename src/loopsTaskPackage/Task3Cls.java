package loopsTaskPackage;

import java.util.Scanner;

public class Task3Cls {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x= scanner.nextInt();
        int a= scanner.nextInt();
        int b= scanner.nextInt();
       if (x>=a && x<=b){
           System.out.println("Yes");
        }else{
           System.out.println("No");
       }
    }
}
