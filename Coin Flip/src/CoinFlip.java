//Curtis Collins

public class CoinFlip {

	public static void main(String[] args) {
		
		int flips = 0;
		int heads = 0;
		int tails = 0;
		
		while (flips <= 1000000) {
			if (Math.random() <= .5) {
				heads++;
			}
			else {
				tails++;
			}
			flips++;
		}
		System.out.println(heads);
		System.out.println(tails);
	
	}

}
