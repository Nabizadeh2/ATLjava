package task;

import java.util.Scanner;

public class TaskCls {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int a=scanner.nextInt();

            int tam =a/10;
            int qaliq=a%10;
            System.out.println(tam +" " + qaliq);


    }
    

}
