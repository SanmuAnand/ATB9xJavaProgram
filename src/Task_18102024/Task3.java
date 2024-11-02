package Task_18102024;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
//        Write a program that converts between different units (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
//                Input. -
//                choice - 1 - km → m, km → 1km
//        choice - 2 - f → c, f → c
        Scanner sc = new Scanner(System.in);

        // Display conversion options
        System.out.println("Select the conversion you want to perform:");
        System.out.println("1 - Kilometers to Miles");
        System.out.println("2 - Fahrenheit to Celsius");
        System.out.print("Enter your choice");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                // Kilometers to Miles conversion
                System.out.print("Enter distance in kilometers: ");
                double kilometers = sc.nextDouble();
                double miles = kilometers * 0.621371; // 1 km = 0.621371 miles
                System.out.printf("%.2f kilometers is equal to %.2f miles.\n", kilometers, miles);
                break;

            case 2:
                // Fahrenheit to Celsius conversion
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = sc.nextDouble();
                double celsius = (fahrenheit - 32) * 5 / 9; // (F - 32) * 5/9 = C
                System.out.printf("%.2f degrees Fahrenheit is equal to %.2f degrees Celsius.\n", fahrenheit, celsius);
                break;

            default:
                System.out.println("Invalid choice! Please select either 1 or 2.");
                break;
        }


        sc.close();
    }

    }
}
