package Week11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 소스를 입력하고 Ctrl+Shift+O를 눌러서 필요한 파일을 포함한다. 

class MyPanel1 extends JPanel {
	int flag = -1;

	public void paintComponent(Graphics g) {
		flag *= -1;
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillOval(20, 30, 200, 200);
		g.setColor(Color.BLACK);
		g.drawArc(60, 80, 50, 50, 180 * flag, -180 * flag); // 왼쪽 눈
		g.drawArc(150, 80, 50, 50, 180 * flag, -180 * flag); // 오른쪽 눈
		g.drawArc(70, 130, 100, 70, 180 * flag, 180 * flag); // 입
	}
}

public class SnowManFace extends JFrame implements ActionListener {
	public SnowManFace() {
		setSize(280, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("눈사람 얼굴");
		setLayout(new BorderLayout());
		JButton b = new JButton("눌러보세요!");
		b.addActionListener(this);
		add(b, BorderLayout.SOUTH);
		setVisible(true);
		add(new MyPanel1());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();

	}

	public static void main(String[] args) {
		SnowManFace s = new SnowManFace();
	}
}
