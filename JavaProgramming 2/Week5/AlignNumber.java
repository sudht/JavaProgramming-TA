package Week5;

import java.awt.Color;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AlignNumber extends JFrame {
	JPanel p = new JPanel();
	JLabel labels;
	
	public AlignNumber() {
		p.setLayout(null);
		p.setBackground(Color.YELLOW);
		setSize(500, 300);
		
		Scanner in = new Scanner(System.in);
		System.out.print("Column: ");
		int col = in.nextInt();
		System.out.print("Row: ");
		int row = in.nextInt();
		in.close();
		
		int x = 480 / col;
		int y = 250 / row;
		
		for (int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				labels = new JLabel("" + (j + col * i));
				labels.setForeground(Color.MAGENTA);
				labels.setLocation(x * j, y * i);
				labels.setSize(50, 20);
				p.add(labels);
			}
		}
		add(p);
		setVisible(true); // 프레임을 화면에 표시한다.
	}
	public static void main(String args[]) {
		AlignNumber f = new AlignNumber();
	}
}