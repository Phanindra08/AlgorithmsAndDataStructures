package edu.charlotte.algorithms.recursion;

import java.util.Scanner;

public class PrintNToOneNumbersUsingBackTracking {
    public static void printNumber(int index, int limit) {
        if(index > limit)
            return;
        printNumber(index + 1, limit);
        System.out.println(index);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter from which number you want to print till 1 in the descending order: ");
        int limit = scan.nextInt();
        scan.close();
        printNumber(1, limit);
    }
}
