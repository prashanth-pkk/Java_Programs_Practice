package org.arrays;

public class StringArrayDuplicateValues {
    public static void main(String[] args) {
        String arr[] = {"abc", "bcd", "dbc", "abd", "bdc", "bca", "dbc"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] == arr[j]) && (i != j)) {
                    System.out.println("The duplicate elements are = " + arr[j]);
                }
            }
        }
    }
}
