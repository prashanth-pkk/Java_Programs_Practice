package org.example;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    // By using this method, will find the sum of the natural numbers till nth number
    public static int sumOfNaturalNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int number = scanner.nextInt();
        System.out.println("The total = ");
        System.out.print(sumOfNaturalNumber(number));
    }
}
