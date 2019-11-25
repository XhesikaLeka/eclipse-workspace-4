package GUI_gjonaTmiraGjonaTbukra;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Temperaturat extends JFrame {
private JComboBox tcombo1;
private JComboBox tcombo2;
private JTextField field;
private JLabel label;
private JButton butt;
private JButton buttsave;


	public Temperaturat() {
		// TODO Auto-generated constructor stub
		String[] tmp = { "celcius", "faranheit",};
		tcombo1= new JComboBox<String>(tmp);
		tcombo2= new JComboBox<String>(tmp);
		field = new JTextField(10);
		label= new JLabel("rezultati: ");
		butt= new JButton("konverto");
		buttsave= new JButton("ruaj");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(900,900);
		JPanel panel= new JPanel();
		panel.setLayout(new GridLayout(4,2));
		panel.add(field);
		panel.add(label);
		panel.add(tcombo1);
		panel.add(tcombo2);
		panel.add(butt);
		panel.add(buttsave);
		
		this.add(panel);
		
		
		
		
		
		
		
		class konvert_listener implements ActionListener{
			
			public boolean valido() {
				if(field.getText()=="") {
					label.setText("ju lutem vendosni nje numer");
					return false;
				}
				int e=-1;
				e=Integer.parseInt(field.getText());
				if(e==-1) {
					label.setText("ju lutem vendosni nje numer te vlefshem");
					return false;
				}
				return true;
			}
          public void konverto() {
        	  if(tcombo1.getSelectedIndex()==0&& tcombo2.getSelectedIndex()==1) {
        		  label.setText("temperatua ne faranheit eshte "+Integer.parseInt(field.getText())*2);
        	  }
        	  label.setText("temperatua ne celsiun eshte "+Integer.parseInt(field.getText())*3);
        		  
          }
          public void save() {
        	  ArrayList<Integer> t= new ArrayList<>();
        	  t.add(Integer.parseInt(label.getText()));
          }
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(arg0.getSource()==butt) {
					if(valido()) {
						konverto();
					}
				}
				if(arg0.getSource()==buttsave) {
					save();
				}
				
			}
		}
		ActionListener listener = new konvert_listener();
		butt.addActionListener(listener);
		buttsave.addActionListener(listener);
		
	}
public static void main(String[] args) {
	Temperaturat t= new Temperaturat();
}
}
