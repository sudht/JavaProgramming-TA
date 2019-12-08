package Week12;

// 실습 3 : Gradient 색상 선택기
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FillColorShape extends JFrame {
	JColorChooser colorChooser;
	JButton btn1, btn2;
	Color color1 = Color.WHITE, color2 = Color.RED;
	FillColorPanel panel;

	public FillColorShape() {
		setSize(750, 300);
		setTitle("Java 2D Shapes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		colorChooser = new JColorChooser(); // 생성자 호출
		add(colorChooser, BorderLayout.WEST);
		colorChooser.setBorder(BorderFactory.createTitledBorder("색상 선택"));
		panel = new FillColorPanel();
		JPanel btnPanel = new JPanel();
		add(panel, BorderLayout.CENTER);
		btn1 = new JButton("색1");
		btn2 = new JButton("색2");
		btn1.addActionListener(new ButtonAction());
		btn2.addActionListener(new ButtonAction());
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		add(btnPanel, BorderLayout.SOUTH);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FillColorShape();
	}

	class ButtonAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			if (btn == btn1)
				color1 = colorChooser.getColor();
			else if (btn == btn2)
				color2 = colorChooser.getColor();
			panel.colorChange(color1, color2);
			panel.repaint();
		}

	}
}

// 색 1과 색2를 가지는 사각형의 Panel
class FillColorPanel extends JPanel {
	Shape s;
	Color color1 = Color.WHITE, color2 = Color.RED;

	public FillColorPanel() {
		s = new RoundRectangle2D.Float(10, 10, 70, 80, 20, 20);
	}

	public void colorChange(Color c1, Color c2) {
		color1 = c1;
		color2 = c2;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g2.setStroke(new BasicStroke(3));
		GradientPaint gp = new GradientPaint(0, 10, color1, 0, 70, color2);

		g2.setPaint(gp);
		g2.fill(s);

	}
}