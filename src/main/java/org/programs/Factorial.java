package org.programs;

public class Factorial {
    public void fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial = " + fact);
    }

    public static void main(String[] args) {
        new Factorial().fact(5);
    }
}
