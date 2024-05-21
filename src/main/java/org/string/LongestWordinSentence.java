package org.string;

import java.util.Scanner;

// Find the longest word in the sentence
public class LongestWordinSentence {
    public static void main(String[] args) {
        System.out.println("Enter the sentence");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String maxWord = "";
        String words[] = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= maxWord.length()) {
                maxWord = words[i];
            }
        }
        System.out.println(maxWord);
    }
}
