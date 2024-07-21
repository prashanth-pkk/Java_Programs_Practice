package org.arrays;

public class CircularShiftTheArrayLeft {

    public static void arrayAlter(int ele[][]) {
        for (int row = 0; row < ele.length; row++) {
            for (int col = 0; col < ele.length - 1; col++) {
                int temp = ele[row][col];
                ele[row][col] = ele[row][col + 1];
                ele[row][col + 1] = temp;
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
        int ar[][] = {{3, 5, 7}, {2, 3, 8}, {9, 1, 4}};
        arrayAlter(ar);
        isPrint(ar);
    }
}
