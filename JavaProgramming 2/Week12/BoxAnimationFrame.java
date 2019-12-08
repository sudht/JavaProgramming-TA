package Week12;
// 응용 3 : 애니메이션 작성하기
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

// 소스를 입력하고 Ctrl+Shift+O를 눌러서 필요한 파일을 포함한다. 

class BoxAnimationPanel extends JPanel implements ActionListener {

	private final int WIDTH = 500;
	private final int HEIGHT = 300;
	private final int START_X = 0;
	private final int START_Y = 250;
	private Timer timer;
	private int x, y;
	private int xDir = 1, yDir = -1;

	public BoxAnimationPanel() {
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setDoubleBuffered(true);

		x = START_X;
		y = START_Y;

		timer = new Timer(10, this);
		timer.start();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.drawRect(x, y, 10, 10);//(image, x, y, this);
		g.fillRect(x, y, 10, 10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		x += 1*xDir;
		y += 1*yDir;
		if (x+11 > WIDTH||x<0) {
			xDir*=-1;
		}
		if (y<0||y+10>HEIGHT)
			yDir *= -1;
		repaint();
	}
}

public class BoxAnimationFrame extends JFrame {

	public BoxAnimationFrame() {
		add(new BoxAnimationPanel());
		setTitle("애니메이션 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new BoxAnimationFrame();
	}
}