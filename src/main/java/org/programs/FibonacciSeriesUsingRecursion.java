package org.programs;

import java.util.Scanner;

public class FibonacciSeriesUsingRecursion {
   static int num1 =0;
    static int num2 =1;
    static int num3=0;

    // Recurssion
    public static void fibonacciNumber(int number){
        if (number >0) {
            num3 = num1+num2;
            num1= num2;
            num2 = num3;
            System.out.print(" "+num3);

            // calling the method recursively
            fibonacciNumber(number-1);
        }
    }

    public static void main(String[] args) {

        // create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        System.out.print(num1+" "+num2);

        //number-2 becuase two numbers already printed
        fibonacciNumber(number-2);

        //close the scanner class
        scanner.close();
    }
}
