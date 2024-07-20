package org.arrays;

public class HighestElementInArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 7, 3, 4, 5};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    max = arr[i];
                }
            }
        }
        System.out.println(max);
    }
}
