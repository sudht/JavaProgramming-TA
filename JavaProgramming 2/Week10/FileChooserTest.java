package Week10;

//실습 3: 파일 선택하여 이미지 띄우기
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
		setTitle("이미지 띄우기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);

		fc = new JFileChooser();

		JLabel label = new JLabel("파일 선택기 컴포넌트 테스트입니다.");
		openButton = new JButton("파일 오픈");
		openButton.addActionListener(this);

		saveButton = new JButton("파일 저장");
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

		// “파일 오픈”버튼에 대한 액션 이벤트 처리
		if (e.getSource() == openButton) {
			int returnVal = fc.showOpenDialog(this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				ImageIcon ic = new ImageIcon();
				try {
					ic = new ImageIcon(ImageIO.read(file));
				} catch (Exception e1) {
//							e1.printStackTrace();
					System.out.println("파일을 읽어오지 못했습니다.(이미지 파일이 아닐 수 있습니다.)");
				}
				imgLabel.setIcon(ic);
				// 실제 파일을 오픈한다.
			} else {
				// 사용자 취소
			}

			// “파일 저장”버튼에 대한 액션 이벤트 처리
		} else if (e.getSource() == saveButton) {
			int returnVal = fc.showSaveDialog(this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				// 실제 파일에 저장한다.
			} else {
				// 사용자 취소
			}
		}
	}

	public static void main(String[] args) {
		FileChooserTest frame = new FileChooserTest();
	}
}
