package rosalindBio;
//Read an input file that would output a complement pair that runs in the opposite direction

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ComplementingDNA {

	private Scanner in;
	private File dnaFile;
	ArrayList<String> dna = new ArrayList<String>();
	ArrayList<String> adjusted = new ArrayList<String>();
	private String base;

	public ComplementingDNA(String f) throws FileNotFoundException {
		dnaFile = new File(f);
		setList(dnaFile);
		findComp(dna);
		getStrand(adjusted);
		// compare();

	}

	/*
	 * @to take in a file
	 * 
	 * @param file
	 * 
	 * @return an arrayList of the strand
	 */
	public ArrayList<String> setList(File f) throws FileNotFoundException {
		in = new Scanner(dnaFile);
		in.useDelimiter("");

		while (in.hasNext()) {
			char c = in.next().charAt(0);
			if (Character.isLetter(c) == false) {
				continue;
			}
			String a = Character.toString(c).toUpperCase();
			dna.add(a);
		}

		return dna;

	}

	/*
	 * @finds the base pairs and reverse the order
	 * 
	 * @param the arrayList of strand
	 * 
	 * @return a new arrayList that has been complemented
	 */

	public ArrayList<String> findComp(ArrayList<String> a) {
		for (int i = a.size() - 1; i >= 0; i--) {
			String letter = a.get(i);
			base = findBase(letter);
			adjusted.add(base);
		}
		return adjusted;
	}

	public String findBase(String s) {
		String newBase = null;
		switch (s) {
		case "A":
			newBase = "T";
			break;
		case "T":
			newBase = "A";
			break;
		case "C":
			newBase = "G";
			break;
		case "G":
			newBase = "C";
			break;
		default:
			newBase = "BRO!"; // to catch any mistakes
			break;
		}
		return newBase;

	}

	public void getStrand(ArrayList<String> a) {
		for (String letter : a) {
			System.out.print(letter);
		}
	}

	public void compare() {
		for (int i = 0, j = adjusted.size() - 1; i < adjusted.size(); i++, j--) {
			System.out.printf("Original: %s  New: %s\r\n", dna.get(j), adjusted.get(i));
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		ComplementingDNA one = new ComplementingDNA("rosalind_revc (2).txt");
		// System.out.println("\r\n");
		// ComplementingDNA two = new ComplementingDNA("rosalind_rna.txt");

	}

}
