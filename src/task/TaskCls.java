package task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*public class TaskCls {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int a=scanner.nextInt();

            int tam =a/10;
            int qaliq=a%10;
            System.out.println(tam +" " + qaliq);
    }

}*/
public class TaskCls {/// Sadece yoxlamaq ucun yazilib
    public static void main(String[] args) {

        ArrayList<Integer>a= new ArrayList<>();
        a.add(5);
        List<Integer>b=a;
        b.add(6);
        System.out.println("a"+a+"b"+b);

    }
}