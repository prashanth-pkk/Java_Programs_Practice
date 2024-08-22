package org.strings;

public class CountTotalNumberOfCharactersInString {
    //To count the total number of characters in String
    public static void main(String[] args) {
        String str = "count the total number of characters in string";
        char[] arr = str.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        System.out.println(count);
    }
}
