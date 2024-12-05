package chap1_fundamental;

/*  Create a program that asks a user for a season of the year, then a whole number, then an adjective. And use the input to complete the sentence below then Output the result. 
"On a [adjective] [season of the year] day, I drink a minimum of [whole number] cups of coffee."
*/

import java.util.Scanner;


public class MadLibs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Season of the year");
        String season = scanner.next();

        System.out.println("Enter a whole number"); 
        int number = scanner.nextInt();

        System.out.println("Enter an adjective");
        String adjective = scanner.next();
        scanner.close();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");

        // Sample Output: On a normal winter day, I drink a minimum of 3 cups of coffee.
    }


}
