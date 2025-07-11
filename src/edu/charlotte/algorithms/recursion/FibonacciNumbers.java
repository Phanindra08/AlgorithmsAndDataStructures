package edu.charlotte.algorithms.recursion;

import java.util.Scanner;

public class FibonacciNumbers {
    public static int fibonacciNumber(int number) {
        if(number <= 1)
            return number;
        return fibonacciNumber(number - 1) + fibonacciNumber(number - 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the fibonacci number you want to be printed: ");
        int number = scan.nextInt();
        scan.close();
        System.out.printf("The fibonacci number of %d is: %d", number, fibonacciNumber(number));
    }
}
