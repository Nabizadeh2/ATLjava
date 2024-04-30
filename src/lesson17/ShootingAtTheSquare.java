package lesson17;

import java.util.Scanner;

public class ShootingAtTheSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the coordinates of the square
        double[][] square = {{-5.0, -5.0}, {-5.0, 5.0}, {5.0, 5.0}, {5.0, -5.0}};

        // Prompt user to enter coordinates
        System.out.println("Enter the x-coordinate:");
        double x = scanner.nextDouble();
        System.out.println("Enter the y-coordinate:");
        double y = scanner.nextDouble();

        // Check if the point is inside the square
        boolean insideSquare = isInsideSquare(square, x, y);

        // Display the result
        if (insideSquare) {
            System.out.println("The point (" + x + ", " + y + ") is inside the square.");
        } else {
            System.out.println("The point (" + x + ", " + y + ") is outside the square.");
        }

        scanner.close();
    }

    // Method to check if a point is inside the square
    public static boolean isInsideSquare(double[][] square, double x, double y) {
        // Check if the point is within the boundaries of the square using cross product method
        boolean inside = true;
        for (int i = 0, j = square.length - 1; i < square.length; j = i++) {
            if (((square[i][1] > y) != (square[j][1] > y)) &&
                    (x < (square[j][0] - square[i][0]) * (y - square[i][1]) / (square[j][1] - square[i][1]) + square[i][0])) {
                inside = !inside;
            }
        }
        return inside;
    }
}


