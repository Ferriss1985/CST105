import java.util.Scanner;

/* Program: Programming Exercise 1
 * File: ConverterMain.java
 * Summary: Program created to display text with my answers.
 * Author: Nick Ferriss
 * Date: November 17, 2018
 * I certify this work is my own
 */
public class ConverterMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a Farenheit temperature to convert to Celcius:");
		Double farenheit1 = scanner.nextDouble();
		Double celcius1 = (farenheit1 - 32) * 5 / 9;
		System.out.println(farenheit1 + " degrees Farenheit is equivalent to " + celcius1 + " degrees Celcius.");

		System.out.println("Please enter a Celcius temperature to convert to Farenheit:");
		Double celcius2 = scanner.nextDouble();
		Double farenheit2 = celcius2 * 9 / 5 + 32;
		System.out.println(celcius2 + " degrees Celcius is equivalent to " + farenheit2 + " degrees Farentheit.");

		scanner.close();
	}

}
