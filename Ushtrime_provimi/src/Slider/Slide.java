package Slider;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slide extends JFrame{
private JSlider slider;
	
	public Slide() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel2 p = new panel2();
		this.add(p);
		this.setSize(600, 400);
		slider = new JSlider(JSlider.HORIZONTAL, 100, 200, 100);  
		slider.setMinorTickSpacing(1);  
		slider.setMajorTickSpacing(10);  
		slider.setPaintTicks(true);  
		slider.setPaintLabels(true);  
		
		slider.addChangeListener(new ChangeListener(){                                      
		           public void stateChanged(ChangeEvent e)                     
		           {                                                           
		              p.setDiameter(slider.getValue()); 
		           }                                                           
		        }                                                              
		     ); 
		 this.add(BorderLayout.NORTH, slider);
	     this.add(BorderLayout.CENTER, p);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Slide a = new Slide();
		a.setVisible(true);
	}
}