package Week5;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridTest extends JFrame {
	JPanel p1;

	public GridTest() {
		setSize(300, 200);
		setTitle("GridTest");
		p1 = new JPanel();
		p1.setLayout(new GridLayout(0, 3));
		for (int i = 0; i < 10; i++)
			p1.add(new JButton("Button" + i));
		add(p1);
		setVisible(true); // �������� ȭ�鿡 ǥ���Ѵ�.
	}
	
	public static void main(String args[]) {
		GridTest f = new GridTest();
	}
}