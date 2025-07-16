package edu.charlotte.algorithms.recursion;

import java.util.Scanner;

public class CountingTheSubsequencesThatSumToK {
    public static int countingTheSubsequenceThatSumToK(int index, int size, int[] inputArray, int k, int sum) {
        // Condition Satisfied
        if(index == size) {
            if(sum == k)
                return 1;
            // Condition not satisfied
            return 0;
        }
        sum += inputArray[index];
        int countForTakeCondition = countingTheSubsequenceThatSumToK(index + 1, size, inputArray, k, sum);
        sum -= inputArray[index];
        int countForNotTakeCondition = countingTheSubsequenceThatSumToK(index + 1, size, inputArray, k, sum);
        return countForTakeCondition + countForNotTakeCondition;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] inputArray = new int[size];
        for(int index = 0; index < size; index++) {
            System.out.printf("Enter the element %d: ", index + 1);
            inputArray[index] = scan.nextInt();
        }
        System.out.print("Enter the value of K (Summation number): ");
        int k = scan.nextInt();
        scan.close();
        System.out.printf("The count of the subsequences that sum up to K (%d) is: %d", k,
                countingTheSubsequenceThatSumToK(0, size, inputArray, k, 0));
    }
}