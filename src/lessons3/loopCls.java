package lessons3;

import java.util.Scanner;

public class loopCls {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
         int i =0;
        do {
            n/=10;
            i++;
        }while (n!=0);

        System.out.println(i);
    }
}
