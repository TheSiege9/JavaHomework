import java.util.Scanner;
public class CheckPass {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter a password that is 8 characters long involving only numbers (at least 2) and letters.");
	
		Scanner input = new Scanner(System.in);
		
		String password = input.next();
		
		if (password.length() < 8) {
			System.out.println("Invalid: Password is too short");
			System.exit(0);
			}	
		
		int count = 0;
		
		if (password.indexOf('0') > -1) {
			count++;
			int index0 = password.indexOf('0');
			if (password.indexOf('0', index0) > -1) {
				count++;
			}
		}
		if (password.indexOf('1') > -1) {
			count++;
			int index1 = password.indexOf('1');
			if (password.indexOf('1', index1) > -1) {
				count++;
			}
		}
		if (password.indexOf('2') > -1) {
			count++;
			int index2 = password.indexOf('2');
			if (password.indexOf('2', index2) > -1) {
				count++;
			}
		}
		if (password.indexOf('3') > -1) {
			count++;
			int index3 = password.indexOf('3');
			if (password.indexOf('3', index3) > -1) {
				count++;
			}
		}
		if (password.indexOf('4') > -1) {
			count++;
			int index4 = password.indexOf('4');
			if (password.indexOf('4', index4) > -1) {
				count++;
			}
		}
		if (password.indexOf('5') > -1) {
			count++;
			int index5 = password.indexOf('5');
			if (password.indexOf('5', index5) > -1) {
				count++;
			}
		}
		if (password.indexOf('6') > -1) {
			count++;
			int index6 = password.indexOf('6');
			if (password.indexOf('6', index6) > -1) {
				count++;
			}
		}
		if (password.indexOf('7') > -1) {
			count++;
			int index7 = password.indexOf('7');
			if (password.indexOf('7', index7) > -1) {
				count++;
			}
		}
		if (password.indexOf('8') > -1) {
			count++;
			int index8 = password.indexOf('8');
			if (password.indexOf('8', index8) > -1) {
				count++;
			}
		}
		if (password.indexOf('9') > -1) {
			count++;
			int index9 = password.indexOf('9');
			if (password.indexOf('9', index9) > -1) {
				count++;
			}
		}
		if (count >= 2) {
			System.out.println("This is a valid password.");
		}
		else {
			System.out.println("Invalid: Your password does not contain two numbers.");
		}
		}
		
}
