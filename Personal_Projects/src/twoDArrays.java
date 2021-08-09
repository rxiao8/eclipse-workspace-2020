import java.util.ArrayList;

//getting use to 2d ArrayLists
public class twoDArrays {

	public static void main(String[] args) {
		ArrayList<String> food = new ArrayList<String>();
		food.add("Avocados");
		food.add("Cabbage");
		food.add("Pineapples");
		food.add("Tofu");
		
		ArrayList<String> drinks = new ArrayList<String>();
		drinks.add("water");
		drinks.add("coffee");
		drinks.add("milk");
		drinks.add("boba tea");
		
		ArrayList<String> whatILike = new ArrayList<String>();
		whatILike.addAll(food);
		whatILike.addAll(drinks);
		System.out.println(whatILike); //add the elements from each list to this list
		
		ArrayList<ArrayList<String>> whatILikeTwo = new ArrayList<ArrayList<String>> ();
		whatILikeTwo.add(food);
		whatILikeTwo.add(drinks);
		System.out.println(whatILikeTwo); //add the actual lists to this list

	}

}
