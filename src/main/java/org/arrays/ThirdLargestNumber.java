package org.arrays;

public class ThirdLargestNumber {
    public static int thirdLargestNumber(int ar[], int len) {
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
        return ar[len - 3];
    }

    public static void main(String[] args) {
        int arr[] = {2, 7, 8, 1, 3};
        int len = arr.length;
        ;
        System.out.println("The third largest number = " + thirdLargestNumber(arr, len));

    }
}
