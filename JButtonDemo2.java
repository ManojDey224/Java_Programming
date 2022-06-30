package java2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class JButtonDemo2 implements ActionListener{
	JLabel jlab;
	public JButtonDemo2() {
		JFrame jfrm =new JFrame("JButtonDemo2");
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setSize(500, 450);
		ImageIcon hourglass =new ImageIcon("HourGlass.png");
		JButton jb= new JButton(hourglass);
		jb.setActionCommand("HourGlass");
		jb.addActionListener(this);
		jfrm.add(jb);
		ImageIcon analog=new ImageIcon("Analog.png");
		jb =new JButton(analog);
		jb.setActionCommand("Analog Clock");
		jb.addActionListener(this);
		jfrm.add(jb);
		ImageIcon digital=new ImageIcon("Digital.png");
		jb =new JButton(digital);
		jb.setActionCommand("Digital clock");
		jb.addActionListener(this);
		jfrm.add(jb);
		ImageIcon stopwatch=new ImageIcon("");
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
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new JButtonDemo2();
			}
		});
	}
}

