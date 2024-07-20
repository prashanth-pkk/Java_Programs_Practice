package org.programs;

import java.util.Scanner;

public class EvenNumbersFrom1To100 {

    //This method find the positive numbers
    public static void isPositiveNumber(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        System.out.println("The even numbers from 1 to 100");
        isPositiveNumber(n);
    }
}
