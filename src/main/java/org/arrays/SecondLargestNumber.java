package org.arrays;

public class SecondLargestNumber {

    public static int secondLargest(int ar[], int len) {
        int temp;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        return ar[len - 2];
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 7, 9, 1, 6};
        int len = arr.length;
        System.out.println("The second largest number = " + secondLargest(arr, len));
    }
}
