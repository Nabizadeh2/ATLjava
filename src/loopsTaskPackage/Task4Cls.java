package loopsTaskPackage;

import java.util.Scanner;

public class Task4Cls {
    public static void main(String[] args) {
        //İki sıfır olmayan
        //n ve m tam ədədləri verilmişdir.
        //n ve m tam ədədləri eyni işarəlidirlərsə
        //1, əks halda
        //0 çap edin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number");
        int a= scanner.nextInt();
        int b= scanner.nextInt();

                  if ( a*b>0){
                      System.out.println("1");
                  }else {
                      System.out.println("0");
                  }





    }
}
