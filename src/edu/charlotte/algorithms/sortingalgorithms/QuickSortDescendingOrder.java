package edu.charlotte.algorithms.sortingalgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSortDescendingOrder {
    public static void quickSort(int[] inputArray, int low, int high) {
        if(low >= high)
            return;
        int partitionIndex = placingPivotAtCorrectPosition(inputArray, low, high);
        quickSort(inputArray, low, partitionIndex - 1);
        quickSort(inputArray, partitionIndex + 1, high);
    }

    public static int placingPivotAtCorrectPosition(int[] inputArray, int low, int high) {
        int pivot = inputArray[high];
        int leftPointer = low;
        int rightPointer = high;
        while(leftPointer < rightPointer) {
            while(inputArray[leftPointer] > pivot && leftPointer <= high - 1)
                leftPointer++;

            while(inputArray[rightPointer] <= pivot && rightPointer >= low + 1)
                rightPointer--;

            if(leftPointer < rightPointer)
                swap(inputArray, leftPointer, rightPointer);
        }
        swap(inputArray, leftPointer, high);
        return leftPointer;
    }

    public static void swap(int[] inputArray, int index1, int index2) {
        int temp = inputArray[index1];
        inputArray[index1] = inputArray[index2];
        inputArray[index2] = temp;
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
        quickSort(inputArray, 0, size - 1);
        System.out.println("The sorted array is: " + Arrays.toString(inputArray));
    }
}
