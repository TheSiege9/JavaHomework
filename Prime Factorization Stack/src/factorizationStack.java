import java.util.Scanner;
import java.util.Stack;

public class factorizationStack {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt(); 
		int prime = 2;
		Stack numbers = new Stack();
		
		while (number > prime) {
			if (number % prime == 0) {
				number = number / prime;
				numbers.push( new Integer(prime));
				
			}
			else {
				prime++;
			}		
		}
		numbers.push(new Integer(prime));
		while( !numbers.empty()) {
			System.out.println(numbers.pop());
			}
	}

}
