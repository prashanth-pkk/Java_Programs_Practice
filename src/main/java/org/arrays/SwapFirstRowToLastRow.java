package org.arrays;

public class SwapFirstRowToLastRow {
    public static void main(String[] args) {
        int arr[][] = {{2, 5, 6}, {7, 4, 2}, {9, 8, 1}};
        int row = 0;
        int row1 = arr.length - 1;
        for (int col = 0; col < arr.length; col++) {
            int temp = arr[row][col];
            arr[row][col] = arr[row1][col];
            arr[row1][col] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
