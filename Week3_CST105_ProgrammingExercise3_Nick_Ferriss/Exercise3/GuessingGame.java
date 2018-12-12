import java.util.Scanner;

/* Program: Programming Exercise 3
 * File: GuessingGame.java
 * Summary: Interactive guessing game
 * Author: Nick Ferriss
 * Date: November 22, 2018
 * I certify this work is my own.
 */

public class GuessingGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tries = 0;
		int number = (int) (Math.random() * 10000);
		int guess = 0;
		int min = 1;
		int max = 10000;
		boolean correct = false;

		System.out.println();

		while (!correct) {
			System.out.println("Enter a guess between " + min + " and " + max + ".");
			guess = scanner.nextInt();
			if (guess > number) {
				System.out.println("Lower!");
				max = guess;
				tries++;
			} else if (guess < number) {
				System.out.println("Higher!");
				min = guess;
				tries++;
			} else if (guess == number) {
				correct = true;
			}
		}

		System.out.println("You win! It took " + tries + " guesses.");
		scanner.close();
	}

}
