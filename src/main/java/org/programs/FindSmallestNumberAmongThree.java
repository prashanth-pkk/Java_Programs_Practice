package org.programs;

import java.util.Scanner;

public class FindSmallestNumberAmongThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        System.out.println("Enter third number");
        int c = scanner.nextInt();

        int d = c < (a < b ? a : b) ? c : ((a < b) ? a : b);
        System.out.println("Find the Smallest number = " + d);
    }
}
