package edu.charlotte.algorithms.bitmanipulation;

import java.util.Scanner;

public class DecimalNumberConversion {
    public String decimalToBinaryConversion(int number) {
        StringBuilder resultantString = new StringBuilder();
        while(number != 0) {
            resultantString.append((number %2 == 0)? '0' : '1');
            number /= 2;
        }

        resultantString.reverse();
        return resultantString.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to be converted: ");
        int number = scan.nextInt();
        DecimalNumberConversion decimalNumberConversion = new DecimalNumberConversion();
        System.out.println(decimalNumberConversion.decimalToBinaryConversion(number));
    }
}
