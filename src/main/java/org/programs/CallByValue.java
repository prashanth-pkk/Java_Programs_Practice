package org.programs;

/*
Primitive Types: When you pass a primitive type (e.g., int, char, boolean, etc.)
to a method, Java passes a copy of the value. This means that changes made to the
parameter inside the method do not affect the original value outside the method
*/
public class CallByValue {

    public static void callByValue(int num) {
        num = 20;
    }

    public static void main(String[] args) {

        int num = 10;
        callByValue(num);
        System.out.println(num);
    }
}
