import java.util.Arrays;

public class ArrayBinarySearch {
	public static void main(String [] args)
	{
		int [] values = new int[30];
		int x = 0;
		while (x< 30)
		{
			values[x] = (int)(Math.random()*50);
			System.out.println(values[x]);
			x++;
		}
		int searchedValue = 25;

		Arrays.sort(values);
		boolean found = false;
		int low = 0, pos = 0;  //pos = midpoint
		int high = values.length - 1;
		while (low <= high && !found)
		{
			pos = (low + high) / 2;  // Midpoint of the subsequence
			if (values[pos] == searchedValue) 
			{ found = true; }      // Found it!
			else if (values[pos] < searchedValue) 
			{ low = pos + 1; }     // Look in first half
			else { high = pos - 1; } // Look in second half
		}
		if (found) 
		{ System.out.println("Found at position " + pos); }
		else 
		{ System.out.println("Not found. Insert before position " + pos); }

	}
}
