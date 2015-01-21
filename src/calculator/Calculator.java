package calculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

import javax.swing.*;
import javax.swing.border.Border;

public class Calculator extends JFrame {
	private JTextField screenBar;
	private JPanel buttons;
	private JPanel nbuttons;
	private JPanel fbuttons;
	private double a1;
	private double a2;
	
	public Calculator(){
		super("Calculator");
		screenBar = new JTextField();
		screenBar.setText("0");
		screenBar.setHorizontalAlignment(JTextField.RIGHT);
		screenBar.setFont(new java.awt.Font("Arial", Font.BOLD, 36));
		screenBar.setEditable(false);
		
		JButton[] fButtons = new JButton[7];
		JButton[] numberButtons = new JButton[10];
		
		String[] arr = {"cButton", "multiplyButton", "divideButton", "addButton", "substractButton", "enterButton"};
		String[] arr1 = {"C", "*", "/", "+", "-", "Enter"};
		
		for (int i = 0; i < arr.length; i++) {
			fButtons[i] = new JButton(arr1[i]);
		}
		
		for (int i = 9; i >= 0; i--) {
			numberButtons[i] = new JButton(Integer.toString(i));
		}
		
		buttons = new JPanel();
		buttons.setBackground(Color.BLUE);
		buttons.setLayout(new GridLayout(0, 2));

		nbuttons = new JPanel();		
		for(int i = 9; i>=0; i--) {
			numberButtons[i].setFont(new java.awt.Font("Arial", Font.BOLD, 24));
			numberButtons[i].setBackground(Color.WHITE);

			numberButtons[i].addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						if (screenBar.getText().equals("0")){
							screenBar.setText("7");
						}else{
							if (screenBar.getText().length() <= 10) {
								screenBar.setText(screenBar.getText().concat("6"));
							}
						}
					}
				}
			);
			
            nbuttons.add(numberButtons[i]);
        }

		fbuttons = new JPanel();
		for(int i = 0; i < arr.length; i++) {
			fButtons[i].setFont(new java.awt.Font("Arial", Font.BOLD, 24));
			fButtons[i].setBackground(Color.WHITE);

			fButtons[i].addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("f button was clicked");
						System.out.println(((JButton) e.getSource()).getName() + " Click");
					}
				}
			);
			
            fbuttons.add(fButtons[i]);
        }
		
		buttons.add(nbuttons, BorderLayout.WEST);
		buttons.add(fbuttons, BorderLayout.EAST);
		add(screenBar, BorderLayout.NORTH);
		add(buttons);
	}

	public void actionPerformed(ActionEvent e) { 
		 
	}
	
}