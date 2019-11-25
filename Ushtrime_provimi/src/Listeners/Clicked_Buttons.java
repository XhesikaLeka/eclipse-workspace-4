package Listeners;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Clicked_Buttons extends JFrame {
private JButton button1;
private JButton button2;
private JLabel label1;
private JLabel label2;
private JPanel panel;
private int n1;
private int n2;
	
	 Clicked_Buttons(){
		button1= new JButton("First Button");
		button2= new JButton("Second Button");
		label1= new JLabel("First button is clicked 0 times");
		label2 = new JLabel("Second button is clicked 0 times");
		panel=new JPanel();
		panel.setLayout(new GridLayout(2,2));
		panel.add(button1);
		panel.add(button2);
		panel.add(label1);
		panel.add(label2);
		this.add(panel);
		this.setVisible(true);
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Click the buttons");
		
		class ButListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			if(arg0.getSource().equals(button1)) {
				n1++;
			label1.setText("First button is clicked "+n1+" times");
				
			}
			else if(arg0.getSource().equals(button2)){
				n2++;
				label2.setText("Second button is clicked "+n2+" times");
			}
			}
			
		}
		ActionListener listener = new ButListener();
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		
		
}

public static void main (String []args) {
		Clicked_Buttons clickB = new Clicked_Buttons();
	}
}

