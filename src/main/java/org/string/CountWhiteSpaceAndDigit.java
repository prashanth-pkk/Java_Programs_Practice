package org.string;

import java.util.Scanner;

public class CountWhiteSpaceAndDigit {

    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(countWhitespace_Digits(str));

    }

    // count the whitespace and digits
    public static int countWhitespace_Digits(String string){
        int count =0;
        for(int i=0; i<string.length(); i++){
            char ch = string.charAt(i);

            if(Character.isWhitespace(ch) || Character.isDigit(ch)){
                count++;
            }
        }
        return count;
    }
}
