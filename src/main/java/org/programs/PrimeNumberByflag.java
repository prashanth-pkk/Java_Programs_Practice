package org.programs;

import java.util.Scanner;

public class PrimeNumberByflag {

    public static void isPrime(int number) {
        boolean flag = false;
        for (int i = 2; i < number; i++) {
            if (number % 2 == 0) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("not a prime number");
        } else {
            System.out.println("prime number");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int number = scanner.nextInt();
        isPrime(number);
    }
}
