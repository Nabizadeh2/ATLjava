package lesson16;

import java.util.Scanner;

public class Qonsu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Arrayin olcusunu daxil edin");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (i>1 ){
                if (arr[i-1]>arr[i-2] &&arr[i-1]>arr[i]){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
    }

