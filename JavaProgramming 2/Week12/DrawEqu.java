package Week12;
// 응용 4 : 3차 함수 그리기
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

// 소스를 입력하고 Ctrl+Shift+O를 눌러서 필요한 파일을 포함한다. 

public class DrawEqu extends JPanel implements ActionListener {
	JTextField a, b, c, d;
	double A, B, C, D;

	public DrawEqu() {
		a = new JTextField("1.0", 8);
		b = new JTextField("-5.0", 8);
		c = new JTextField("6.0", 8);
		d = new JTextField("3.0", 8);
		add(a);
		add(b);
		add(c);
		add(d);
		JButton button = new JButton("DRAW");
		add(button);
		button.addActionListener(this);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.drawLine(0, 200, 400, 200);
		g2.drawLine(200, 0, 200, 400);
		g2.setPaint(Color.red);
		for (int i = -20; i < 20; i++) {
			int x = i;
			int y = (int) (A * x * x * x+ B * x * x + C * x + D);
//			int y = (int) (A * x * x - B * x + C);
			g2.fillOval(200 + x - 2, 200 - (y - 2), 4, 4);
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		A = Double.parseDouble(a.getText());
		B = Double.parseDouble(b.getText());
		C = Double.parseDouble(c.getText());
		D = Double.parseDouble(d.getText());
		repaint();
	}

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new DrawEqu());
		f.setSize(500, 400);
		f.setVisible(true);
	}
}