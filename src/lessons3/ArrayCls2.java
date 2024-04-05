package lessons3;

import java.util.Scanner;

public class ArrayCls2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            System.out.println(n);
        }

        int i;
        for (i = 0; i < arr.length; i++) {
            if (min == arr[i]) {
                max = arr[i];
            }if (max== arr[i]) {
                min = arr[i];
            }else if (max== arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);



    }
}
