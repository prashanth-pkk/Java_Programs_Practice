package org.arrays;

public class PrintTwoDimensionalArray {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 3, 1}, {2, 5, 7}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
