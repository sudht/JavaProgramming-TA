package Week8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel implements ActionListener {
	boolean flag = false;
	private int light_number = 0;
	private JButton r;
	private JButton g;
	private JButton y;

	public MyPanel() {
		r = new JButton("Red");
		g = new JButton("Green");
		y = new JButton("Yello");
		
		r.addActionListener(this);
		g.addActionListener(this);
		y.addActionListener(this);
		add(r);
		add(g);
		add(y);
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.drawOval(100, 100, 100, 100);
		g.drawOval(100, 200, 100, 100);
		g.drawOval(100, 300, 100, 100);
		if (light_number == 0) {
			g.setColor(Color.RED);
			g.fillOval(100, 100, 100, 100);
		} else if (light_number == 1) {
			g.setColor(Color.GREEN);
			g.fillOval(100, 200, 100, 100);
		} else {
			g.setColor(Color.YELLOW);
			g.fillOval(100, 300, 100, 100);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == r) {
			light_number = 0;
		}
		else if(e.getSource() == g) {
			light_number = 1;
		}
		else if(e.getSource() == y) {
			light_number = 2;
		}
		repaint();
	}
}

public class MyFrame2 extends JFrame {
	public MyFrame2() {
		add(new MyPanel());
		setSize(300, 500);
		setVisible(true);
	}

	public static void main(String[] arg) {
		new MyFrame2();
	}
}