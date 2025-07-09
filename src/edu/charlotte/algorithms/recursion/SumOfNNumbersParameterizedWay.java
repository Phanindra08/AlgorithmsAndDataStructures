package edu.charlotte.algorithms.recursion;

import java.util.Scanner;

public class SumOfNNumbersParameterizedWay {
    public static void sumOfNumbers(int index, int sum) {
        if(index < 1) {
            System.out.println("The sum of the numbers is " + sum);
            return;
        }
        sumOfNumbers(index - 1, sum + index);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the whole number n: ");
        int n = scan.nextInt();
        scan.close();
        sumOfNumbers(n, 0);
    }
}
