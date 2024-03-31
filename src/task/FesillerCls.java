package task;

import java.util.Scanner;

public class FesillerCls {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nomreni daxil edin");
        int fesiller = scanner.nextInt();
        //int nomre=scanner.nextInt();
       // System.out.println(nomre/10);
        switch (fesiller){
            case 1:
                System.out.println("yaz");
                break;
            case 2:
                System.out.println("yay");
                break;
            case 3:
                System.out.println("payiz");
                break;
            case 4:
                System.out.println("qis");
                break;
            case 5:
                System.out.println("May");
                break;

            default:
                System.out.println("Bele bir ay yoxdur");
        }


    }
}

