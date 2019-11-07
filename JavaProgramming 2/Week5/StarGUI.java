package Week5;

import java.awt.Color;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StarGUI extends JFrame {
	JPanel p = new JPanel();
	JLabel labels;

	public StarGUI() {
		p.setLayout(null);
		p.setBackground(Color.YELLOW);
		setSize(500, 300);

		Scanner in = new Scanner(System.in);
		System.out.print("Line: ");
		int line = in.nextInt();
		in.close();
		
		int x = 480 / line;
		int y = 250 / line;

		for (int i = 0; i <= line; i++) {
			for (int j = 0; j < i; j++) {
				labels = new JLabel("*");
				labels.setForeground(Color.MAGENTA);
				labels.setLocation(x * j + 5, y * i);
				labels.setSize(20, 20);
				p.add(labels);
			}
		}
		add(p);
		setVisible(true); // 프레임을 화면에 표시한다.
	}

	public static void main(String args[]) {
		StarGUI f = new StarGUI();
	}
}