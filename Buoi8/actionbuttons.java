package Buoi8;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class actionbuttons extends JFrame implements ActionListener{
	private JPanel panel;
	private JLabel messageLabel;	
	private JButton redButton,blueButton,greenButton;	
	private final int WINDOWS_WIDTH=500;
	private final int WINDOWS_HEIGHT=100;
	private void buildPanel() {
				
	}
	public actionbuttons()
	{
		setTitle("Color");
		setSize(WINDOWS_WIDTH,WINDOWS_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setVisible(true);
	messageLabel = new JLabel("Click a button to select a color");	
	redButton = new JButton("Red");
	blueButton = new JButton("Blue");
	greenButton = new JButton("Green");
	panel = new JPanel();
	panel.setLayout(new FlowLayout());
	panel.add(messageLabel);	
	panel.add(redButton);
	panel.add(blueButton);
	panel.add(greenButton);	
	add(panel);
	redButton.addActionListener(this);
	blueButton.addActionListener(this);
	greenButton.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==redButton)
		{
			panel.setBackground(Color.RED);
			messageLabel.setForeground(Color.BLUE);
			
	}
		if(e.getSource()==blueButton)
			{panel.setBackground(Color.BLUE);
		messageLabel.setForeground(Color.YELLOW);}
		else
			{panel.setBackground(Color.YELLOW);
		messageLabel.setForeground(Color.BLACK);}
			
	}
}
