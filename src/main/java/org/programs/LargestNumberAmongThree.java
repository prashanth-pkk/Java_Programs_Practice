package org.programs;

import java.util.Scanner;

public class LargestNumberAmongThree {
    public static void main(String[] args) {

        // create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        double num1 = scanner.nextDouble();
        System.out.println("enter the second number");
        double num2 = scanner.nextDouble();
        System.out.println("enter the third number");
        double num3 = scanner.nextDouble();

        // find the largest number by using the max method
        double largest = Math.max(num1, Math.max(num2, num3));
        System.out.println(largest + " is the largest number");

        //close the scanner object
        scanner.close();
    }
}
