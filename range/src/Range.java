//Curtis Collins

public class Range {

	public static void main(String[] args) {
	

	}
	
	
	public static double range(double[] numbers) {
		
		double low = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (low > numbers[i]) {
				low = numbers[i];
			}
		}
		double high = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (high < numbers[i]) {
				high = numbers[i];
			}
		}
		double range = high - low;
		return range;
	}
	
}
