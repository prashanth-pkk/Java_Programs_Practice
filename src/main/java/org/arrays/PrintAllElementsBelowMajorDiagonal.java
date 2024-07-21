package org.arrays;

public class PrintAllElementsBelowMajorDiagonal {
    public static void main(String[] args) {
        int arr[][] = {{2, 5, 7}, {4, 6, 7}, {8, 9, 0}};
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                if (row >= col) {
                    System.out.print(arr[row][col]+" ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
