package lessons3;

import java.util.Scanner;

public class EkobCls {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long k = scanner.nextInt();
        long cem=0;


        for (int i = 1; i >=0; i++) {
            cem+=i;
            if (cem%k==0){
                System.out.println(i);
                break;
            }

        }
    }
}
