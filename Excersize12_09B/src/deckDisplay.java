import javax.swing.*;
import java.awt.*;

public class deckDisplay {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Three Cards");
		
		frame.setSize(270,150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(1,3));
		
		String a = randomWithRange(1,54);
		String b = randomWithRange(1,54);
		String c = randomWithRange(1,54);
		
		int aNum = Integer.parseInt(a);
		int bNum = Integer.parseInt(b);
		int cNum = Integer.parseInt(c);
		
		int total = 0;
		
		if (aNum == 1) {
			total = total + 1;
		}
		if (aNum == 2) {
			total = total + 2;
		}
		if (aNum == 3) {
			total = total + 3;
		}
		if (aNum == 4) {
			total = total + 4;
		}
		if (aNum == 5) {
			total = total + 5;
		}
		if (aNum == 6) {
			total = total + 6;
		}
		if (aNum == 7) {
			total = total + 7;
		}
		if (aNum == 8) {
			total = total + 8;
		}
		if (aNum == 9) {
			total = total + 9;
		}
		if (aNum == 10) {
			total = total + 10;
		}
		if (aNum == 11) {
			total = total + 10;
		}
		if (aNum == 12) {
			total = total + 10;
		}
		if (aNum == 13) {
			total = total + 10;
		}
		if (aNum == 14) {
			total = total + 1;
		}
		if (aNum == 15) {
			total = total + 2;
		}
		if (aNum == 16) {
			total = total + 3;
		}
		if (aNum == 17) {
			total = total + 4;
		}
		if (aNum == 18) {
			total = total + 5;
		}
		if (aNum == 19) {
			total = total + 6;
		}
		if (aNum == 20) {
			total = total + 7;
		}
		if (aNum == 21) {
			total = total + 8;
		}
		if (aNum == 22) {
			total = total + 9;
		}
		if (aNum == 23) {
			total = total + 10;
		}
		if (aNum == 24) {
			total = total + 10;
		}
		if (aNum == 25) {
			total = total + 10;
		}
		if (aNum == 26) {
			total = total + 10;
		}
		if (aNum == 27) {
			total = total + 1;
		}
		if (aNum == 28) {
			total = total + 2;
		}
		if (aNum == 29) {
			total = total + 3;
		}
		if (aNum == 30) {
			total = total + 4;
		}
		if (aNum == 31) {
			total = total + 5;
		}
		if (aNum == 32) {
			total = total + 6;
		}
		if (aNum == 33) {
			total = total + 7;
		}
		if (aNum == 34) {
			total = total + 8;
		}
		if (aNum == 35) {
			total = total + 9;
		}
		if (aNum == 36) {
			total = total + 10;
		}
		if (aNum == 37) {
			total = total + 10;
		}
		if (aNum == 38) {
			total = total + 10;
		}
		if (aNum == 39) {
			total = total + 10;
		}
		if (aNum == 40) {
			total = total + 1;
		}
		if (aNum == 41) {
			total = total + 2;
		}
		if (aNum == 42) {
			total = total + 3;
		}
		if (aNum == 43) {
			total = total + 4;
		}
		if (aNum == 44) {
			total = total + 5;
		}
		if (aNum == 45) {
			total = total + 6;
		}
		if (aNum == 46) {
			total = total + 7;
		}
		if (aNum == 47) {
			total = total + 8;
		}
		if (aNum == 48) {
			total = total + 9;
		}
		if (aNum == 49) {
			total = total + 10;
		}
		if (aNum == 50) {
			total = total + 10;
		}
		if (aNum == 51) {
			total = total + 10;
		}
		if (aNum == 52) {
			total = total + 10;
		}
		if (bNum == 1) {
			total = total + 1;
		}
		if (bNum == 2) {
			total = total + 2;
		}
		if (bNum == 3) {
			total = total + 3;
		}
		if (bNum == 4) {
			total = total + 4;
		}
		if (bNum == 5) {
			total = total + 5;
		}
		if (bNum == 6) {
			total = total + 6;
		}
		if (bNum == 7) {
			total = total + 7;
		}
		if (bNum == 8) {
			total = total + 8;
		}
		if (bNum == 9) {
			total = total + 9;
		}
		if (bNum == 10) {
			total = total + 10;
		}
		if (bNum == 11) {
			total = total + 10;
		}
		if (bNum == 12) {
			total = total + 10;
		}
		if (bNum == 13) {
			total = total + 10;
		}
		if (bNum == 14) {
			total = total + 1;
		}
		if (bNum == 15) {
			total = total + 2;
		}
		if (bNum == 16) {
			total = total + 3;
		}
		if (bNum == 17) {
			total = total + 4;
		}
		if (bNum == 18) {
			total = total + 5;
		}
		if (bNum == 19) {
			total = total + 6;
		}
		if (bNum == 20) {
			total = total + 7;
		}
		if (bNum == 21) {
			total = total + 8;
		}
		if (bNum == 22) {
			total = total + 9;
		}
		if (bNum == 23) {
			total = total + 10;
		}
		if (bNum == 24) {
			total = total + 10;
		}
		if (bNum == 25) {
			total = total + 10;
		}
		if (bNum == 26) {
			total = total + 10;
		}
		if (bNum == 27) {
			total = total + 1;
		}
		if (bNum == 28) {
			total = total + 2;
		}
		if (bNum == 29) {
			total = total + 3;
		}
		if (bNum == 30) {
			total = total + 4;
		}
		if (bNum == 31) {
			total = total + 5;
		}
		if (bNum == 32) {
			total = total + 6;
		}
		if (bNum == 33) {
			total = total + 7;
		}
		if (bNum == 34) {
			total = total + 8;
		}
		if (bNum == 35) {
			total = total + 9;
		}
		if (bNum == 36) {
			total = total + 10;
		}
		if (bNum == 37) {
			total = total + 10;
		}
		if (bNum == 38) {
			total = total + 10;
		}
		if (bNum == 39) {
			total = total + 10;
		}
		if (bNum == 40) {
			total = total + 1;
		}
		if (bNum == 41) {
			total = total + 2;
		}
		if (bNum == 42) {
			total = total + 3;
		}
		if (bNum == 43) {
			total = total + 4;
		}
		if (bNum == 44) {
			total = total + 5;
		}
		if (bNum == 45) {
			total = total + 6;
		}
		if (bNum == 46) {
			total = total + 7;
		}
		if (bNum == 47) {
			total = total + 8;
		}
		if (bNum == 48) {
			total = total + 9;
		}
		if (bNum == 49) {
			total = total + 10;
		}
		if (bNum == 50) {
			total = total + 10;
		}
		if (bNum == 51) {
			total = total + 10;
		}
		if (bNum == 52) {
			total = total + 10;
		}
		if (cNum == 1) {
			total = total + 1;
		}
		if (cNum == 2) {
			total = total + 2;
		}
		if (cNum == 3) {
			total = total + 3;
		}
		if (cNum == 4) {
			total = total + 4;
		}
		if (cNum == 5) {
			total = total + 5;
		}
		if (cNum == 6) {
			total = total + 6;
		}
		if (cNum == 7) {
			total = total + 7;
		}
		if (cNum == 8) {
			total = total + 8;
		}
		if (cNum == 9) {
			total = total + 9;
		}
		if (cNum == 10) {
			total = total + 10;
		}
		if (cNum == 11) {
			total = total + 10;
		}
		if (cNum == 12) {
			total = total + 10;
		}
		if (cNum == 13) {
			total = total + 10;
		}
		if (cNum == 14) {
			total = total + 1;
		}
		if (cNum == 15) {
			total = total + 2;
		}
		if (cNum == 16) {
			total = total + 3;
		}
		if (cNum == 17) {
			total = total + 4;
		}
		if (cNum == 18) {
			total = total + 5;
		}
		if (cNum == 19) {
			total = total + 6;
		}
		if (cNum == 20) {
			total = total + 7;
		}
		if (cNum == 21) {
			total = total + 8;
		}
		if (cNum == 22) {
			total = total + 9;
		}
		if (cNum == 23) {
			total = total + 10;
		}
		if (cNum == 24) {
			total = total + 10;
		}
		if (cNum == 25) {
			total = total + 10;
		}
		if (cNum == 26) {
			total = total + 10;
		}
		if (cNum == 27) {
			total = total + 1;
		}
		if (cNum == 28) {
			total = total + 2;
		}
		if (cNum == 29) {
			total = total + 3;
		}
		if (cNum == 30) {
			total = total + 4;
		}
		if (cNum == 31) {
			total = total + 5;
		}
		if (cNum == 32) {
			total = total + 6;
		}
		if (cNum == 33) {
			total = total + 7;
		}
		if (cNum == 34) {
			total = total + 8;
		}
		if (cNum == 35) {
			total = total + 9;
		}
		if (cNum == 36) {
			total = total + 10;
		}
		if (cNum == 37) {
			total = total + 10;
		}
		if (cNum == 38) {
			total = total + 10;
		}
		if (cNum == 39) {
			total = total + 10;
		}
		if (cNum == 40) {
			total = total + 1;
		}
		if (cNum == 41) {
			total = total + 2;
		}
		if (cNum == 42) {
			total = total + 3;
		}
		if (cNum == 43) {
			total = total + 4;
		}
		if (cNum == 44) {
			total = total + 5;
		}
		if (cNum == 45) {
			total = total + 6;
		}
		if (cNum == 46) {
			total = total + 7;
		}
		if (cNum == 47) {
			total = total + 8;
		}
		if (cNum == 48) {
			total = total + 9;
		}
		if (cNum == 49) {
			total = total + 10;
		}
		if (cNum == 50) {
			total = total + 10;
		}
		if (cNum == 51) {
			total = total + 10;
		}
		if (cNum == 52) {
			total = total + 10;
		}
		
		System.out.println(total);
		String directory = "E:/card/1.png";
		
		String replaced1 = directory.replace("1", a);
		ImageIcon icon1 = new ImageIcon(replaced1);
		String replaced2 = directory.replace("1", b);
		ImageIcon icon2 = new ImageIcon(replaced2);
		String replaced3 = directory.replace("1", c);
		ImageIcon icon3 = new ImageIcon(replaced3);
	
		JLabel label1 = new JLabel();
		label1.setIcon(icon1);
		frame.add(label1);
		JLabel label2 = new JLabel();
		label2.setIcon(icon2);
		frame.add(label2);
		JLabel label3 = new JLabel();
		label3.setIcon(icon3);
		frame.add(label3);
				
		frame.setVisible(true);
	}
	
	public static String randomWithRange(int min, int max) {
		int range = (max - min) + 1;
		int s = (int)(Math.random() * range) + min;
		return Integer.toString(s);
		
	}

}
