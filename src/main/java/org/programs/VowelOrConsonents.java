package org.programs;

import java.util.Scanner;

public class VowelOrConsonents {
    public static void main(String[] args) {

        // create a scanner object to read input from the user
        System.out.println("Enter the single alphabet");
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);

        // check if the number is even or odd
        if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' ||
                letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println(letter + " is a vowel");
        } else {
            System.out.println(letter + " is a consonent");
        }

        //close the scanner
        scanner.close();
    }
}
