package task;

import java.util.Scanner;

public class CalculatorCls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nomreni daxil edin");
        int menu = scanner.nextInt();

        int a= scanner.nextInt();
        int b= scanner.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Topla" + topla(a,b));
                break;
            case 2:
                System.out.println("Cixma" + cixma(a,b));

                break;
            case 3:
                System.out.println("Vurma" +   vurma(a,b));

                break;
            case 4:
                System.out.println("Bolme" +  bolme(a,b));

                break;

        }
    }
    public static int topla(int a,int b){
        int cem =a+b;
        return cem;
    }
    public static int cixma(int a,int b){
        int ferq =a-b;
        return ferq;
    }

    public static int vurma(int a,int b){
        int hasil =a*b;
        return hasil;
    }
    public static int bolme(int a,int b){
        int qismet =a/b;
        return qismet;
    }

}

