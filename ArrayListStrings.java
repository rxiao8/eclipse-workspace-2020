import java.util.ArrayList;

public class ArrayListStrings {

	public static void main(String[] args) {
		String searchedValue = "Bob";  
		int pos = 0;
		boolean found = false;
		
		//Set up ArrayList
		ArrayList<String> values = new ArrayList<String>();
		int x = 0;
		values.add("Sue");
		values.add("Jim");
		values.add("Bob");
		values.add("Ann");
		
		
		//Linear Search
		while (pos < values.size() && !found) //found==false
		{
			if (searchedValue.equals(values.get(pos))) 
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


