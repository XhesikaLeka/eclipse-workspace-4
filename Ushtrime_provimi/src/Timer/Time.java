//Ndërtoni një program me ndërfaqje përdoruesi që përdor një objekt Timer për të afishuar
//kohën korrente në cdo sekondë.
package Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Time extends JFrame {

  public Time() {
    super("Timer Demo");
    setSize(300, 100);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
    ClockLabel clock = new ClockLabel();
    getContentPane().add(clock);
  }
  public static void main(String args[]) {
	    Time ct = new Time();
	   
	  }
}
class ClockLabel extends JLabel implements ActionListener {

  public ClockLabel() {
    super("" + new Date());
    Timer t = new Timer(1000, this);
    t.start();
  }

  public void actionPerformed(ActionEvent ae) {
    setText((new Date()).toString());
  }

}