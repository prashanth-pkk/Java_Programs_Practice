package org.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {
        String arr[] = {"hyderabad", "chennai", "mumbai", "delhi"};
        ArrayList al = new ArrayList(Arrays.asList(arr));
        System.out.println(al);
    }
}
