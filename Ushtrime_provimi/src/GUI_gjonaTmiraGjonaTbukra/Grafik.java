package GUI_gjonaTmiraGjonaTbukra;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Grafik extends JComponent{

	public Grafik() {
	}
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		LinesGui rr = new LinesGui();
		rr.draw(g2);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(900, 900);
		Grafik gr = new Grafik();
		frame.add(gr);
	}
	
}
