package rosalindBio;

import java.io.FileNotFoundException;

/* Create a recursive function to compute how many rabbit pairs there will be after n-months using the Fibonnaci Sequence*/

public class WabbitsFib {
	private int total;
	private int n;
	private int l;
	private int f1;
	private int f2;
	private int f2Total;
	private int f1Total;
	// private int counter;

	public WabbitsFib(int n, int l) {
		this.l = l;

		firstPair(this.n = n);
	}

	public int firstPair(int n) {
		int counter = n;
		if (counter == 0) {
			return f1 += 1;
		} else {
			f1Total = (n - 1) * l;
			return firstPair(n - 1);
		}

	}

	public int secondPair(int n) {
		int counter = n;
		if (counter == 2) {
			f2Total += l;
			return f2;
		} else {
			f2Total = (n - 2) * l;
			return secondPair(n - 1);
		}

	}

	public void getTotal() {
		System.out.println(f1Total);
	}

	public static void main(String[] args) throws FileNotFoundException {
//		Scanner in = new Scanner(System.in);
//		System.out.println("How many months?");
//		int month = Integer.parseInt(in.next());
//		System.out.println("How many pairs born?");
//		int pairs = Integer.parseInt(in.next());
		WabbitsFib testing = new WabbitsFib(5, 3);
		// testing.getTotal();

	}

}
