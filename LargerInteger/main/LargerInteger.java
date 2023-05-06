package LargerInteger.main;

import java.util.Scanner;

/**
 * LargerInteger
 */
public class LargerInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int firstInt = scanner.nextInt();
        System.out.println("Enter the second integer: ");
        int secondInt = scanner.nextInt();
        if (firstInt > secondInt) {
            System.out.println("The larger integer is: " + firstInt);
        } else {
            System.out.println("The larger integer is: " + secondInt);
        }
    }
}