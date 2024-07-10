package org.programs;

import java.util.Scanner;

public class Even_or_Odd_by_using_Ternary {

    public static String isEvenOdd(int number) {
        String str = (number % 2 == 0) ? "even" : "odd";
        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");

        int number = scanner.nextInt();
        System.out.println(isEvenOdd(number));
    }
}
