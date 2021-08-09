package rosalindBio;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class DnaNucleotides {
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
		
		dna = dna.toUpperCase().trim(); //converted to upper
		
		int aCount = 0;
		int cCount = 0;
		int gCount = 0;
		int tCount = 0;
		
		for (int i = 0; i < dna.length(); i ++) { //looped through with for loop and switch statment to count the symbols
			char symbol;
			switch (dna.charAt(i)) {
			case 'A':
				aCount++;
				break;
			case 'C':
				cCount++;
				break;
			case 'G':
				gCount++;
				break;
			case 'T':
				tCount++;
				break;
			
				
			
			}
		}
		
		System.out.println("A: " + aCount + 
				"\r\nC: " + cCount +
				"\r\nG: " + gCount +
				"\r\nT: " + tCount);
	}
}
