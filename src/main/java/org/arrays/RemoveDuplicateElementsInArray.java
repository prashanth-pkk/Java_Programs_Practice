package org.arrays;

public class RemoveDuplicateElementsInArray {
    public static void main(String[] args) {
        int arr[] = {2, 2, 4, 5, 8, 9, 7};
        int len = arr.length;
        len = removeDuplicateNumber(arr, len);
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicateNumber(int arr[], int n) {
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1];
        return j;
    }
}

