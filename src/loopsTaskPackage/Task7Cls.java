package loopsTaskPackage;

import java.util.Scanner;

public class Task7Cls {
    public static void main(String[] args) {

        //n tam ədədi verilmişdir. Onun müsbət, mənfi və ya
        //0-a bərabər olmasını müəyyənləşdirin.


        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number ");

        int a= scanner.nextInt();

        if (a>0){
            System.out.println("Positive");
        }else if (a==0){
            System.out.println("number is zero");
        }else {
            System.out.println("Negative");
        }
    }
}
