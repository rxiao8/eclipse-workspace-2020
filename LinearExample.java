import java.util.ArrayList;

public class LinearExample {

	public static void main(String[] args) {
		int searchedValue = 25;  
		int pos = 0;
		boolean found = false;
		
		//Set up ArrayList
		ArrayList<Integer> values = new ArrayList<Integer>();
		int x = 0;
		while (x < 20)
		{
			values.add((int)(Math.random()*50));
			System.out.println(values.get(x));
			x++;
		}
		
		
		//Linear Search
		while (pos < values.size() && !found) //found==false
		{
			if (values.get(pos) == searchedValue) 
			{ 
				found = true; 
			}
			else 
			{ 
				pos++; 
			}
		}
		 if (found) //found == true
		  { 
		    System.out.println("Found at position: " + pos); 
		  }
		  else { System.out.println("Not found"); 
		  }

	}

}
