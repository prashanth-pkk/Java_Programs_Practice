package org.programs;

/*
Convert char to int
int to char
*/
public class Conver_Char_to_Int {
    public static void main(String[] args) {

        // convert int to char
        int i = 67;
        char ch = (char) i;   // type casting
        System.out.println("The conversion from int to char is = "+ch);

        // convert char to int
        char ch1 = 'k';
        int j = ch1;
        System.out.println("The conversion from char to int is = "+j);

    }
}