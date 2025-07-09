package edu.charlotte.algorithms.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ReversingAnArray {
    public static void reversingAnArrayUsingTwoPointers(int[] arrayOfNumbers, int leftPointer, int rightPointer) {
        if(leftPointer >= rightPointer)
            return;
        int duplicate = arrayOfNumbers[leftPointer];
        arrayOfNumbers[leftPointer] = arrayOfNumbers[rightPointer];
        arrayOfNumbers[rightPointer] = duplicate;
        reversingAnArrayUsingTwoPointers(arrayOfNumbers, leftPointer + 1, rightPointer - 1);
    }

    public static void reversingAnArrayUsingOnePointer(int[] arrayOfNumbers, int size, int index) {
        if(index >= size / 2)
            return;
        int duplicate = arrayOfNumbers[index];
        arrayOfNumbers[index] = arrayOfNumbers[size - 1 - index];
        arrayOfNumbers[size - 1 - index] = duplicate;
        reversingAnArrayUsingOnePointer(arrayOfNumbers, size, index + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] arrayOfNumbers = new int[size];
        for(int index = 0; index < size; index++)
            arrayOfNumbers[index] = scan.nextInt();
        scan.close();
        reversingAnArrayUsingTwoPointers(arrayOfNumbers, 0, size - 1);
        System.out.println("The array after reversing using two pointers is: " + Arrays.toString(arrayOfNumbers));

        reversingAnArrayUsingOnePointer(arrayOfNumbers, size,0);
        System.out.println("The array after reversing using one pointer is: " + Arrays.toString(arrayOfNumbers));
    }
}
