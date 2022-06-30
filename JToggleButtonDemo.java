package java2;

import java.awt.EventQueue;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JToggleButtonDemo {
	public JToggleButtonDemo() {
		JFrame jfrm =new JFrame("JToggleButtonDemo");
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setSize(200,100);
		JLabel jlab= new JLabel("Button is off");
		JToggleButton jtbn= new JToggleButton("on/off");
		jtbn.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ae) {
				if(jtbn.isSelected()) 
					jlab.setText("Button is on");
				else 
					jlab.setText("Button is off");
			}
		});
		jfrm.add(jtbn);
		jfrm.add(jlab);
		jfrm.setVisible(true);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new JToggleButtonDemo();
			}
		});
	}

}
