import java.util.Scanner;

/* Program: Programming Exercise 4
 * File: igPayatinLay.java
 * Summary: Read text input file, store as string and convert to Pig Latin and display.
 * Author: Nick Ferriss
 * Date: November 25, 2018
 * I certify this work is my own.
 */

public class igPayatinLay {

	public static void main(String[] args) throws Exception {
		// instantiate the input file
		java.io.File file = new java.io.File("C:\\inputfile.txt");
		// instantiate a new scanner object
		Scanner scanner = new Scanner(file);

		// set words in the text file to a variable
		while (scanner.hasNext()) {
			String word1 = scanner.next();
			String word2 = scanner.next();
			String word3 = scanner.next();
			String word4 = scanner.next();
			String word5 = scanner.next();
			String word6 = scanner.next();
			String word7 = scanner.next();
			String original = word1 + " " + word2 + " " + word3 + " " + word4 + " " + word5 + " " + word6 + " " + word7;

			// display original word, convert to pig latin, and display pig latin
			// modification
			System.out.print(word1 + "       ");
			word1 = word1 + "way";
			System.out.println(word1.toUpperCase());

			System.out.print(word2 + "      ");
			word2 = word2.substring(1) + word2.charAt(0) + "ay";
			System.out.println(word2.toUpperCase());

			System.out.print(word3 + "        ");
			word3 = word3 + "way";
			System.out.println(word3.toUpperCase());

			System.out.print(word4 + "     ");
			word4 = word4.substring(1) + word4.charAt(0) + "ay";
			System.out.println(word4.toUpperCase());

			System.out.print(word5 + "      ");
			word5 = word5 + "way";
			System.out.println(word5.toUpperCase());

			System.out.print(word6 + "   ");
			word6 = word6.substring(2) + word6.charAt(0) + word6.charAt(1) + "ay";
			System.out.println(word6.toUpperCase());

			System.out.print(word7 + "    ");
			word7 = word7.substring(1) + word7.charAt(0) + "ay";
			System.out.println(word7.toUpperCase());

		}

		scanner.close();
	}

}
