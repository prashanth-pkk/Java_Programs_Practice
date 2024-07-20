package org.arrays;

public class StringCommonElementsInArray {
    public static void main(String[] args) {
        String a[] = {"ab", "ac", "ss", "ad", "ae"};
        String b[] = {"bb", "ab", "kk", "af", "ad", "cc"};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.println("The common elements: " + a[i]);
                }
            }
        }

    }
}
