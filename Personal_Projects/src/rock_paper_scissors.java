import java.util.Scanner;

public class rock_paper_scissors {
	
	public static void main(String[] args) {
		int win = 0;
		int notWin = 0;
		while (true) {
			Scanner in = new Scanner(System.in);
			System.out.println("Let's play a game! Input either rock, paper, or scissors. Type quit if no game.");
			String answer = in.next().toLowerCase();
			if (answer.equals("quit")) {
				break;
			}


		String compAnswer = "";
		int a = comp();
		
		if (a == 1) {
			compAnswer = "rock";			
		}

		else if (a == 2) {
			compAnswer = "paper";
		}
		else {
			compAnswer = "scissors";
		}
		
		System.out.println("Your answer was: " + answer +""
				+ "\r\nThe computer answer was: " + compAnswer);
		
		if (answer.equals(compAnswer)) {
			System.out.println("Try again!");
			}
		
		else if (answer.equals("rock")) {
			switch (compAnswer) {
			case "paper":
				System.out.println("You lose!");
				notWin++;
				break;
			case "scissors":
				System.out.println("You win!");
				win++;
				break;
			}
		}
		if (answer.equals("paper")) {
			switch (compAnswer) {
			case "rock":
				System.out.println("You win!");
				win++;
				break;
			case "scissors":
				System.out.println("You lose!");
				notWin++;
				break;
			}
		}
		if (answer.equals("scissors")) {
			switch (compAnswer) {
			case "rock":
				System.out.println("You win!");
				win++;
				break;
			case "paper":
				System.out.println("You lose!");
				notWin++;
				break;
			}
			
		}	
		System.out.println(win);
		System.out.println(notWin);
	}
}

	public static int comp() {
	int compNum = 1 + (int) (Math.random()*3);
		
	return compNum;
	
}
	}

