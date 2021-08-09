package rosalindBio;

import java.util.Scanner;
import java.io.*;
public class Dna2Rna {
	static File dnaFile;
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) throws FileNotFoundException {
		String dna;
		String input;
		
		do { //used do while to print question once
			System.out.println("Enter a DNA text file.");
			input = in.nextLine();
			dnaFile = new File (input);
			in = new Scanner(dnaFile);
			dna = in.next();
			if (dna.length() > 1000) {
				System.out.println("DNA string is too long.");
			}

		}while (dna.length() > 1000);
		
		for (int i = 0; i < dna.length(); i++) {
			if (dna.charAt(i) == 'T') {
				System.out.print("U");
				continue;
			}
			System.out.print(dna.charAt(i));
		}
	
		

	}

}
