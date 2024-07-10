package org.programs;

import java.util.Scanner;

public class Palindrome {

    public static void isPalindrome(int num) {
        int sum = 0;
        int temp = num;
        while (num > 0) {
            int rem = num % 10;
            sum = (sum * 10) + rem;
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to perform Palindrome");
        int num = scanner.nextInt();
        isPalindrome(num);
    }
}
