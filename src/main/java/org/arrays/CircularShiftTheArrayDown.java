package org.arrays;

public class CircularShiftTheArrayDown {

    public static void alterArray(int arr[][]) {
        for (int row = arr.length - 1; row > 0; row--) {
            for (int col = 0; col < arr.length; col++) {
                int temp = arr[row][col];
                arr[row][col] = arr[row - 1][col];
                arr[row - 1][col] = temp;
            }
        }
    }

    public static void isPrint(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = {{3, 5, 6}, {7, 4, 1}, {9, 8, 2}};
        alterArray(arr);
        isPrint(arr);
    }
}
