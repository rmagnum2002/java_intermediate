package draw_oval_with_slider;

import java.awt.Window;
import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		TheWindow w = new TheWindow();
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.setSize(250, 250);
		w.setVisible(true);
	}
}
