package org.strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Lab";
        String str2 = "Bal";

        // convert string to lower case
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() != str2.length()) {
            System.out.println("Both strings are not anagram");
        } else {
            // convert both string to array
            char ch1[] = str1.toCharArray();
            char ch2[] = str2.toCharArray();

            // Sorting the array
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            //comparing both strings
            if (Arrays.equals(ch1, ch2) == true) {
                System.out.println("Both are anagram");
            } else {
                System.out.println("Both are not anagram");
            }
        }
    }
}
