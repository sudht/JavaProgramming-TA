package Week8;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel4 extends JPanel {
	public MyPanel4() {
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				System.out.println("(x, y): (" + e.getX() + "," + e.getY() + ")");
			}
		});
	}
}

public class MouseClick extends JFrame {
	public MouseClick() {
		setSize(300, 300);
		setTitle("마우스 클릭 좌표 구하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel4());
		setVisible(true);
	}

	public static void main(String[] args) {
		MouseClick s = new MouseClick();
	}
}