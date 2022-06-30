package java2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JButtonDemo implements ActionListener{
	JLabel jlab;
	public JButtonDemo() {
		JFrame jfrm =new JFrame("JButtonDemo");
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setSize(500, 450);
		ImageIcon hourglass =new ImageIcon("hourglass.png");
		JButton jb= new JButton(hourglass);
		jb.setActionCommand("HourGlass");
		jb.addActionListener(this);
		jfrm.add(jb);
		ImageIcon analog=new ImageIcon("analog.png");
		jb =new JButton(analog);
		jb.setActionCommand("Analog Clock");
		jb.addActionListener(this);
		jfrm.add(jb);
		ImageIcon digital=new ImageIcon("digital.png");
		jb =new JButton(digital);
		jb.setActionCommand("Digital Clock");
		jb.addActionListener(this);
		jfrm.add(jb);
		ImageIcon stopwatch=new ImageIcon("stopwatch.png");
		jb =new JButton(stopwatch);
		jb.setActionCommand("StopWatch");
		jb.addActionListener(this);
		jfrm.add(jb);
		jlab =new JLabel("Choose a Timeplace");
		jfrm.add(jlab);
		jfrm.setVisible(true);
	}
		public void actionPerformed(ActionEvent ae) {
			jlab.setText("You Selected " +ae.getActionCommand());
		}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(null);
					
	}
}
