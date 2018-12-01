import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/* Program: Programming Exercise 5
 * File: Array.java
 * Summary: Create 2d array, extract characters and build/display strings.
 * Author: Nick Ferriss
 * Date: November 27, 2018
 * I certify this work is my own
 */
public class Array {

	public static void main(String[] args) {

// instantiate input file and 2d array
		String[][] array = new String[20][45]; // 20 rows by 45 columns, 900 elements
		String fullString = "";

// get content of file as string
		try {
			fullString = new String(Files.readAllBytes(Paths.get("C://arrayinput.txt")));
		} catch (IOException e) {
			System.out.println("No such file");
			e.printStackTrace();
		}

// change spaces to @ symbol, then convert file string to a string array
		fullString = fullString.replaceAll("\\s", "@");
		String[] fullStringArray = fullString.split("");

// iterate through the 2d array (row major) and assign element based on counter iterating through fullStringArray
		int k = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = fullStringArray[k];
				k++;
			}
		}

// rearrange for output (column major) and display
		int r;
		int c;
		for (r = 0; r < array[0].length; r++) {
			for (c = 0; c < array.length; c++) {
				System.out.print(array[c][r]);
			}
		}
	}
}