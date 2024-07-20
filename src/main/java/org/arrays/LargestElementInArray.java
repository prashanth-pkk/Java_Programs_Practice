package org.arrays;

public class LargestElementInArray {

    public static int largestNumber(int ar[]) {
        int max = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    max = ar[i];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1, 25, 7, 8, 11, 34, 67, 91, 3, 9};
        System.out.println("The largest number = " + largestNumber(arr));
    }
}
