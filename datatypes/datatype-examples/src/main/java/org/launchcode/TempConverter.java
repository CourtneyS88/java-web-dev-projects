package org.launchcode;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        //This is a program which converts farenheit to celsius.
        double fahrenheit;
        double celsius;

        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.next();
        input.close();

        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in Celsius is: " + celsius + "°C");
    }
}
