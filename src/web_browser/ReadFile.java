package web_browser;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

public class ReadFile extends JFrame {
	private JTextField addressBar;
	private JEditorPane display;
	
	//constructor
	public ReadFile() {
		super("My browser title");
		
		addressBar = new JTextField("Enter a URL");
		addressBar.addActionListener(
			new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					loadPage(e.getActionCommand());
					System.out.println(e.getActionCommand());
				}
			}
		);
		
		add(addressBar, BorderLayout.NORTH);
		
		display = new JEditorPane();
		display.setEditable(false);
		display.addHyperlinkListener(
			new HyperlinkListener() {
				
				@Override
				public void hyperlinkUpdate(HyperlinkEvent e) {
					if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
						loadPage(e.getURL().toString());
					}
				}
			}
		);
		
		add(new JScrollPane(), BorderLayout.CENTER);
		setSize(500, 300);
		setVisible(true);
	}

	// load page to display
	private void loadPage(String userText) {
		try {
			display.setPage(userText);
			addressBar.setText(userText);
		} catch (Exception e) {
			System.out.println("Error!");
		}
	}
}
