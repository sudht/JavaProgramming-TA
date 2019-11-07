package Week8;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Point {
	int x, y;
}

class MyPanel3 extends JPanel{
	private int index = 0;
	Point[] array = new Point[1000];
	Color color = Color.BLACK;;

	public MyPanel3() {
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyChar());
				switch (e.getKeyChar()) {
				case 'r':
					color = Color.RED;
					break;
				case 'g':
					color = Color.GREEN;
					break;
				case 'b':
					color = Color.BLUE;
					break;
				default:
					color = Color.BLACK;
				}
				repaint();
			}
		});

		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				if (index > 1000)
					return;
				array[index] = new Point();
				array[index].x = e.getX();
				array[index].y = e.getY();
				index++;
				repaint();
			}
		});

		this.requestFocus();
		setFocusable(true);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(color);
		for (Point p : array)
			if (p != null)
				g.drawRect(p.x, p.y, 1, 1);
	}
}

public class Scribble extends JFrame {
	public Scribble() {
		setSize(300, 300);
		setTitle("마우스로 그림 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel3());
		setVisible(true);
	}

	public static void main(String[] args) {
		Scribble s = new Scribble();
	}
}
