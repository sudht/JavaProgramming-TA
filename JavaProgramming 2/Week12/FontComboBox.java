package Week12;
// 실습 1 : 폰트 바꾸기 (콤보 박스 형식)
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


class FontComboBoxPanel extends JPanel {

	Font f1, f2, f3;
	int fontIndex;

	public FontComboBoxPanel() {
		f1 = new Font("Serif", Font.BOLD, 20);
		f2 = new Font("Monospaced", Font.BOLD, 20);
		f3 = new Font("DialogInput", Font.BOLD, 20);
		
		String[] fonts = {"Serif", "Monospaced", "DialogInput"};
		JComboBox fontList = new JComboBox(fonts);
		fontList.setSelectedIndex(0);
		fontList.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox) e.getSource();
				fontIndex = cb.getSelectedIndex();
				repaint();
			}
		});
		add(fontList);
	}


	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(fontIndex==0)
			g.setFont(f1);
		else if(fontIndex==1)
			g.setFont(f2);
		else
			g.setFont(f3);
		g.drawString("Kangwon National University", 10, 50);
	}
}

public class FontComboBox extends JFrame{
	public FontComboBox() {
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Font Test");
		JPanel panel = new FontComboBoxPanel();
		add(panel);
		setVisible(true);
	}

	public static void main(String[] args) {
		FontComboBox s = new FontComboBox();

	}

}
