package lesson22;

import java.util.Scanner;

public class EdediOrta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];


        System.out.println("Enter the elements of the array:");

        int steps = 0;

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            array[i] = scanner.nextInt();
            steps++;
        }

        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        boolean found = false;


        for (int i = 0; i < size; i++) {
            steps++;
            if (array[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element found!");
        } else {
            System.out.println("Element not found!");
        }

        System.out.println("Total steps taken for search: " + steps);


    }
    }







