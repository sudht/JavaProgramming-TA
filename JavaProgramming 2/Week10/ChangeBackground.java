package Week10;
// 실습 2: 배경색 변경하기
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

// 소스를 입력하고 Ctrl+Shift+O를 눌러서 필요한 파일을 포함한다. 

class BackgroundFrame extends JFrame implements ChangeListener{
	private JSlider slider1, slider2, slider3;
	static final int INIT_VALUE = 15;

	private JPanel panel;

	public BackgroundFrame() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setTitle("배경색 변경");
		
		panel = new JPanel();
		slider1 = new JSlider(0, 255, INIT_VALUE);
        slider1.setMajorTickSpacing(100);	// 큰 눈금 간격
        slider1.setMinorTickSpacing(10);	// 작은 눈금 간격
        slider1.setPaintTicks(true);		// 눈금을 표시한다.
        slider1.setPaintLabels(false);		// 값을 레이블로 표시한다.
        slider1.addChangeListener(this);	// 이벤트 리스너를 붙인다.
        panel.add(slider1);
        slider2 = new JSlider(0, 255, INIT_VALUE);
        slider2.setMajorTickSpacing(100);	// 큰 눈금 간격
        slider2.setMinorTickSpacing(10);	// 작은 눈금 간격
        slider2.setPaintTicks(true);		// 눈금을 표시한다.
        slider2.setPaintLabels(false);		// 값을 레이블로 표시한다.
        slider2.addChangeListener(this);	// 이벤트 리스너를 붙인다.
        panel.add(slider2);
        slider3 = new JSlider(0, 255, INIT_VALUE);
        slider3.setMajorTickSpacing(100);	// 큰 눈금 간격
        slider3.setMinorTickSpacing(10);	// 작은 눈금 간격
        slider3.setPaintTicks(true);		// 눈금을 표시한다.
        slider3.setPaintLabels(false);		// 값을 레이블로 표시한다.
        slider3.addChangeListener(this);	// 이벤트 리스너를 붙인다.        
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