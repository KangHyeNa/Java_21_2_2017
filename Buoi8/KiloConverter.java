package Buoi8;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KiloConverter extends JFrame {
private JPanel panel;
private JLabel messageLabel;
private JTextField kiloTextField;
private JButton calcButton;
private final int WINDOWS_WIDTH=310;
private final int WINDOWS_HEIGHT=100;
private void buildPanel() {
	// TODO Auto-generated method stub
	
}
public KiloConverter()
{
	setTitle("Kilometer Converter");
	setSize(WINDOWS_WIDTH,WINDOWS_HEIGHT);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	setVisible(true);
messageLabel = new JLabel("Enter a distance"+" in kilomater");
kiloTextField = new JTextField(10);
calcButton = new JButton("Calculate");
panel = new JPanel();
panel.setLayout(new FlowLayout());
panel.add(messageLabel);
panel.add(kiloTextField);
panel.add(calcButton);
add(panel);
}
}
