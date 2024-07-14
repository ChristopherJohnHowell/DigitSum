package src;

import java.util.Scanner;

public class SumOfDigits {

    /**
     * Provided a Command Line Prompt that receives a number and Sums the digits of the provided number.
     * E.g. 17 -> 1 + 7 = 8
     */
    public static void sumDigits() {
        Scanner scanner = new Scanner(System.in);
        int enteredNumber = 0;
        boolean valid = false;

        while (!valid) {
            System.out.println("Please enter a single numeric input (e.g. 17), or type 'quit' to exit: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye!");
                valid = true;
            } else {
                try {
                    enteredNumber = Integer.parseInt(input);
                    if (enteredNumber < 0) {
                        System.out.println("Please enter a positive number.");
                    } else {
                        System.out.println("The sum of the digits is: " + sumOfDigits(enteredNumber));
                    }
                } catch (NumberFormatException e) {
                    System.out.println("The input must be an integer.");
                }
            }
        }

        scanner.close();
    }

    /**
     * Sums the digits of the provided number.
     * E.g. 17 -> 1 + 7 = 8
     *
     * @param number
     * @return
     */
    protected static int sumOfDigits(int number) {
        if (number == 0)
            return 0;
        return Math.abs(number % 10) + sumOfDigits(Math.abs(number / 10));
    }

}
