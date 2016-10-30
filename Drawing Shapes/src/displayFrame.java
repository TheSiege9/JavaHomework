import java.awt.GridLayout;

import javax.swing.*;

public class displayFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Excersize13_25");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(525, 145);	
		frame.setLayout(new GridLayout(1,6));
		frame.add(new regularPolygonPanel(regularPolygonPanel.PENTAGON));
		frame.add(new regularPolygonPanel(regularPolygonPanel.HEXAGON));
		frame.add(new regularPolygonPanel(regularPolygonPanel.HEPTAGON));
		frame.add(new regularPolygonPanel(regularPolygonPanel.OCTAGON));
		frame.add(new regularPolygonPanel(regularPolygonPanel.NONAGON));
		frame.add(new regularPolygonPanel(regularPolygonPanel.DECAGON));
		frame.setVisible(true);
	}

}
