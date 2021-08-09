
public class LotteryTicket {

	public static void main(String[] args) {
		int [] [] lotteryCard = { {20, 15, 7}, 
									{8, 7, 19},
									{7, 13, 47}};
		int[] [] lotteryCard2 = new int[3] [3]; //long version, [row][column]
		lotteryCard2[0][0] = 20;
		lotteryCard2[0][1] = 15;
		lotteryCard2[0][2] = 7;
		lotteryCard2[1][0] = 8;
		lotteryCard2[1][1] = 7;
		lotteryCard2[1][2] = 19;
		lotteryCard2[2][0] = 7;
		lotteryCard2[2][1] = 13;
		lotteryCard2[2][2] = 47;
		
		System.out.println(lotteryCard[0][0]);
		System.out.println("-------------------");
		
		for (int i = 0, j = 0; i < 3 && j < 3; i++, j++) {
			System.out.println(lotteryCard [i][j]);
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(lotteryCard [i][i]);
		}
		
		System.out.println("-------------------");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(lotteryCard[i][j] + " ");
			}
			System.out.println("\r\n");
		}
		
		System.out.println("-------------------");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 2 && i < 2) {
					System.out.print("\r\n");
				}
				if (i == j) {
				System.out.print(lotteryCard[i][j]);
				}
				else {
					System.out.print(" ");
				}
			}
			//System.out.println("\r\n");
		}
		
		System.out.print("\r\n");
		System.out.println("-------------------");
		
		String [][] grid = new String [3] [3]; 
		String[][] board = grid.clone();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j ++) {
				board[i][j] = "0";
				System.out.print(board[i][j] + "|");
			} 
			System.out.print("\r\n");
		}
		
		System.out.print("\r\n");
		System.out.println("-------------------");
		
		
		}
	}
