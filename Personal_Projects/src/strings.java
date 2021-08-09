import java.lang.reflect.Array;
import java.util.Arrays;

public class strings {

	public static void main(String[] args) {
		String a = "oliver";
		String b = "oliver";
		
		System.out.println(a==b); //true since they are literals and can be found in String pool for memory conservation
		System.out.println(a.equals(b)); //true since the content is the same
		System.out.println(a);
		System.out.println(b);

		String one = new String("maurice");
		String two = new String("maurice");
		
		System.out.println(one == two); //different location in heap memory
		System.out.println(one.equals(two));
		System.out.println(one);
		System.out.println(two); //prints the content due to toString()
		
		String[] yo = new String []
				{"you", "suck", "ass"};
		
		System.out.println(yo[1]);
		System.out.println(yo);
		System.out.println(yo.toString());
		System.out.println(Arrays.toString(yo));
		
	}

}
