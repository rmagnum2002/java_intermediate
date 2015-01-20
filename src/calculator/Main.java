package calculator;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calc.setVisible(true);
		calc.setResizable(false);
		calc.setSize(350, 300);
	}
}
