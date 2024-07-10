package org.strings;

import java.util.Scanner;

// smallest word in the sentence
public class SmallestWordinSentence {
    public static void main(String[] args) {
        System.out.println("Enter the sentence");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String str[] = s.split(" ");
        String smallWord = str[0];

        for (int i = 0; i < str.length; i++) {
            if (str[i].length() < smallWord.length()) {
                smallWord = str[i];
            }
        }
        System.out.println("The smallest sentence " + smallWord);
    }
}
