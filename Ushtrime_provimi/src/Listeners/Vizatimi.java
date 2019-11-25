package Listeners;


import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class Vizatimi extends JComponent {
	private int x;
	private int y;
	

	public Vizatimi(int x, int y) {
		this.x = x;
		this.y = y;
	}


	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;
		Rreth s = new Rreth(x,y);
		s.draw(g2);
}
}
