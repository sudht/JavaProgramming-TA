package Week10;
// �ǽ� 2: ���� �����ϱ�
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

// �ҽ��� �Է��ϰ� Ctrl+Shift+O�� ������ �ʿ��� ������ �����Ѵ�. 

class BackgroundFrame extends JFrame implements ChangeListener{
	private JSlider slider1, slider2, slider3;
	static final int INIT_VALUE = 15;

	private JPanel panel;

	public BackgroundFrame() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setTitle("���� ����");
		
		panel = new JPanel();
		slider1 = new JSlider(0, 255, INIT_VALUE);
        slider1.setMajorTickSpacing(100);	// ū ���� ����
        slider1.setMinorTickSpacing(10);	// ���� ���� ����
        slider1.setPaintTicks(true);		// ������ ǥ���Ѵ�.
        slider1.setPaintLabels(false);		// ���� ���̺�� ǥ���Ѵ�.
        slider1.addChangeListener(this);	// �̺�Ʈ �����ʸ� ���δ�.
        panel.add(slider1);
        slider2 = new JSlider(0, 255, INIT_VALUE);
        slider2.setMajorTickSpacing(100);	// ū ���� ����
        slider2.setMinorTickSpacing(10);	// ���� ���� ����
        slider2.setPaintTicks(true);		// ������ ǥ���Ѵ�.
        slider2.setPaintLabels(false);		// ���� ���̺�� ǥ���Ѵ�.
        slider2.addChangeListener(this);	// �̺�Ʈ �����ʸ� ���δ�.
        panel.add(slider2);
        slider3 = new JSlider(0, 255, INIT_VALUE);
        slider3.setMajorTickSpacing(100);	// ū ���� ����
        slider3.setMinorTickSpacing(10);	// ���� ���� ����
        slider3.setPaintTicks(true);		// ������ ǥ���Ѵ�.
        slider3.setPaintLabels(false);		// ���� ���̺�� ǥ���Ѵ�.
        slider3.addChangeListener(this);	// �̺�Ʈ �����ʸ� ���δ�.        
        panel.add(slider3);
        
		this.add(panel);
		this.setVisible(true);
	}
	
	public void stateChanged(ChangeEvent e) {
        JSlider source = (JSlider) e.getSource();
        if (!source.getValueIsAdjusting()) {
               int r = (int) slider1.getValue();
               int g = (int) slider2.getValue();
               int b = (int) slider3.getValue();
               panel.setBackground(new Color(r,g,b));
        }
  }

}

public class ChangeBackground {
	public static void main(String[] args) {
		BackgroundFrame t = new BackgroundFrame();
	}
}