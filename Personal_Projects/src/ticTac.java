import java.util.ArrayList;
import java.util.Arrays;

/*Write a program that plays tic-tac-toe. The game is played on a 3x3 grid (think 2D array). The
game is played by two players, the ‘X’ player and the ‘O’ player. The player who goes first is the
‘O’ player. The player who has formed a horizontal, vertical or diagonal sequence of three
marks wins. Your program should declare a winner. You may handle the moves and display
however you wish.
You need to have at least two classes. A game class and the driver class.
The game class needs to handle the board. You are welcome to add a third
class of the player, but it is not necessary.*/

public class ticTac {
	private int[][] grid = new int [3] [3]; {
	//private ArrayList<int> gridTwo = new ArrayList<int>();
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j ++) {
			grid[i][j] = grid[i][j];
			System.out.print(grid[i][j] + " ");
		} 
		System.out.print("\r\n");
		/*for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(lotteryCard[i][j] + " ");
			}
			System.out.println("\r\n");
		}
		*/
	}
	}
	private int[][] newGrid;
	private int actualRow;
	private int actualColumn;
	private int playerOneWins;
	private int playerTwoWins;
	private int maxTurns;
	
	
	// Constructor
	 public ticTac() {
		playerOneWins = 0;
		playerTwoWins = 0;
		newGrid = grid.clone();
		maxTurns = 0;
		
		
	}
	
	
	/*public void gridLayout() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j ++) {
				newGrid[i][j] = newGrid[i][j];
				System.out.print(newGrid[i][j] + " ");
			} 
			System.out.print("\r\n");
		//starts game, takes in input and asks for another one
	}
	}*/
	public void checking() {
		//checking to see if there is a winner for each round
		//check when maxed for retry
		if (newGrid[0][0] == newGrid[0][1] && newGrid[0][0] == newGrid[0][2]) { //across
			if (newGrid[0][0] == 9) {
				playerOneWins++;
				System.out.println("Player One wins this round!");
			}
			else {
				playerTwoWins++;
				System.out.println("Player Two wins this round!");
			}
			
		}
		if (newGrid[0][0] == newGrid[1][0] && newGrid [0][0] == newGrid[2][0]) { //vertical
			if (newGrid[0][0] == 9) {
				playerOneWins++;
				System.out.println("Player One wins this round!");
			}
			else {
				playerTwoWins++;
				System.out.println("Player Two wins this round!");
			}
			
		}
		if (newGrid[0][0] == newGrid[1][1] && newGrid[0][0 ]== newGrid[2][2]) { //diagonal
			if (newGrid[0][0] == 9) {
				playerOneWins++;
				System.out.println("Player One wins this round!");
			}
			else {
				playerTwoWins++;
				System.out.println("Player Two wins this round!");
			}
		}
		
		
	}
	public void playerOneMoves(int row, int column) {
		actualRow = row - 1;
		actualColumn = column -1;
		if (newGrid[actualRow][actualColumn] != 0) {
			System.out.println("Input another value: ");
		}
		else {
			newGrid[actualRow][actualColumn] = 9;
			maxTurns++;
			checking();
			//gridLayout();
		}
		
		//allowing the position number to change to 9, if occupied, ask for another input
	}
	public void playerTwoMoves(int row, int column) {
		actualRow = row - 1;
		actualColumn = column -1;
		if (newGrid[actualRow][actualColumn] != 0) {
			System.out.println("Input another value: ");
		}
		else {
			newGrid[actualRow][actualColumn] = 8;
		}
		maxTurns++;
		checking();
		//gridLayout();
		//allwoing position number to change to 8, if occupied, ask for another input
	}
	
	public int returnWins() { //accessor
		return playerOneWins + playerTwoWins;
		
		//
	}
	public int outOfTurns() { //if no more room for turns
		/*if (maxTurns > 9) {
			return maxTurns;
		}*/
		return maxTurns;
	}
	
	public int[][] newGame() {
		int[][] newGrid = grid;
		maxTurns = 0;
		return newGrid;
	}
	
	public static void main(String[] args) {
		ticTac one = new ticTac ();
		
		one.playerOneMoves(2, 1);
		one.outOfTurns();
		
	}
	
}
		
		
	

