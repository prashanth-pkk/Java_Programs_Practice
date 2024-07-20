package org.programs;

import java.util.Scanner;

public class ReverseNumber {

    public static void isReverse(int num) {
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        System.out.println("The number is reversed = " + rev);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = s.nextInt();
        isReverse(number);
    }
}
