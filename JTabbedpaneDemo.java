package java2;

import java.awt.EventQueue;
import java.awt.*;
import javax.swing.*;

public class JTabbedpaneDemo {
	public JTabbedpaneDemo() {
		JFrame jfrm = new JFrame("JTabbedpaneDemo");
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setSize(400,200);
		JTabbedPane jtp=new JTabbedPane();
		jtp.addTab("Cities", new CitiesPanel());
		jtp.addTab("Colors", new ColorsPanel());
		jtp.addTab("Flavors", new FlavorsPanel());
		jfrm.add(jtp);
		jfrm.setVisible(true);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new JTabbedpaneDemo();
			}
		});
	}
}
class CitiesPanel extends JPanel{
	public CitiesPanel() {
		JButton b1 = new JButton("Hooghly");
		add(b1);
		JButton b2 = new JButton("Searampore");
		add(b2);
		JButton b3 = new JButton("Bandel");
		add(b3);
		JButton b4 = new JButton("HindMotor");
		add(b4);
	}
}
class ColorsPanel extends JPanel{
	public ColorsPanel() {
		JCheckBox cb1 = new JCheckBox("Black");
		add(cb1);
		JCheckBox cb2 = new JCheckBox("Red");
		add(cb2);
		JCheckBox cb3 = new JCheckBox("Blue");
		add(cb3);
		JCheckBox cb4 = new JCheckBox("White");
		add(cb4);
	}
}
class FlavorsPanel extends JPanel{
	public FlavorsPanel() {
		JComboBox<String>jcb =new JComboBox<String>();
		jcb.addItem("Vanilla");
		jcb.addItem("Chocolate");
		jcb.addItem("Strawberry");
		jcb.addItem("Mango");
		add(jcb);
	}
}
