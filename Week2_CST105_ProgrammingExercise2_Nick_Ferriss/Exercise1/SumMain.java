
/* Program: Programming Exercise 1
 * File: SumMain.java
 * Summary: Program created to display text with my answers.
 * Author: Nick Ferriss
 * Date: November 17, 2018
 * I certify this work is my own.
 */
import java.util.Scanner;

public class SumMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a 5 digit positive integer:");
		int value = scanner.nextInt();

		int digit1 = value / 10000;
		int digit2 = (value % 10000) / 1000;
		int digit3 = (value % 1000) / 100;
		int digit4 = (value % 100) / 10;
		int digit5 = (value % 10) / 1;
		int sum = digit1 + digit2 + digit3 + digit4 + digit5;

		System.out.println("The sum of the digits entered is " + digit1 + "+" + digit2 + "+" + digit3 + "+" + digit4
				+ "+" + digit5 + "=" + sum);

		scanner.close();
	}

}
