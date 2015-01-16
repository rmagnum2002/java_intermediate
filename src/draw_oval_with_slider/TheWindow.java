package draw_oval_with_slider;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TheWindow extends JFrame {
	
	private JSlider slider;
	private DrawOval myPanel;
	
	public TheWindow() {
		super("The window title");
		myPanel = new DrawOval();
		myPanel.setBackground(Color.ORANGE);
		
		slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10); // slider direction, start, end, ???
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		
		slider.addChangeListener(
				new ChangeListener() {					
					@Override
					public void stateChanged(ChangeEvent e) {
						// TODO Auto-generated method stub
						// https://www.youtube.com/watch?v=X8ffr3UeE8c 2.43
						
					}
				}
		);		
	}	
}
