package loopsTaskPackage;

import java.util.Scanner;

public class Task12Cls {
    public static void main(String[] args) {

        //Kvadratlarin cemi
        //Faktoriallarin kvadratlari ceminin tapilmasi

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the number ");
        int n = scanner.nextInt();
        long sum =0;
        if (n>=1 && n<=1000000){
            for (int i = 1; i <=n; i++) {
                sum+=(long) i*i;
            }
            System.out.println(sum);
        }

    }


}
