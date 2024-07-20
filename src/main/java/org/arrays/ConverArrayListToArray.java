package org.arrays;

import java.util.ArrayList;

public class ConverArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("hyderabad");
        arrayList.add("delhi");
        arrayList.add("chennai");
        arrayList.add("mumbai");

        String arr[] = new String[arrayList.size()];
        arrayList.toArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
