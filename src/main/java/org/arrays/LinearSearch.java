package org.arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int search = 3;
        int element = isLinearSearch(a, search);
        System.out.println("The element " + search + " is found at " + element);
    }

    public static int isLinearSearch(int a[], int element) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
