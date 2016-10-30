//Curtis Collins


import java.util.Scanner;

public class ticTacToe {
	
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		//declare and make board empty
		char[][] board = new char[3][3];
			for (int row = 0; row < board.length; row++) {
				for (int col = 0; col < board[row].length; col++) {
					board[row][col] = ' ';
				}
			}
		
			char player = 'X';
			boolean winner = false;
			int turn = 1;
			
		//making a play
		while (winner == false && turn <=9) {
			display(board);
			
			System.out.println("Player " + player + " enter a play:");
			int rowPlay = keyboard.nextInt();
			int colPlay = keyboard.nextInt();
			
			//validate move
			if (board[rowPlay][colPlay] != ' ') {
				System.out.println("This move is taken, enter again Player " + player);
				rowPlay = keyboard.nextInt();
				colPlay = keyboard.nextInt();
			}
			if (board[rowPlay][colPlay] == ' ') {
				board[rowPlay][colPlay] = player;
			}
			
			//check across for winner
			for (int row = 0; row < 3; row ++) {
				if (board[row][0] == player &&
					board[row][1] == player &&
					board[row][2] == player) {
						winner = true;
			 }
			//check up and down for winner
			for (int col = 0; col < 3; col++) {
				if (board[0][col] == player &&
					board[1][col] == player &&
					board[2][col] == player) {
					winner = true;
				}
			}
			//check diagonal top left to bottom right
			if (board[0][0] == player &&
				board[1][1] == player &&
				board[2][2] == player) {
				winner = true;
			}
			//check diagonal bottom left to top right
			if (board[0][2] == player &&
				board[1][1] == player &&
				board[2][0] == player) {
				winner = true;
			}
			}
			//change player and loop
			turn++;
			if (player == 'X') {
				player = 'O';
			}
			else {
				player = 'X';
			}
		}
		//output winner
		if (winner == false) {
			System.out.println("Cat wins.");
		}
		else {
			if (player == 'X') {
				System.out.println("Player O has won");
			}
			else {
				System.out.println("Player X has won.");
			}
		}
		

	} //end of main
	
	public static void display(char board[][]) {
		System.out.println(" 0   1   2");
		System.out.println("0   |  |");
		System.out.println("  --+--+--");
		System.out.println("1   |  |");
		System.out.println("  --+--+--");
		System.out.println("2   |  |");
		
	}

}
