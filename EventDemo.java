package java2;

import java.awt.EventQueue;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class EventDemo {
		JLabel jlab;
	EventDemo(){
		JFrame jfrm = new JFrame("An Event Example");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(220, 90);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton jbtnAlpha = new JButton("Alpha");
		JButton jbtnBeta = new JButton("Beta");
		jbtnAlpha.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae) {
				jlab.setText("Alpha was Pressed");
			}
		});
		jbtnBeta.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae) {
				jlab.setText("Beta was Pressed");
			}
		});
		jfrm.add(jbtnAlpha);
		jfrm.add(jbtnBeta);
		jlab = new JLabel("Press a Button");
		jfrm.add(jlab);
		jfrm.setVisible(true);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new EventDemo();
			}
		});
	}
} 