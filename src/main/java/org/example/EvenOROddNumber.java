package org.example;

import java.util.Scanner;

public class EvenOROddNumber {
    public static void main(String[] args) {

        // create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();

        // check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " The number is even");
        } else {
            System.out.println(number + " The number is odd");
        }

        //close the scanner
        scanner.close();
    }
}
