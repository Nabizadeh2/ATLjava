package lessons3;

import java.util.Scanner;

public class lesson8Cls2 {
    public static void main(String[] args) {
        //Scanner scanner= new Scanner(System.in);
/*
        int[]ededler = new int[10];
        ededler[0]=5;
        ededler[1]=8;
        ededler[2]=13;
        ededler[3]=15;
        ededler[4]=19;
        ededler[5]=23;
        ededler[6]=27;
        ededler[7]=35;
        ededler[8]=45;
        ededler[9]=55;
        int cutcem=0;
        int tekcem=0;
        int cutsay=0;
        int teksay=0;

        for(int eded:ededler){
            if(eded%2==0) {
                cutcem+=eded;
                cutsay++;
            }
            else {
                tekcem+=eded;
                teksay++;
            }

        }
        System.out.println(cutcem);
        System.out.println(cutsay);
        System.out.println(tekcem);
        System.out.println(teksay);

 */

        Scanner scanner= new Scanner(System.in);
        int count= 0;
        int sum=0;
        while (scanner.hasNext()){
            int a= scanner.nextInt();
            count ++;
            sum +=a;
        }

        System.out.println(count +" "+sum);



    }



}

