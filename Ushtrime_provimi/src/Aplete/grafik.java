package Aplete;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class grafik extends JComponent{
	public grafik(){
		
	}
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		RectRound rr = new RectRound(100,100,50);
		rr.draw(g2);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(250, 250);
		grafik gr = new grafik();
		frame.add(gr);
	}
}