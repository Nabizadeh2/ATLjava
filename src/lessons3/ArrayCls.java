package lessons3;

import java.util.Scanner;

public class ArrayCls {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 2;
        arr[1] = 45;
        arr[2] = 32;
        arr[3] = 6;
        // int max=scanner.nextInt();
        // int min=scanner.nextInt();
        int max = arr[0];
        int min = arr[0];


        int i;
        for (i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            System.out.println(max);
        }
        if (min > arr[i]) {
            min = arr[i];
        }
        System.out.println(min);

    }
}
