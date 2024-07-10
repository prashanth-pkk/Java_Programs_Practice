package org.example;

import java.util.Scanner;

public class PrimeNumber {

    // The number which is divisible by 1 and itself that number is prime number
    //This method is find the prime number
    public static void primeNumberOrNot(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) { //number is divisible or not
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("The number is a prime number = " + number);
        } else {
            System.out.println("The number is not a prime number = " + number);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find the prime number or not");
        int number = scanner.nextInt();
        primeNumberOrNot(number);
    }
}
