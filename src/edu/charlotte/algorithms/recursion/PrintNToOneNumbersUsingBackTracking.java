package edu.charlotte.algorithms.recursion;

import java.util.Scanner;

public class PrintNToOneNumbersUsingBackTracking {
    public static void printNumber(int index, int numberOfTimes) {
        if(index > numberOfTimes)
            return;
        printNumber(index + 1, numberOfTimes);
        System.out.println(index);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter from which number you want to print till 1 in descending order: ");
        int numberOfTimes = scan.nextInt();
        printNumber(1, numberOfTimes);
        scan.close();
    }
}
