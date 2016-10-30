import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.*;

public class regularPolygonPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	
	public static final int PENTAGON = 5;
	public static final int HEXAGON = 6;
	public static final int HEPTAGON = 7;
	public static final int OCTAGON = 8;
	public static final int NONAGON = 9;
	public static final int DECAGON = 10;
	
	int[] xCoord5 = {10,10,10,10,10};
	int[] yCoord5 = {10,10,10,10,10};
	int[] xCoord6 = {10,10,10,10,10,10};
	int[] yCoord6 = {10,10,10,10,10,10};
	int[] xCoord7 = {10,10,10,10,10,10,10};
	int[] yCoord7 = {10,10,10,10,10,10,10};
	int[] xCoord8 = {10,10,10,10,10,10,10,10};
	int[] yCoord8 = {10,10,10,10,10,10,10,10};
	int[] xCoord9 = {10,10,10,10,10,10,10,10,10};
	int[] yCoord9 = {10,10,10,10,10,10,10,10,10};
	int[] xCoord10 = {10,10,10,10,10,10,10,10,10,10};
	int[] yCoord10 = {10,10,10,10,10,10,10,10,10,10};
	
	private int type = 1;
	
	public regularPolygonPanel () {
		
	}
	
	public regularPolygonPanel (int type) {
		this.type = type;
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	
		switch (type){
		case PENTAGON:
			g.drawPolygon(xCoord5, yCoord5, type);
			
		}
		switch (type){
		case HEXAGON:
			g.drawPolygon(xCoord6, yCoord6, type);
			
		}
		switch (type){
		case HEPTAGON:
			g.drawPolygon(xCoord7, yCoord7, type);
			
		}
		switch (type){
		case OCTAGON:
			g.drawPolygon(xCoord8, yCoord8, type);
			
		}
		switch (type){
		case NONAGON:
			g.drawPolygon(xCoord9, yCoord9, type);
			
		}
		switch (type){
		case DECAGON:
			g.drawPolygon(xCoord10, yCoord10, type);
			
		}
		
	}
	public int getType() {
		return type;
	}
	public void setType() {
		this.type = type;
		repaint();
	}
	public Dimension getPreferredSize() {
		return new Dimension (400,400);
	}
}
