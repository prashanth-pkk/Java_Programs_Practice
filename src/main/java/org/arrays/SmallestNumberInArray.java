package org.arrays;

public class SmallestNumberInArray {
    public static void main(String[] args) {
        int small[] = new int[]{6, 5, 7, 8, 3, 9};
        System.out.println("The smallest number = " + smallestNumber(small));
    }

    public static int smallestNumber(int[] ar) {
        int min = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] < ar[j]) {
                    min = ar[i];
                }
            }
        }
        return min;
    }
}
