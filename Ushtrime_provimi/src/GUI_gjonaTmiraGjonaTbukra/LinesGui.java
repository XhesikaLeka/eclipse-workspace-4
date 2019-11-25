package GUI_gjonaTmiraGjonaTbukra;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.Random;


public class LinesGui  {
	
	public LinesGui() {
	}
	public void draw(Graphics2D g2) {
       Random r= new Random();
		for(int i=0;i<5;i++) {
			Line2D.Double line= new Line2D.Double(r.nextInt(50),r.nextInt(50),r.nextInt(150),r.nextInt(250));
			g2.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
			g2.draw(line);
			g2.setStroke(new BasicStroke(r.nextInt(10)));
		}
		}
		

}
