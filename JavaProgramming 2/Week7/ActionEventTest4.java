package Week7;

//이벤트 처리를 위한 패키지 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame extends JFrame {

	private JButton button;
	private JLabel label;

	public MyFrame() {
		this.setSize(250, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");

		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오");

		label = new JLabel("아직 버튼이 눌려지지 않았습니다");
		button.addActionListener(new ActionListener() {
			int count = 0;
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button) {
					label.setText("버튼을 누른 횟수: " + ++count);
				}
			}

		});
		panel.add(button);
		panel.add(label);

		this.add(panel);
		this.setVisible(true);
	}

}

public class ActionEventTest4 {
	public static void main(String[] args) {
		MyFrame t = new MyFrame();
	}
}
