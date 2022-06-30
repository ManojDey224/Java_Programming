package java2;

import java.awt.EventQueue;

import javax.swing.*;

public class SwingDemo {
		SwingDemo(){
			JFrame jfrm = new JFrame("A Simple Swing Application");
			jfrm.setSize(275, 100);
			jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JLabel jlab = new JLabel("Swing Means Power GUIs");
			jfrm.add(jlab);
			jfrm.setVisible(true);
		}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new SwingDemo();
			}
		});
	}
}
