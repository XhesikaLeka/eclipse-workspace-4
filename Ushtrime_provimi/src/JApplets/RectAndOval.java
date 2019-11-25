package JApplets;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class RectAndOval extends JPanel{

	public void paintComponent(Graphics g)
	{
	   super.paintComponent(g);
	   g.setColor(Color.RED);
	   g.fillRect(220, 100, 50, 50);
	   g.setColor(Color.BLUE);
	   g.fillOval(220, 100, 50, 50);
	  // g.fillOval(220, 100, diameter, diameter);
	   
	}

}
