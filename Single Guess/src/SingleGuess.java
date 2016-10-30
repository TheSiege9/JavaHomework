//Curtis Collins

import java.util.Scanner;

public class SingleGuess {

	public static void main(String[] args) {
	

	int secret = (int) ((Math.random()*10)+1);
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.print("Enter a guess: ");
	
	int guess = keyboard.nextInt();
	
	if (guess < secret){
		System.out.println("Too low.");
	}
	
	if (guess > secret){
		System.out.println("Too high.");
	}	
	
	if (guess == secret){
		System.out.println("You are correct!");
	}
	
	
	
	
	}
		
		
	}
