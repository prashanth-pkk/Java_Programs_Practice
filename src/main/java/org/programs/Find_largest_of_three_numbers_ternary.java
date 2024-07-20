package org.programs;

import java.util.Scanner;

public class Find_largest_of_three_numbers_ternary {

    public static void isLargest(int a, int b, int c) {
        int temp = a > b ? a : b;
        int largest = c > temp ? c : temp;
        System.out.println("The largest number = " + largest);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scanner.nextInt();
        System.out.println("Enter the second number");
        int b = scanner.nextInt();
        System.out.println("Enter the third number");
        int c = scanner.nextInt();
        isLargest(a, b, c);
    }
}
