package org.arrays;

import java.util.Arrays;

public class CountElementsInArray {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 1, 3, 4, 8, 9, 9, 6, 5, 3};

        //approach -1

        long count = Arrays.stream(arr).count();
        System.out.println("Number of elements in the Array = " + count);

       /*
        approach - 2
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        System.out.println("Number of elements in the Array = " + count);
        */


        /*
         * approach -3
         * System.out.println("Number of elements in the Array = "+ arr.length);
         * */

    }
}
