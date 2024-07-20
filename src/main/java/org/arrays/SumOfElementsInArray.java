package org.arrays;

import java.util.Arrays;

public class SumOfElementsInArray {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 5, 8, 9, 3, 11, 55};
/*
 approach - 1
       int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("sum of the elements in the array = " + sum);
*/
//approach - 2
        long sum = Arrays.stream(arr).sum();
        System.out.println("Sum of the elements in the array = " + sum);

    }
}
