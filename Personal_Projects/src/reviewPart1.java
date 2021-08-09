/*Topics covered in this class
 * format specifiers,
 */
public class reviewPart1 {

	public static void main(String[] args) {
		String name = "Rose";
		double cash = 355.02543655;
		System.out.printf("Hi, my name is %s and I spent around $%.2f on artist merch. Yikes!", name, cash);
		double one = 456.56;
		double two = 7412569852.23654126854;
		double three = 789652.1236547;
		
		double[] list = {one, two, three};
		
		//to print out formated doubles
		System.out.println("Here is a list of random numbers:");
		for (int i = 1; i < 4; i++) {
			System.out.printf(i + ": %-10.3f \r\n", list[i-1]);
		}
		
		int[] listTwo = {174269, 2, 3};
		//to print out formated ints
		System.out.println("Here is a list of random numbers:");
		for (int i = 1; i < 4; i++) {
			System.out.printf(i + ": %04d \r\n", listTwo[i-1]);
		}
		
	}

}
