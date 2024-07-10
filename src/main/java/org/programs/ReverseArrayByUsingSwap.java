package org.programs;

import java.util.Scanner;

public class ReverseArrayByUsingSwap {

    //To reverse the array
    static void reverse(int arr[]){
        int i=0, j= arr.length-1;
        int temp;
        while (i<j){
            temp =arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {

        // create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of the array");

        //length of the array
        int len = scanner.nextInt();
        int arr[] = new int[len];

        System.out.println("enter the elements");
        for(int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        // before reverse the array
        System.out.println("The original array");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //after reverse the array
        System.out.println("Reverse the array");
        reverse(arr);
        for (int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
