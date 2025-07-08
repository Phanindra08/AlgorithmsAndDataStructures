package edu.charlotte.algorithms.recursion;

import java.util.Scanner;

public class PrintOneToNNumbersUsingBackTracking {
    public static void printNumber(int index) {
        if(index < 1)
            return;
        printNumber(index - 1);
        System.out.println(index);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter till which number you want to print in ascending order: ");
        int numberOfTimes = scan.nextInt();
        printNumber(numberOfTimes);
        scan.close();
    }
}
