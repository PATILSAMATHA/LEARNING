package com.java;
import java.util.Scanner;
public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Temperature Conversion Tool!");
        System.out.println("Select an option:\n");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.print("Enter the temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.printf("%.1f°C is equivalent to %.1f°F%n", celsius, fahrenheit);
        } else if (choice == 2) {
            System.out.print("Enter the temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.printf("%.1f°F is equivalent to %.1f°C%n", fahrenheit, celsius);
	}else {
        System.out.println("Invalid choice. Please select either 1 or 2.");
    }

    scanner.close();
}

	private static double fahrenheitToCelsius(double fahrenheit) {
		// TODO Auto-generated method stub
		return(fahrenheit - 32) * 5 / 9 ;
	}

	private static double celsiusToFahrenheit(double celsius) {
		// TODO Auto-generated method stub
		return (celsius * 9 / 5) + 32;
	}


}
