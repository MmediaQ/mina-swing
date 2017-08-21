package com.mq.view;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Mview {

	public static void main(String args[]){
		JFrame frame = new JFrame();
		frame.setSize(new Dimension(800,600));
		frame.setLocation(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
