package Week11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// �ҽ��� �Է��ϰ� Ctrl+Shift+O�� ������ �ʿ��� ������ �����Ѵ�. 

class MyPanel1 extends JPanel {
	int flag = -1;

	public void paintComponent(Graphics g) {
		flag *= -1;
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillOval(20, 30, 200, 200);
		g.setColor(Color.BLACK);
		g.drawArc(60, 80, 50, 50, 180 * flag, -180 * flag); // ���� ��
		g.drawArc(150, 80, 50, 50, 180 * flag, -180 * flag); // ������ ��
		g.drawArc(70, 130, 100, 70, 180 * flag, 180 * flag); // ��
	}
}

public class SnowManFace extends JFrame implements ActionListener {
	public SnowManFace() {
		setSize(280, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("����� ��");
		setLayout(new BorderLayout());
		JButton b = new JButton("����������!");
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
