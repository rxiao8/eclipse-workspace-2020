import java.io.File;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class testing_testing {

	public static void main(String[] args) throws FileNotFoundException { 
		File File = new File ("Jabberwocky.txt");
		Scanner in = new Scanner(File);
		ArrayList<String> poemArray = new ArrayList<String>();
		
		while (in.hasNext())
		{
			String value = in.nextLine();
			poemArray.add(value);
		}
		
		System.out.println("Enter the word you are looking for: ");
		in = new Scanner(System.in);
		String word = in.next().toLowerCase();
		int pos = 0;
		boolean found = false;
		while (pos < poemArray.size() && !found)
		{
		 if (poemArray.get(pos) == word)
		 {
		 found = true;
		 }
		 else
		 {
		 pos++;
		}
		if (found)
		 {
		 System.out.println("Found at position: " + pos);
		 }
		 else { System.out.println("Not found");
		}
		}
	}

		
	}
	/*public static void printWords() throws FileNotFoundException { 
		File File = new File ("Jabberwocky.txt");
		Scanner in = new Scanner(File);
		in.useDelimiter("[^A-Za-z]+");
		ArrayList<String> wordsList = new ArrayList<String>();
		
		while (in.hasNext())
		{
			String value = in.next();
			wordsList.add(value);
		}
		for (int i = 0; i < wordsList.size(); i++) {
			int j = i + 1;
			//out.printf("%-4s%-50s\r\n", j + "." , poemArray.get(i));
			System.out.printf("%-5s%-50s\r\n", j + "." , wordsList.get(i));
		}
		
	}
	
	public static void sequence() {
		
	}
	
	public static void printOriginal(ArrayList<String> poemArray) {
		ArrayList<String> originalArray = new ArrayList<String>(poemArray);
		for (int i = 0; i < originalArray.size(); i++) {
			int j = i + 1;
			//out.printf("%-4s%-50s\r\n", j + "." , poemArray.get(i));
			System.out.printf("%-3s%-50s\r\n", j + "." , originalArray.get(i));
		}
	} */
	
	


