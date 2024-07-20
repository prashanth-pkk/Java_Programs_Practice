package org.arrays;

public class SortElementsInAscendingOrder {
    public static void main(String[] args) {
        int arr[] = {3, 7, 9, 1, 6, 2, 4, 11, 8};
        int i;
        int temp = 0;
        for (i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
