package lessons3;

import java.util.Scanner;

public class QarpizCls {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        int max = 0;
         int min =30000;
        for (int i = 0; i < num; i++) {
            int kq = scanner.nextInt();
            if (kq>max){
                max=kq;

            } if (min>kq) {

                min = kq;
            }
            }
        if (num<2){
            System.out.println("Ooops!");
        }else {
            System.out.println(min +" "+  max);
        }


    }
}
