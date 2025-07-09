package edu.charlotte.algorithms.recursion;

import java.util.Scanner;

public class PrintNameNTimes {
    public static void printingName(int index, int limit) {
        if(index > limit)
            return;
        System.out.println("Sai Phanindra");
        printingName(index + 1, limit);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of times you want to print your name: ");
        int limit = scan.nextInt();
        scan.close();
        printingName(1, limit);
    }
}
