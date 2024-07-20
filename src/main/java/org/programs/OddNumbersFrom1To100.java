package org.programs;

import java.util.Scanner;

public class OddNumbersFrom1To100 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        System.out.println("The odd numbers from 1 to 100");
        isOddNumbers(number);
    }

    public static void isOddNumbers(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
    }
}
