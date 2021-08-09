package rosalindBio;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ContentCG { // read files, generate objects, create loops to compare the objects in the
							// array
	static Scanner in;
	static File file;
	private int cGCount;
	private int totalCount;
	ArrayList<String> iD = new ArrayList<String>();
	ArrayList<String> dna = new ArrayList<String>();
	private double percentage;

	public void parsing(String file) {
		this.file = new File(file);
		in = new Scanner(file);
		while (in.hasNext()) {
			/* in.next(), in.nextInt(), deliminater */

		}

	}

	// thinking about taking them in, converting them as objects, and inputting them
	// as arrays

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
