package org.programs;

import java.util.Scanner;

public class LargestNumberAmongThreeByUsingEquals {
    public static void main(String[] args) {

        // create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        double num1 = scanner.nextDouble();
        System.out.println("enter the second number");
        double num2 = scanner.nextDouble();
        System.out.println("enter the third number");
        double num3 = scanner.nextDouble();

        // find the largest number by using equals
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the largest number");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the largest number");
        } else {
            System.out.println(num3 + " is the largest number");
        }

        //close the scanner class
        scanner.close();
    }
}
