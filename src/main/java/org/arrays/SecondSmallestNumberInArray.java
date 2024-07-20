package org.arrays;

public class SecondSmallestNumberInArray {
    public static void main(String[] args) {
        int ar[] = {3, 4, 7, 8, 1, 9,};
        System.out.println("The Second smallest number = " + secondSmallNumber(ar, ar.length));
    }

    public static int secondSmallNumber(int arr[], int len) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[len - 2];
    }
}
