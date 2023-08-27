package org.launchcode;

import java.util.Scanner;

public class MilesDriven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles you drove : ?");
        Double miles = input.nextDouble();
        System.out.println("how many gallons of gas did you use ?");
        Double gallons = input.nextDouble();
        Double milesPerGallons = miles / gallons;
        System.out.println(" You drove " + milesPerGallons + " miles per gallons");
    }
}
