package edu.charlotte.algorithms.recursion;

import java.util.Scanner;

public class Palindrome {
    public static boolean checkIfItIsAPalindrome(String input, int index) {
        if(index >= input.length() / 2)
            return true;
        else if(input.charAt(index) != input.charAt(input.length() - 1 - index))
            return false;
        return checkIfItIsAPalindrome(input, index + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string you want to check if it is a palindrome or not: ");
        String input = scan.nextLine();
        scan.close();
        if(checkIfItIsAPalindrome(input, 0))
            System.out.println("The String '" + input + "' is a palindrome");
        else
            System.out.println("The String '" + input + "' is not a palindrome");
    }
}
