package org.arrays;

public class RemoveSpecificElement {
    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 1, 9};
        int remove = 5;
        System.out.println("Original array");
        printArray(arr);
        arr = removeElement(arr, remove);
        System.out.println("After removing the element");
        printArray(arr);
    }

    public static int[] removeElement(int arr[], int rem) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == rem) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return arr;
        }
        int arr1[] = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                arr1[j++] = arr[i];
            }
        }
        return arr1;
    }

    public static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}