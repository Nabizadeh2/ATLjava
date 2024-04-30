package lesson22;

import java.util.Arrays;

public class Selection {

    public static void main(String[] args) {
        int[] arr = {34,23,46,67,89,90,31};
        System.out.println("Orjinal array : " +  Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted array:");

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
                // System.out.println("Orjinal array : " +  Arrays.toString(arr));
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;

            }
            System.out.println(Arrays.toString(arr));

        }
    }
}
