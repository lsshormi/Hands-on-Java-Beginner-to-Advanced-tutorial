package chap3_loop;

import java.util.Scanner;

/*
 * Repetition Structures - Loops:
 * Loops are structures that cause a block of code to repeat.
 * 
 * the three different kinds of loops are:
 * While loop
 * Do While loop
 * For loop
 * 
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */

public class GrossPayInputValidation {
    public static void main(String[] args) {
        // Initialize known variables
        int rate = 15;
        int maxHours = 40;

        // Get input for unknown variables
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        // Validate input
        while(hoursWorked>maxHours || hoursWorked<1) {
            System.out.println("Invalid entry. Your work hour must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();
        // Calculate gross pay
        double grossPay = hoursWorked * rate;

        // Output gross pay
        System.out.println("Your gross pay for this week is $" + grossPay);

    }
}
