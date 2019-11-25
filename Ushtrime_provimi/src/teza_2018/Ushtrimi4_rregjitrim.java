package teza_2018;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
//Krijoni një program grafik që bën të mundur regjistrimin e një përdoruesi në sistem. Përdoruesi
//vendos emrin, mbiemrin në dy fusha teksti, zgjedh gjininë nga një kontroll radiobutoni, moshën nga një
//kontroll slajderi. Në klikim të një butoni Regjistrohu, të gjenerohet një fjalëkalim për përdoruesin.
//Fjalëkalimi do të gjenerohet si: Shkronja e parë e emrit+ 0 nëse është femer dhe 1 nëse është mashkull, + një
//numër random nga 1 deri te mosha e tij. Ky fjalëkalim të afishohet në një Label me font BOLD.
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class Ushtrimi4_rregjitrim extends JFrame{
private JTextField emrifield;
private JTextField mbiemrifield;
private JRadioButton r1;
private JRadioButton r2;
private JSlider slider;
private JButton reg;
private JLabel pass;
private JPanel panel;
	public Ushtrimi4_rregjitrim() {
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(5000,5000);
		emrifield= new JTextField(30);
		mbiemrifield= new JTextField(30);
		r1= new JRadioButton("femer");
		r2= new JRadioButton("mashkull");
		ButtonGroup grup= new ButtonGroup();
		grup.add(r1);
		grup.add(r2);
		slider = new JSlider(JSlider.HORIZONTAL);  
		slider.setMinorTickSpacing(1);  
		slider.setMajorTickSpacing(20);  
		slider.setPaintTicks(true);  
		slider.setPaintLabels(true); 
		reg=new JButton("Rregjistrohu");
		pass=new JLabel("");
		Font f = pass.getFont();
		// bold
		pass.setFont(f.deriveFont(f.getStyle() | Font.BOLD));
	   panel= new JPanel();
		panel.add(emrifield);
		panel.add(mbiemrifield);
		panel.add(r1);
		panel.add(r2);
		panel.add(slider);
		panel.add(reg);
		panel.add(pass);
		this.add(panel);
		
		class listenerklik implements ActionListener{
			

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String result=Character.toString(emrifield.getText().charAt(0));
				int nr=1;
				if(r1.isSelected())
					nr=0;
				result=result+nr;

                Random rand = new Random();
				nr= rand.nextInt(slider.getHeight()-1)+1;
				result=result+nr;
			pass.setText(result);
				
			}
			
		}
		ActionListener listener= new listenerklik();
		reg.addActionListener(listener);
		
		
	}
	public static void main(String []args) {
		Ushtrimi4_rregjitrim u= new Ushtrimi4_rregjitrim();
	}

}
