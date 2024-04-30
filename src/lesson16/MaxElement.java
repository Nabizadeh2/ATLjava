package lesson16;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Arrayin olcusunu daxil edin");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int maxEl=arr[0];
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            arr[i]= scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxEl){
                maxEl=arr[i];
               count=i+1;
            }
        }
        System.out.println(count);
        System.out.println(maxEl);
    }
}
