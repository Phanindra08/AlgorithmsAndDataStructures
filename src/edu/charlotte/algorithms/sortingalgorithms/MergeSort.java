package edu.charlotte.algorithms.sortingalgorithms;

import java.util.Arrays;
import java.util.Scanner;

// Used recursion to solve Merge Sort
public class MergeSort {
    public static void mergeSort(int[] inputArray, int low, int high) {
        if(low >= high)
            return;
        int mid = (low + high) / 2;
        mergeSort(inputArray, low, mid);
        mergeSort(inputArray, mid + 1, high);
        merge(inputArray, low, mid, high);
    }

    public static void merge(int[] inputArray, int low, int mid, int high) {
        int leftPointer = low;
        int rightPointer = mid + 1;
        int sortedArrayPointer = 0;
        int[] sortedArray = new int[high - low + 1];

        while(leftPointer <= mid && rightPointer <= high) {
            if(inputArray[leftPointer] <= inputArray[rightPointer]) {
                sortedArray[sortedArrayPointer] = inputArray[leftPointer];
                leftPointer++;
            } else {
                sortedArray[sortedArrayPointer] = inputArray[rightPointer];
                rightPointer++;
            }
            sortedArrayPointer++;
        }

        while(leftPointer <= mid) {
            sortedArray[sortedArrayPointer] = inputArray[leftPointer];
            leftPointer++;
            sortedArrayPointer++;
        }

        while(rightPointer <= high) {
            sortedArray[sortedArrayPointer] = inputArray[rightPointer];
            rightPointer++;
            sortedArrayPointer++;
        }

        for(int index = low; index <= high; index++)
            inputArray[index] = sortedArray[index - low];
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
        mergeSort(inputArray, 0, size - 1);
        System.out.println("The sorted array is: " + Arrays.toString(inputArray));
    }
}
