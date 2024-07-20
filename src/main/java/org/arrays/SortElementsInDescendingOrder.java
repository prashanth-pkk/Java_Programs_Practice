package org.arrays;

import java.util.Arrays;

public class SortElementsInDescendingOrder {
    public static void main(String[] args) {
        int arr[] = {2, 4, 3, 8, 9, 7, 10, 18};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
