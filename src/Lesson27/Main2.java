package Lesson27;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
         //int parsed=Integer.parseInt(String.valueOf(a));

        try {
            int number = Integer.parseInt(a);
            System.out.println("Parsed integer: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error parsing the string into an integer: " + e.getMessage());
        }
    }
}