import javax.swing.*;
import java.awt.*;

public class deckDisplay {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Three Cards");
		
		frame.setSize(270,150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(1,3));
		
		String a = randomWithRange(1,52);
		String b = randomWithRange(1,52);
		String c = randomWithRange(1,52);
		
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
