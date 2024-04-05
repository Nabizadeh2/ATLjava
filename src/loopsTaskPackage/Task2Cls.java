package loopsTaskPackage;

import java.util.Scanner;

public class Task2Cls {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int eded = scanner.nextInt();

        if(eded%2==0){
            System.out.println("EVEN");
        }else if (!(eded%2==0)){
            System.out.println("ODD");

        }
    }
}
