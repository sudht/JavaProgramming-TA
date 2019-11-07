package Week10;
// 실습 1: 곱셈 계산기
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldFrame extends JFrame {
	private JButton button1, button2, button3;
	private JTextField text, result;
	int mulNum = 2;

	public TextFieldFrame() {
		setSize(300, 130);
		setTitle("곱셈 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ButtonListener listener = new ButtonListener();

		JPanel panel = new JPanel();
		panel.add(new JLabel("숫자 입력: "));

		text = new JTextField(15);
		text.setText("0");
		text.addActionListener(listener);
		panel.add(text);

		panel.add(new JLabel("    곱한 값: "));

		result = new JTextField(15);
		result.setEditable(false);
		panel.add(result);

		button1 = new JButton("x2");
		button1.addActionListener(listener);
		button2 = new JButton("x3");
		button2.addActionListener(listener);
		button3 = new JButton("x4");
		button3.addActionListener(listener);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		add(panel);
		setVisible(true);
	}

	// 내부 클래스로서 텍스트 필드와 버튼의 액션 이벤트 처리
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == button1 || e.getSource() == button2 || e.getSource() == button3
					|| e.getSource() == text) {
				if(e.getSource() == button1)
					mulNum=2;
				else if(e.getSource() == button2)
					mulNum=3;
				else if(e.getSource() == button3)
					mulNum=4;
				String name = text.getText();
				int value = Integer.parseInt(name);
				result.setText(" " + value * mulNum);

				text.requestFocus();
			}
		}
	}

	public static void main(String[] args) {
		new TextFieldFrame();
	}
}