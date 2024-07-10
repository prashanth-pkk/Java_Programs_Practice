package org.programs;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        // create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length of the array");

        //length of the array
        int len = scanner.nextInt();

        //created new array
        int arr[] = new int[len];
        System.out.println("enter the elements one by one");
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }
        //print the original array
        System.out.println("the original array");
        System.out.println(Arrays.toString(arr));

        // Reverse the array
        System.out.println("Array in reverse order");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
