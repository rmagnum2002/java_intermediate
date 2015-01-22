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
		super("NewBrowser");
		
		addressBar = new JTextField("");
		addressBar.requestFocus();
		addressBar.setFont(new java.awt.Font("Arial", Font.PLAIN, 16));
		
		addressBar.addActionListener(
			new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(e.getActionCommand());
					loadPage(e.getActionCommand());
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
		//add(display, BorderLayout.CENTER);
		
		add(new JScrollPane(display), BorderLayout.CENTER);
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
