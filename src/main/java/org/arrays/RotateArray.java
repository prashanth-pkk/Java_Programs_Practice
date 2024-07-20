package org.arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        //int arr[] = new int[] {1,2,3,4,5};
        int arr[] = {1, 2, 3, 4, 5};
        int n = 2;
        System.out.println("print the original array");
        System.out.println(Arrays.toString(arr));

        //Rotate the given array n time for left side
        for (int i = 0; i < n; i++) {
            int j, first;
            first = arr[0];
            for (j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            //assign first value to the last array element
            arr[j] = first;
        }
        System.out.println("print the rotate array");
        System.out.println(Arrays.toString(arr));
    }
}
