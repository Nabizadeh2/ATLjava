package loopsTaskPackage;

import java.util.Scanner;

public class Task3Cls {
    public static void main(String[] args) {
       //x-in [a ; b ] intervalina daxil oldugunu teyin.x ededi o zaman [a;b] intervalina
        // daxildir ki,a<=x<=b olsun


        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int x= scanner.nextInt();
        int a= scanner.nextInt();
        int b= scanner.nextInt();

       if (a<=x && x<=b){
           System.out.println("Yes");

        }else if (!(a<=x && x<=b)){
           System.out.println("No");
       }
    }
}
