package org.arrays;

public class OddAndEvenNumbers {

    public static void oddAndEvenNumber(int[] num) {
        System.out.println("Even numbers ");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.print(num[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Odd numbers");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                System.out.print(num[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 4, 7, 5, 9};
        oddAndEvenNumber(arr);
    }
}
