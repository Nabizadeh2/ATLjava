package loopsTaskPackage;

import java.util.Scanner;

public class Task5Cls {
    public static void main(String[] args) {

        //Tərəflərinin uzunluğu verilmiş üçbucağın növünü müəyyənləşdirməli
        // (bərabərtərəfli, bərabəryanlı, müxtəliftərəfli).


        Scanner scanner= new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();

        if ((a==b )&&(b==c) ){
            System.out.println("1");
        }else if ((a==b)|| (b==c) || (a==c)){
            System.out.println("2");
        }else {
            System.out.println("3");
        }
    }
}