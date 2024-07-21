package org.arrays;

public class PrintAllEvenElementsOfArray {
    public static void main(String[] args) {
        int arr[][] = {{1, 3, 6, 7}, {4, 8, 6, 1}, {9, 6, 7, 3}};
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                if (arr[row][col] % 2 == 0) {
                    System.out.print(arr[row][col] + " ");
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
}
