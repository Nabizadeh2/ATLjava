package loopsTaskPackage;

import java.util.Scanner;

public class Task2Cls {
    public static void main(String[] args) {

        //n natural ədədi verilmişdir. Onun cüt və ya tək olmasını yoxlayın.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int eded = scanner.nextInt();

        if(eded%2==0){
            System.out.println("EVEN");
        }else if (!(eded%2==0)){
            System.out.println("ODD");

        }
    }
}
