package loopsTaskPackage;

import java.util.Scanner;

public class Task11Cls {
    public static void main(String[] args) {

        //İkirəqəmli natural ədədin rəqəmlərinin cəminin kvadratını hesablayın.

        Scanner scanner= new Scanner(System.in);
        int eded = scanner.nextInt();
        int n= eded /10;
        int m= eded%10;
        int result = n+m; //esas
        System.out.println(result);
        int quvvet =2;
        int netice =1;
        for (int i = 1; i<=quvvet ; i++ ) {
            netice=netice*result;

        }
        System.out.println(netice);

    }

}
