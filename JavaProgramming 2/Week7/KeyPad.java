package Week7;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KeyPad extends JFrame implements ActionListener {
	private JTextField txt;
	private JPanel panel;

	public KeyPad() {
		txt = new JTextField(20);
		txt.setText("0");
		add(txt, BorderLayout.NORTH);
		panel = new JPanel();
		panel.setLayout(new GridLayout(4, 3));
		add(panel, BorderLayout.CENTER);
		for (int i = 1; i <= 9; i++) {
			JButton btn = new JButton("" + i);
			btn.addActionListener(this);
			btn.setPreferredSize(new Dimension(100, 100));
			panel.add(btn);
		}

		JButton plus_1 = new JButton("+1");
		plus_1.addActionListener(this);
		panel.add(plus_1);
		JButton mul_2 = new JButton("*2");
		mul_2.addActionListener(this);
		panel.add(mul_2);
		JButton clear = new JButton("C");
		clear.addActionListener(this);
		panel.add(clear);

		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("+1")) {
			String tmp = txt.getText();
			int num = Integer.parseInt(tmp) + 1;
			tmp = Integer.toString(num);
			txt.setText(tmp);
		} else if (e.getActionCommand().equals("*2")) {
			String tmp = txt.getText();
			int num = Integer.parseInt(tmp) * 2;
			tmp = Integer.toString(num);
			txt.setText(tmp);
		} else if (e.getActionCommand().equals("C")) {
			txt.setText("0");
		} else {
			String actionCommand = e.getActionCommand();
			txt.setText(txt.getText() + actionCommand);
		}
	}

	public static void main(String[] args) {
		new KeyPad();
	}

}
