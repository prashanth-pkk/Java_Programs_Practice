package org.arrays;

public class SwapFirstColToLastCol {

    public static void isSwap(int arr[][]) {
        int col = 0;
        int col1 = arr.length - 1;
        for (int row = 0; row < arr.length; row++) {
            int temp = arr[row][col];
            arr[row][col] = arr[row][col1];
            arr[row][col1] = temp;
        }
    }

    public static void isPrinit(int ele[][]) {
        for (int i = 0; i < ele.length; i++) {
            for (int j = 0; j < ele.length; j++) {
                System.out.print(ele[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int ar[][] = {{3, 6, 8}, {2, 5, 1}, {9, 7, 4}};
        isSwap(ar);
        isPrinit(ar);
    }
}
