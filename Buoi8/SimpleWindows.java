package Buoi8;

import javax.swing.JFrame;

public class SimpleWindows extends JFrame {
public SimpleWindows(){
	final int WINDOW_WIDTH=350;
	final int WINDOWS_HEIGHT=250;
	setTitle("Demo simple windows");
	setSize(WINDOW_WIDTH,WINDOWS_HEIGHT);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
}
}
