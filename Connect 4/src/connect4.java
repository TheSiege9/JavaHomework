//My name goes here

import java.util.Scanner;

public class connect4 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		//declare, create, and initialize board
		char[][] board = new char[6][7];
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				board[row][col] = ' ';
			}
		}
		
		char player = 'R';
		int turn = 1;
		boolean winner = false;
		
		//play turn
		while (winner == false && turn <= 42) {
			//display board
			display(board);
			
			System.out.print("Player " + player + " enter a play: ");
			int play = keyboard.nextInt();
			//validate play - column range and if column is not not full
			while (play < 0 || play > 6 || board[0][play] != ' ') {
				System.out.print("Invalid entry.  Player " + player + " enter a play: ");
				play = keyboard.nextInt();				
			}
			
			//drop checker - look for lowest empty space
			for (int row = 5; row >= 0; row--) {
				if (board[row][play] == ' ') {
					board[row][play] = player;
					break;
				}
			}
			
			//determine if winner
			//check across
			for (int row = 0; row < 6; row++) {
				for (int col = 0; col <= 3; col++) {
					if (board[row][col] == player &&
						board[row][col + 1] == player &&
						board[row][col + 2] == player &&
						board[row][col + 3] == player) {
						
						winner = true;
					}
				}
			}
						
			//check up and down
			for (int row = 0; row <= 2; row++) {
				for (int col = 0; col <= 6; col++) {
					if (board[row][col] == player &&
						board[row + 1][col] == player &&
						board[row + 2][col] == player &&
						board[row + 3][col] == player) {

						winner = true;
					}
				}
			}
			
			//check diagonal (forward slash)
			for (int row = 3; row <= 5; row++) {
				for (int col = 0; col <= 3; col++) {
					if (board[row][col] == player &&
						board[row - 1][col + 1] == player &&
						board[row - 2][col + 2] == player &&
						board[row - 3][col + 3] == player) {

						winner = true;
					}
				}
			}
			
			//check diagonal (back slash)
			for (int row = 0; row <= 2; row++) {
				for (int col = 0; col <= 3; col++) {
					if (board[row][col] == player &&
						board[row + 1][col + 1] == player &&
						board[row + 2][col + 2] == player &&
						board[row + 3][col + 3] == player) {

						winner = true;
					}
				}
			}

			turn++;
			
			if (player == 'R') {
				player = 'B';
			}
			else {
				player = 'R';
			}
			
			
			
		} //end play turn
	
		//redisplay board
		display(board);
		
		//declare winner
		if (winner == false) {
			System.out.println("Game over.  Tie.");
		}
		else {
			if (player == 'R') {
				System.out.println("Black won");
			}
			else {
				System.out.println("Red won");				
			}
		}
		
		
		
	} //end main

	private static void display(char[][] board) {
		System.out.println(" 0 1 2 3 4 5 6 ");
		System.out.println("---------------");
		for (int row = 0; row < board.length; row++) {
			System.out.print('|');
			for (int col = 0; col < board[row].length; col++) {
				System.out.print(board[row][col]);
				System.out.print('|');
			}
			System.out.println();
			System.out.println("---------------");	
		}
		System.out.println(" 0 1 2 3 4 5 6 ");
	}

} //end class