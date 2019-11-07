package Week10;

//�ǽ� 3: ���� �����Ͽ� �̹��� ����
import java.awt.Image;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FileChooserTest extends JFrame implements ActionListener {
	JButton openButton, saveButton;
	JFileChooser fc;
	JLabel imgLabel;

	public FileChooserTest() {
		setTitle("�̹��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);

		fc = new JFileChooser();

		JLabel label = new JLabel("���� ���ñ� ������Ʈ �׽�Ʈ�Դϴ�.");
		openButton = new JButton("���� ����");
		openButton.addActionListener(this);

		saveButton = new JButton("���� ����");
		saveButton.addActionListener(this);

		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(openButton);
		panel.add(saveButton);
		imgLabel = new JLabel();
		panel.add(imgLabel);
		add(panel);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		// ������ ���¡���ư�� ���� �׼� �̺�Ʈ ó��
		if (e.getSource() == openButton) {
			int returnVal = fc.showOpenDialog(this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				ImageIcon ic = new ImageIcon();
				try {
					ic = new ImageIcon(ImageIO.read(file));
				} catch (Exception e1) {
//							e1.printStackTrace();
					System.out.println("������ �о���� ���߽��ϴ�.(�̹��� ������ �ƴ� �� �ֽ��ϴ�.)");
				}
				imgLabel.setIcon(ic);
				// ���� ������ �����Ѵ�.
			} else {
				// ����� ���
			}

			// ������ ���塱��ư�� ���� �׼� �̺�Ʈ ó��
		} else if (e.getSource() == saveButton) {
			int returnVal = fc.showSaveDialog(this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				// ���� ���Ͽ� �����Ѵ�.
			} else {
				// ����� ���
			}
		}
	}

	public static void main(String[] args) {
		FileChooserTest frame = new FileChooserTest();
	}
}
