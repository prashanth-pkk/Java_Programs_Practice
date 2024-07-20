package org.programs;

import java.util.Scanner;

/*if and only if the square of the given number ends with the same number itself.
 25, 76 are automorphic numbers because their square is 625 and 5776 and ends with 25, 76*/
public class AutomorphicNumber {

    public static boolean isAutomorphicNumber(int num) {
        int square = num * num;
        while (num > 0) {
            if (num % 10 != square % 10)
                return false;
            num = num / 10;
            square = square / 10;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
        System.out.println(isAutomorphicNumber(num) ? "Automorphic" : "notautomorphic");
    }
}
