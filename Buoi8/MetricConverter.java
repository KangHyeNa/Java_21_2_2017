package Buoi8;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MetricConverter extends JFrame implements ActionListener {
	private JPanel panel;
	private JLabel messageLabel;
	private JTextField kiloTextField;
	private JRadioButton milesButton,feetButton,inchesButton;	
	private final int WINDOWS_WIDTH=500;
	private final int WINDOWS_HEIGHT=100;
	private void buildPanel() {
				
	}
	public MetricConverter()
	{
		setTitle("Color");
		setSize(WINDOWS_WIDTH,WINDOWS_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setVisible(true);
	messageLabel = new JLabel("Enter a distance"+" in kilomater");	
	kiloTextField = new JTextField(10);
	milesButton = new JRadioButton("Convert to miles");
	feetButton = new JRadioButton("Convert to feet");
	inchesButton = new JRadioButton("Convert to inches");
	panel = new JPanel();
	panel.setLayout(new FlowLayout());
	panel.add(messageLabel);
	panel.add(kiloTextField);
	panel.add(milesButton);
	panel.add(feetButton);
	panel.add(inchesButton);	
	add(panel);
	milesButton.addActionListener(this);
	feetButton.addActionListener(this);
	inchesButton.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
	String input;
	String convertTo="";
	double result =0.0;
	input=kiloTextField.getText();
		if(e.getSource()==milesButton)
		{
			convertTo=" miles";
			result=Double.parseDouble(input)*1000;
			JOptionPane.showMessageDialog(null, input+"kilometer is "+result+"miles");
		}
		if(e.getSource()==feetButton)
		{
			convertTo=" miles";
			result=Double.parseDouble(input)* 3.2808*1000;
			JOptionPane.showMessageDialog(null, input+"kilometer is "+result+"feet");
		}
		if(e.getSource()==inchesButton)
		{
			convertTo=" miles";
			result=Double.parseDouble(input)* 39.370*1000;
			JOptionPane.showMessageDialog(null, input+"kilometer is "+result+"inches");
		}
}}
