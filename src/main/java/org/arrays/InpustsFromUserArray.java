package org.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InpustsFromUserArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
/*        System.out.println("The array ");
        for (int a : arr) {
            System.out.print(a + " ");
        }*/
        System.out.println("The array");
        System.out.println(Arrays.toString(arr));
    }
}
