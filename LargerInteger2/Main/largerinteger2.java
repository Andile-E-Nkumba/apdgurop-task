package Main;

import java.util.Scanner;

/**
 * largerinteger2
 */
public class largerinteger2 {

    public static void main(String[] args) {
        Scan3ner scanner = new Scanner(System.in);
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