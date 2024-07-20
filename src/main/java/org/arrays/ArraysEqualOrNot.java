package org.arrays;

public class ArraysEqualOrNot {

    /*
     * int a[] = {1,2,3}
     * int b[] = {1,2,3}  --Arrays are equal
     *
     * int a[] = {2,1,3}
     * int b[] ={1,2,3} ---Arrays are not equal
     *
     * int a[] = {1,2,3,4}
     * int b[] = {1,2,3} ---Arrays are not equal
     *
     * */
    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4};
        int b[] = {5, 4, 6, 7};

        boolean result = true;
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    result = false;
                }
            }
        } else {
            result = false;
        }
        if (result == true) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}
