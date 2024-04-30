package lesson18;

import java.util.ArrayList;
import java.util.Scanner;

public class TekCut {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println(" Birinci ededi daxil edin");
        int a= scanner.nextInt();
        System.out.println("Ikinci ededi daxil edin");
         int b= scanner.nextInt();

         eded(a,b);
    }

    public static void eded (int a,int b){
        ArrayList<Integer>arr=new ArrayList<>();
        for (int i = a; i <=b ; i++) {
            if (i%2==1){
                arr.add(i);
            }
        }
        System.out.println("Netice "+ arr);
    }
}
