package org.string;

import java.util.Scanner;

public class PalindromeString {

    public static void isPalindrome(String str) {
        //String org = "";
        String rev = "";
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the string");
        String str = s.nextLine();
        isPalindrome(str);

    }
}
