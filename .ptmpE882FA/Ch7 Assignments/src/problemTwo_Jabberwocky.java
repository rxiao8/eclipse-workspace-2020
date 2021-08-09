/*Rose X.
 * October 2020
 * Jabberwocky (Review Practice)
 * Combination of methods, arrays, loops, string methods, i/o, and if statements.
 */
import java.io.File;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.Collections;

public class problemTwo_Jabberwocky {

	public static void main(String[] args) throws FileNotFoundException { 
		File FileOne = new File ("Jabberwocky.txt");
		Scanner in = new Scanner(FileOne);
		ArrayList<String> poemArray = new ArrayList<String>();
		while (in.hasNext())
		{
			String value = in.nextLine();
			poemArray.add(value);
		}
		
		
		File FileTwo = new File ("Jabberwocky.txt");
		in = new Scanner(FileTwo);
		in.useDelimiter("[^A-Za-z]+");
		ArrayList<String> wordsList = new ArrayList<String>();
		while (in.hasNext())
		{
			String value = in.next();
			wordsList.add(value);
		}
	
		
		ArrayList<String> wordsListLower = new ArrayList<String>();
		
		for (int i = 0; i < wordsList.size(); i++) {
			String lowerCase = wordsList.get(i).toLowerCase();
			wordsListLower.add(lowerCase);	
		}
			
		
		
		while (true) {	
		System.out.println("Menu: ");
		menu();
		System.out.println("Enter the number correlated with the option you would like to execute: ");
		in = new Scanner(System.in);
		int choice = in.nextInt();
			if (choice == 8){
				System.out.println("Option: To Quit. Thank you for your time.");
				break;
			}
			else{
				decision(choice, poemArray, wordsList, wordsListLower);
			}
		}
		in.close();
	}
	
	
	public static void menu() {
		System.out.println("1. Print the list of words");
		System.out.println("2. Find a word (using binary search)");
		System.out.println("3. Find a word (using linear search)");
		System.out.println("4. Print the number of words containing the letter sequence \"he\"");
		System.out.println("5. Print the word(s) that occur the most times.");
		System.out.println("6. Print unique words");
		System.out.println("7. Print the original file");
		System.out.println("8. Quit");
	}
	
	
	public static void decision(int choiceNum, ArrayList<String> a, ArrayList<String> b, ArrayList<String> c) throws FileNotFoundException {
		switch (choiceNum) {
		case 1:
			printWords(b);
			break;
		case 2:
			binarySearch(c);
			break;
		case 3:
			linearSearch(c);
			break;
		case 4:
			sequence(c);
			break;
		case 5:
			wordMode(c);
			break;
		case 6:
			uniqueWords(c);
			break;
		case 7:
			printOriginal(a);
			break;
		} 
	}
	
	
	public static void printWords(ArrayList<String> wordsList) {
		ArrayList<String> list = new ArrayList<String>(wordsList);
		int j = 1;
		for (int i = 0; i < wordsList.size(); i++) {
			System.out.printf("%-5s%-50s\r\n", j + "." , wordsList.get(i));
			j++;
		}
	}
	
	
	public static void binarySearch (ArrayList<String> wordsListLower) {

		Collections.sort(wordsListLower);
		
		System.out.println("Enter the word you are looking for: ");
		Scanner in = new Scanner(System.in);
		String word = in.next().toLowerCase();
		
		boolean found = false;
		int counter = 0;
		int low = 0;
		int high = wordsListLower.size() - 1;
		int pos = 0;
		while (low <= high && !found) {
			pos = (low + high)/2;
			if (word.compareTo(wordsListLower.get(pos)) == 0) {
				found = true;				
			}
			else if (word.compareTo(wordsListLower.get(pos)) < 0) {
				high = pos - 1;
				counter++;
			}
			else {
				low = pos + 1;
				counter++;
			}
		}
		System.out.println("Postion: " + pos + 
				"\r\nNumber of comparisions it took: " + counter);	
		
	}
	
	
	public static void linearSearch(ArrayList<String> wordsListLower) {
		
		System.out.println("Enter the word you are looking for: ");
		Scanner in = new Scanner(System.in);
		String word = in.next().toLowerCase();
		
		boolean found = false;
		int counter = 1;
		int i = 0;
		while(!found && i < wordsListLower.size()) {
			if (word.equals(wordsListLower.get(i))) {
				found = true;
			}
			else {
				i++;
				counter++;
			}
		}
		if (!found) {
			String resultB = "Word was not found.";
			System.out.println(resultB);
		}
		else {
			String resultA = "Word was found."
					+ "\r\nPosition: " + i 
					+ "\r\nCounter: " + counter;
			System.out.println(resultA);
		}		
		
	}
	
	
	public static void sequence(ArrayList<String> wordsListLower) {
		
		int counter = 0;
		for (int i = 0; i < wordsListLower.size(); i++) {
			String a = wordsListLower.get(i);
			for(int j = 0; j < a.length() - 1; j++) {
				char firstLetter = a.charAt(j);
				char secondLetter = a.charAt(j + 1);
				if (firstLetter == 'h' && secondLetter == 'e') {
					counter++;
				}
			}
			
		}
		System.out.println("Counter: " + counter);
	}
	
	
	public static void wordMode(ArrayList<String> wordsListLower) {
		
		Collections.sort(wordsListLower);
		
		ArrayList<String> list = new ArrayList<String>();
		
		for (int i = 0; i < wordsListLower.size() - 1; i++) { //copied the method from uniqueWords
			if (wordsListLower.get(i).equals(wordsListLower.get(i+1)) == false) {
				list.add(wordsListLower.get(i));
				}
			}
		
		int finalCount = 0;
		for (String element: wordsListLower) {
			for (int i = 0, counter = 0; i < wordsListLower.size() - 1; i++) {
				if (element.equals(wordsListLower.get(i + 1))) {
					counter++;
				}
				if (counter > finalCount) {
					finalCount = counter;
				}
				}
			}
		
		int counter = 0;
		for (String element: list) {
			for (int i = 0; i < wordsListLower.size() - 1; i++) {
				if (element.equals(wordsListLower.get(i + 1))) {
					counter++;
					if (counter == finalCount) {
						System.out.println("Word: " + element + 
								"\r\nCount: " + finalCount);
					}
				}
				else {
					counter = 0;
				}
				
			}
		}
	}
	
	
	public static void uniqueWords(ArrayList<String> wordsListLower) {
		
		Collections.sort(wordsListLower);
		
		ArrayList<String> list = new ArrayList<String>();
		
		for (int i = 0; i < wordsListLower.size() - 1; i++) {
			if (wordsListLower.get(i).equals(wordsListLower.get(i+1)) == false) {
				list.add(wordsListLower.get(i));
				}
			}
		
		System.out.print(list);	
	}
	
	
	public static void printOriginal(ArrayList<String> poemArray) {
		for (int i = 0; i < poemArray.size(); i++) {
			System.out.println(poemArray.get(i));
		}
		}
	}


