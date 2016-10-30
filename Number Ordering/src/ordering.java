//Curtis Collins

import java.util.Scanner;

public class ordering {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first integer: ");
		
		int a = input.nextInt();
		
		System.out.println("Enter second integer: ");
		
		int b = input.nextInt();
		
		System.out.println("Enter third integer: ");
		
		int c = input.nextInt();
		
		
		if (a <= b && b <= c) {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		else {
			if (b <= a && a <= c) {
				System.out.println(b);
				System.out.println(a);
				System.out.println(c);
			}
			else {
				if (c <= a && a <= b) {
					System.out.println(c);
					System.out.println(a);
					System.out.println(b);
				}
				else {
					if (c <= b && b <= a){
						System.out.println(c);
						System.out.println(b);
						System.out.println(a);
					}
					else {
						if (b <= c && c <= a) {
							System.out.println(b);
							System.out.println(c);
							System.out.println(a);
						}
						else {
							if (a <= c && c <= b) {
								System.out.println(a);
								System.out.println(c);
								System.out.println(b);
							}
						}
					}
				}
			}
		}
		
		
	}

}
