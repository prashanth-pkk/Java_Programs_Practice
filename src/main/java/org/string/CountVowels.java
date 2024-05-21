package org.string;

import java.util.Locale;
import java.util.Scanner;

public class CountVowels {

    // method to find the vowel from the word/sentences
    public static int count_Vowels(String str) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println("Enter the String");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String str = string.toLowerCase(Locale.ROOT);
        System.out.println(count_Vowels(str));
    }
}
