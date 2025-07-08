package edu.charlotte.algorithms.recursion;

import java.util.Scanner;

public class PrintNameNTimes {
    public static void printingName(int index, int numberOfTimes) {
        if(index > numberOfTimes)
            return;
        System.out.println("Sai Phanindra");
        printingName(index + 1, numberOfTimes);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of times you want to print your name: ");
        int numberOfTimes = scan.nextInt();
        printingName(1, numberOfTimes);
        scan.close();
    }
}
