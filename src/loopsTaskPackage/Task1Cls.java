package loopsTaskPackage;

import java.util.Scanner;

public class Task1Cls {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        int d= scanner.nextInt();

        if (a>b && a>c && a>d ){
            System.out.println(a);
        }else if (a<b && c<b && d<b){
            System.out.println(b);
        }else if ( c>a&& c>b && c>d){
            System.out.println(c);
        }else if (d>a && d>b && d>c){
            System.out.println(d);
        }

    }
}
