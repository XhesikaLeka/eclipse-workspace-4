package Listeners;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class Rreth extends JComponent {
	private int x;
	private int y;
	public Rreth(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public  void draw( Graphics2D g2) {
		Ellipse2D.Double e1= new Ellipse2D.Double(x,y,100,100);
		g2.setColor(Color.BLACK);
		g2.fill(e1);
	
	}
}
