package org.arrays;

public class CreateMirrorImageOfArray {

    public static void mirrorImage(int ar[][]) {
        for (int row = 0; row < ar.length; row++) {
            for (int col = 0; col < ar.length / 2; col++) {
                int temp = ar[row][col];
                ar[row][col] = ar[row][ar[0].length - 1 - col];
                ar[row][ar[0].length - 1 - col] = temp;
            }
        }
    }

    public static void isPrint(int ele[][]) {
        for (int i = 0; i < ele.length; i++) {
            for (int j = 0; j < ele.length; j++) {
                System.out.print(ele[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int ar[][] = {{5, 7, 9}, {1, 3, 0}, {2, 4, 6}};
        mirrorImage(ar);
        isPrint(ar);
    }
}
