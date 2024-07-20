package org.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {

        System.out.println("Enter the length of the Array");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr1[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr1[i] = s.nextInt();
        }
        System.out.println("Copy the array");
        int arr2[] = arr1;
        for (int k = 0; k < arr1.length; k++) {
            arr2[k] = arr1[k];
        }
        System.out.println("Print the original array");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Print the copied array");
        System.out.println(Arrays.toString(arr2));
    }
}
