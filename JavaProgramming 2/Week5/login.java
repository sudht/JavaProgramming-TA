package Week5;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class login {
	public static void main(String[] args) {
        JFrame f = new JFrame();
        JPanel panel = new JPanel();
        f.add(panel);
        JLabel label1 = new JLabel(" ID  ");
        JLabel label2 = new JLabel("PW");
          
        JTextField field1 = new JTextField(15);
        JTextField field2 = new JTextField(15);
        JButton button = new JButton("Enter");
        panel.add(label1);
        panel.add(field1);
        panel.add(label2);
        panel.add(field2);
        panel.add(button);
        f.setSize(230, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Login");
        f.setVisible(true);
    }
}