package org.arrays;

public class PrintAllElementsAboveMajorDiagonal {
    public static void main(String[] args) {
        int k[][] = {{3, 7, 0}, {5, 8, 1}, {2, 3, 9}};
        for (int row = 0; row < k.length; row++) {
            for (int col = 0; col < k.length; col++) {
                if (row <= col) {
                    System.out.print(k[row][col] + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
