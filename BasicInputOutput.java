import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class BasicInputOutput {

	public static void main(String[] args) throws FileNotFoundException {
		File aFile = new File("myFile.txt");
		Scanner fin = new Scanner(aFile);
		PrintWriter fileOut = new PrintWriter("outfile.txt");
		
		ArrayList<String> fromFile = new ArrayList<String>();
		
		while(fin.hasNextLine())
		{
			fromFile.add(fin.nextLine() + "!");
		}
		
		for(String s: fromFile)
		{
			System.out.println(s);
			fileOut.println(s);
		}
		
		
		fileOut.close();
		fin.close();

	}

}
