package org.arrays;

public class PrintDiagonalArray {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                if (row == col || row + col == arr.length - 1) {
                    System.out.print(arr[row][col] + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
