package org.programs;

import java.util.Scanner;

public class LeapYear {

    // To find the leap year by  using this method
    public static void isLeapYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("leap year");
        } else {
            System.out.println("not a leap year");
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = s.nextInt();
        isLeapYear(year);
    }
}
