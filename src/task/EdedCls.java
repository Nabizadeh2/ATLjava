package task;

import java.util.Scanner;

public class EdedCls {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int eded= scanner.nextInt();

        int birinci=eded/100;
        int axirinci =eded%10;

        if(birinci==axirinci){
            System.out.println("=");

        }else if (birinci>axirinci){
            System.out.println(birinci);

        }else {
            System.out.println(axirinci);


        }


    }
}
