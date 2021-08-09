//methods that calls itself in which the condition is when it no longer calls on itself
public class Recursion {

//	private int months;
//	private int multiplier;

//	public Recursion(int l) {
//		// months = n;
//		multiplier = l;
//
//	}

	int months;
	static int multiplier = 2;

	public static int rabbits(int n) {
		if (n == 1 || n == 2) { // since F1 == F2 == 1, so no new additions
			return 1;
		} else {
			return rabbits(n - 1) + (rabbits(n - 2) * multiplier);
		}

	}

	public static void main(String[] args) {
//		Recursion t1 = new Recursion(2);
//		t1.rabbits(32);

		System.out.println(rabbits(32));

	}

}
