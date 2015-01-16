package draw_oval_with_slider;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;


public class DrawOval extends JPanel {
	private int d = 10; // d is diameter
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.fillOval(25, 25, d, d);
	}
	
	public void setDiameter(int newDiameter) {
		d = (newDiameter >= 0 ? newDiameter : 10);
		repaint();
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(200, 200);
	}
	
	public Dimension getMinimumSize() {
		return getPreferredSize();
	}
}
