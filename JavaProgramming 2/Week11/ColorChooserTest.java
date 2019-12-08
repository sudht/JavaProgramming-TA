package Week11;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

// �ҽ��� �Է��ϰ� Ctrl+Shift+O�� ������ �ʿ��� ������ �����Ѵ�. 

public class ColorChooserTest extends JFrame implements ChangeListener {

	protected JColorChooser color;
	JLabel l;

	public ColorChooserTest() {
		setTitle("���� ���ñ�  �׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		color = new JColorChooser(); // ������ ȣ��
		color.getSelectionModel().addChangeListener(this); // ������ ���
		color.setBorder(BorderFactory.createTitledBorder("���� ����"));

		JPanel panel = new JPanel();
		l = new JLabel("���� ���ñ� �׽�Ʈ");

		panel.add(color);
		panel.add(l);
		add(panel);

		pack();
		this.setVisible(true);

	}

	public void stateChanged(ChangeEvent e) {
		Color newColor = color.getColor();
		System.out.println(newColor);
		l.setForeground(newColor);
	}

	public static void main(String[] args) {
		new ColorChooserTest();
	}
}