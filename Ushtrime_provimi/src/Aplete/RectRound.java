package Aplete;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class RectRound {
	private int x;
	private int y;
	private int width;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public RectRound(int x, int y, int width) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
	}
	public RectRound() {
	}
	public void draw(Graphics2D g2) {
	Rectangle r = new Rectangle(x,y,width,width);
	Ellipse2D.Double e =new Ellipse2D.Double(x+x/9,y+y/9,width/2,width/2);
	g2.setColor(Color.BLUE);
	g2.fill(r);
	g2.setColor(Color.RED);
	g2.fill(e);
	}
	
}