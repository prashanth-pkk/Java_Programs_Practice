package org.string;

import java.util.Scanner;

public class SwapCaseOfString {

    //swap the case of the String
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                str += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                str += Character.toUpperCase(ch);
            } else {
                str += ch;
            }
        }
        System.out.println(str);
    }
}
