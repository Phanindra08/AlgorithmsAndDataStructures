package edu.charlotte.algorithms.bitmanipulation;

import java.util.Scanner;

public class BinaryNumberConversion {
    public int binaryToDecimalConversion(String number) {
        int decimalNumber = 0;
        int power = 1;
        for(int index = number.length() - 1; index >= 0; index--) {
            if(number.charAt(index) == '1')
                decimalNumber += 1 * power;
            power *= 2;
        }
        return decimalNumber;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to be converted: ");
        String number = scan.next();
        BinaryNumberConversion binaryNumberConversion = new BinaryNumberConversion();
        System.out.println(binaryNumberConversion.binaryToDecimalConversion(number));
    }
}
