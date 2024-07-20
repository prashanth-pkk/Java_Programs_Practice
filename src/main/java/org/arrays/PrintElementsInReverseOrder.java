package org.arrays;

import java.util.Arrays;

public class PrintElementsInReverseOrder {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("print the original array");
        Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
        System.out.println();
        System.out.println("Print reverse Array ");
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
    }
}
