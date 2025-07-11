package edu.charlotte.algorithms.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingAllTheSubsequences {
    public static void subsequence(int index, int size, List<Integer> subsequenceList, int[] inputArray) {
        if(index == size) {
            System.out.println(subsequenceList);
            return;
        }
        // The current element is not considered (i.e., not added) into the subsequence
        subsequence(index + 1, size, subsequenceList, inputArray);

        // The current element is considered into the subsequence
        subsequenceList.add(inputArray[index]);
        subsequence(index + 1, size, subsequenceList, inputArray);
        subsequenceList.removeLast();
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
        scan.close();
        subsequence(0, size, new ArrayList<>(), inputArray);
    }
}
