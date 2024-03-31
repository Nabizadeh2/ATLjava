package task;

import java.util.Scanner;

public class AppleCls {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int student= scanner.nextInt();
        int apple= scanner.nextInt();

        int result= apple/student;
        System.out.println(result);
    }


}
