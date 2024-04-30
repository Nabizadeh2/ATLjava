package lesson18;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("gunun nomresini  daxil edin");
        int day = scanner.nextInt();
        switch (day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday ");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            case 8:
                System.out.println("Avqust");
                break;
            case 9:
                System.out.println("Sentyabr");
                break;
            case 10:
                System.out.println("Oktyabr");
                break;
            case 11:
                System.out.println("Noyabr");
                break;

            default:
                System.out.println("Bele bir ay yoxdur");
        }


        if (day==1){
            System.out.println("Do hom work");
        }else if (day==2){
            System.out.println("go to course ");
        }else if (day==3){
            System.out.println("day of rest");
        }else if (day ==3){
            System.out.println("I will go to consert");
        }else if (day==4){
            System.out.println("go to school");
        }else if (day==5){
            System.out.println("code day");
        }else if (day==6){
            System.out.println("day off");
        }else if (day==7){
            System.out.println("day off2");
        }


    }


}
