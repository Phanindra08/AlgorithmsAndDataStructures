package edu.charlotte.algorithms.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingAllTheSubsequencesThatSumToK {
    public static void subsequenceThatSumToK(int index, int size, int[] inputArray, int k, List<Integer> subsequenceList, int sum) {
        if(index == size) {
            if(sum == k)
                System.out.println(subsequenceList);
            return;
        }
        subsequenceList.add(inputArray[index]);
        sum += inputArray[index];
        subsequenceThatSumToK(index + 1, size, inputArray, k, subsequenceList, sum);
        subsequenceList.removeLast();
        sum -= inputArray[index];
        subsequenceThatSumToK(index + 1, size, inputArray, k, subsequenceList, sum);
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
        System.out.printf("The subsequences that sum up to K (%d) are:\n", k);
        subsequenceThatSumToK(0, size, inputArray, k, new ArrayList<>(), 0);
    }
}