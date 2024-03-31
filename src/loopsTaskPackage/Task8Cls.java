package loopsTaskPackage;

import java.util.Scanner;

public class Task8Cls {

    public static void main(String[] args) {

        //a və b natural ədədləri verilmişdir. a-nın b-yə bölünməsini yoxlayın.

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a= scanner.nextInt();
        int b= scanner.nextInt();

        if ( (a%b) !=0){
            System.out.println( a/b +  " "  +  a%b);
        }else {

            System.out.println( a/b +  "  Divisible " );
        }
    }
}
