package org.programs;

import java.util.Scanner;

public class PositiveNumberOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        double num = scanner.nextDouble();
        if (num > 0) {
            System.out.println(num + " positive number");
        } else if (num < 0) {
            System.out.println(num + " negative number");
        } else {
            System.out.println(num + " number is zero");
        }
        scanner.close();
    }
}