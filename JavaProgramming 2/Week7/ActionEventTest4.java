package Week7;

//�̺�Ʈ ó���� ���� ��Ű�� 
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
		this.setTitle("�̺�Ʈ ����");

		JPanel panel = new JPanel();
		button = new JButton("��ư�� �����ÿ�");

		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�");
		button.addActionListener(new ActionListener() {
			int count = 0;
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button) {
					label.setText("��ư�� ���� Ƚ��: " + ++count);
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
