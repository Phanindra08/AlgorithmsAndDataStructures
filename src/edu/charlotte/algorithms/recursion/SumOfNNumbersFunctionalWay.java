package edu.charlotte.algorithms.recursion;

import java.util.Scanner;

public class SumOfNNumbersFunctionalWay {
    public static int sumOfNumbers(int index) {
        if(index == 0)
            return 0;
        return index + sumOfNumbers(index - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the whole number n: ");
        int n = scan.nextInt();
        scan.close();
        System.out.println("The sum of the numbers is " + sumOfNumbers(n));
    }
}
