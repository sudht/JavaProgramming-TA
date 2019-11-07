package Week8;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame extends JFrame {
	private JButton button1;

	private JPanel panel;
	MyListener listener = new MyListener();

	public MyFrame() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setTitle("이벤트 예제");
		panel = new JPanel();
		button1 = new JButton("Random Color");
		button1.addActionListener(listener);
		panel.add(button1);

		this.add(panel);
		this.setVisible(true);
	}

	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int r = (int) Math.round(Math.random() * 255);
			int g = (int) Math.round(Math.random() * 255);
			int b = (int) Math.round(Math.random() * 255);

			Color col = new Color(r, g, b);

			if (e.getSource() == button1) {
				panel.setBackground(col);
			}
		}
	}
}

public class ChangeBackground {
	public static void main(String[] args) {
		MyFrame t = new MyFrame();
	}
}