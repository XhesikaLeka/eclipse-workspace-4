package JApplets;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RectAndOvalTest {
public static void main(String[] args) {
	JFrame frame= new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.setSize(900,900);
	RectAndOval ro= new RectAndOval();
//	JPanel panel= new JPanel();
//	panel.add(ro);
	frame.add(ro);
}

}
