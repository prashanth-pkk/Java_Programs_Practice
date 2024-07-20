package org.arrays;

import org.jetbrains.annotations.NotNull;

public class SmallestElementInArray {
    public static int min(@NotNull int ar[]) {
        int min = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] < ar[j]) {
                    min = ar[i];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{10, 4, 7, 9, 3, 8, 5};
        System.out.println(min(arr));
    }
}
