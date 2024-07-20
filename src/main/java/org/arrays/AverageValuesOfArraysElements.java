package org.arrays;

public class AverageValuesOfArraysElements {
    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 8, 7, 9};
        System.out.println("The Average values of the Array = " + avgValue(arr));
    }

    public static int avgValue(int arr[]) {
        int sum = 0;
        int len = arr.length;
        ;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int average = sum / len;
        return average;
    }
}
