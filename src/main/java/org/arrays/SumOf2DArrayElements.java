package org.arrays;

public class SumOf2DArrayElements {
    public static void main(String[] args) {
        int ar[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                sum += ar[i][j];
            }
        }
        System.out.println("The sum of the elements = " + sum);
    }
}
