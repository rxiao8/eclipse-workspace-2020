
public class FirstArrayExample {

	public static void main(String[] args) {
		String [] names = {"Jim", "Sue", "Ann"};
		for(String n: names)
		{
			System.out.println(n);
		}
		nameSwap(names);
		System.out.println("\n");
		
		for(int i=0; i<names.length; i++)
		{
			System.out.println(names[i]);
		}
		names[0] = "Bob";
		System.out.println("\n"+ names[0]);
	}
	
	public static void nameSwap(String [] name)
	{
		String temp = name[0];
		name[0] = name[1];
		name[1]= temp;
	}

}
