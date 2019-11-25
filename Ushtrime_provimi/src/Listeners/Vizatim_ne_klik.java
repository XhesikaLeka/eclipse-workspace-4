//Ndërtoni një program që vizaton një rreth. Kur përdoruesi klikon në dritare programi i kërkon
//të fusë rrezen e një rrethi nëpërmjet dialogut për marrjen e të dhënave të siguruar nga klasa
//JOptionPane. Koordinatat e qendrës së rrethit janë koordinatat e pikës së klikimit.
package Listeners;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class Vizatim_ne_klik extends JFrame{
	private JPanel panel;
	
	Vizatim_ne_klik(){
		panel= new JPanel();
		this.add(panel);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);

		   
	
		class VizKlik implements MouseListener{

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				int x= getX();
				int y= getY();
				 Vizatimi v= new Vizatimi(50,50);
				   add(v);
			}

			

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		
		 }
		 MouseListener listener = new VizKlik();
		 this.addMouseListener(listener);
		 
		 
	}
		
	
public static void main(String [] args) {
	Vizatim_ne_klik v= new Vizatim_ne_klik();
}
}
