package edu.charlotte.algorithms.recursion;

import java.util.Scanner;

public class PrintOneToNNumbersUsingBacktracking {
    public static void printNumber(int index) {
        if(index < 1)
            return;
        printNumber(index - 1);
        System.out.println(index);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter till which number you want to print in ascending order: ");
        int limit = scan.nextInt();
        printNumber(limit);
        scan.close();
    }
}
