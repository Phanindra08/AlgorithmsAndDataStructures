package edu.charlotte.algorithms.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingOneSubsequenceThatSumToK {
    public static boolean oneSubsequenceThatSumToK(int index, int size, int[] inputArray, int k, List<Integer> subsequenceList, int sum) {
        // Condition Satisfied
        if(index == size) {
            if(sum == k) {
                System.out.println(subsequenceList);
                return true;
            }
            // Condition not satisfied
            return false;
        }
        subsequenceList.add(inputArray[index]);
        sum += inputArray[index];
        if(oneSubsequenceThatSumToK(index + 1, size, inputArray, k, subsequenceList, sum))
            return true;
        subsequenceList.removeLast();
        sum -= inputArray[index];
        return oneSubsequenceThatSumToK(index + 1, size, inputArray, k, subsequenceList, sum);
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
        System.out.printf("The one subsequence that sum up to K (%d) is:", k);
        oneSubsequenceThatSumToK(0, size, inputArray, k, new ArrayList<>(), 0);
    }
}
