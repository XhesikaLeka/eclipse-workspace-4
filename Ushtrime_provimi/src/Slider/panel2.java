package Slider;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class panel2 extends JPanel{
	private int diameter = 100; // default diameter


	public void paintComponent(Graphics g)
	{
	   super.paintComponent(g);
	   g.setColor(Color.BLACK);
	   //g.drawOval(220, 100, diameter, diameter);
	   g.fillOval(220, 100, diameter, diameter);
	}

	public void setDiameter(int diameter){
	   this.diameter = diameter;
	   repaint();
	   }
}