
public class MyInteger {

	static int value = 0;
	
	static MyInteger Value = new MyInteger();
	
	public MyInteger get() {
		return Value;
	}
	
	public boolean isEven() {
		return isEven(value);
		}
	public boolean isOdd() {
		return isOdd(value);
	}
	public boolean isPrime() {
		return isPrime(value);
	}
	public static boolean isEven(int n) {
		return n % 2 == 0;		
	}
	public static boolean isOdd(int n) {
		return n % 2 == 0 ;
	}
	public static boolean isPrime(int n) {
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	public static boolean isEven(MyInteger n) {
		return isEven(n.get());
	}
	public static boolean isOdd(MyInteger n) {
		return isOdd(n.get());
	}
	public static boolean isPrime(MyInteger n) {
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	public static boolean equals(int n) {
		if (n == value) {
			return true;
		}
		return false;
	}
	public static boolean equals(MyInteger n) {
		if (n == value) {
			return true;
		}
		return false;
	}
 	public static int parseInt(char[] n){
 		char[] digits = { '1', '2', '3', '4','5','6','7','8','9','0' };
 		int number = Integer.parseInt(new String(digits));
 		return number;
 	}
 	public static int parseInt(String n) {
 		int number = Integer.parseInt(n);
 		return number;
 	}
}
