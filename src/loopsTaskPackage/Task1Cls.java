package loopsTaskPackage;

import java.util.Scanner;

public class Task1Cls {
    public static void main(String[] args) {

        //Dörd a,b,c,d ədədləri verilmişdir. Onlardan ən böyüyünü tapın.


        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        int d= scanner.nextInt();

        if (a<d && b<d && c<d ){
            System.out.println(d);
        }else if (a<c &&b<c && d<c){
            System.out.println(c);
        }else if (a<b && c<b && d<b){
            System.out.println(b);
        }else if (a>b && a>c && a>d){
            System.out.println(a);
        }
    }
}
