package random;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {


        int randomNum=(int)(Math.random()*100);
        Scanner scanner= new Scanner(System.in);
        System.out.println("Adinizi daxil edin");
        String a= scanner.nextLine();
        System.out.println(a);

        do {
            int num= scanner.nextInt();

            if(num<randomNum){
                System.out.println("kicikdir ");
            }else if (num>randomNum){
                System.out.println("boyukdur");
            }else {
                System.out.println("Tebrikler janim benim");
                break;
            }

        }while (true);


    }

    public void nextBytes(byte[] bytes) {
    }
}
