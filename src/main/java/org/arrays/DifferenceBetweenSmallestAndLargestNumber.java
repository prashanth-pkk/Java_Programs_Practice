package org.arrays;

public class DifferenceBetweenSmallestAndLargestNumber {
    public static void main(String[] args) {
        int arr[] = {4, 7, 9, 1, 14};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The max value : " + max);
        System.out.println("The min value : " + min);
        System.out.println("The difference between smallest and largest number: " + (max - min));
    }
}
