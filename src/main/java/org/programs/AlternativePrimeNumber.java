package org.programs;

import java.util.Scanner;

public class AlternativePrimeNumber {

    public static int isPrime(int num) {
        int i, flag = 0;
        for (i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            return 1;
        else
            return 0;
    }

    public static void printAlternativeNumbers(int num) {
        int temp = 2;
        for (int i = 2; i <= num - 1; i++) {
            if (isPrime(i) == 1) {
                if (temp % 2 == 0)
                    System.out.print(i + " ");
                temp++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = s.nextInt();
        printAlternativeNumbers(number);
    }
}
