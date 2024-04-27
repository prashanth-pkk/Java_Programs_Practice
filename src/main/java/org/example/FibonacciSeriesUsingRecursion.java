package org.example;

import java.util.Scanner;

public class FibonacciSeries {
   static int num1 =0;
    static int num2 =1;
    static int num3=0;
    public static void fibonacciNumber(int number){
        if (number >0) {
            num3 = num1+num2;
            num1= num2;
            num2 = num3;
            System.out.print(" "+num3);
            fibonacciNumber(number-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        System.out.print(num1+" "+num2);
        fibonacciNumber(number-2);
    }
}
