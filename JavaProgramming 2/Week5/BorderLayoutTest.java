package Week5;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest extends JFrame {
	public BorderLayoutTest() {

		setTitle("BorderLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout()); // 

		add(new JButton("Button1"), BorderLayout.PAGE_START);
		add(new JButton("Button2"), BorderLayout.PAGE_END);
		add(new JButton("Button3"), BorderLayout.LINE_START);
		add(new JButton("B4"), BorderLayout.LINE_END);
		add(new JButton("Long Button5"), BorderLayout.CENTER);

		pack();
		setVisible(true);
	}
	
	public static void main(String argv[]) {
		BorderLayoutTest b = new BorderLayoutTest();
	}
}