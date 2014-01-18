package com.invictus.framework;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import com.invictus.framework.parts.ImageButton;
import com.invictus.log.Logger;

public class Invictus_Patcher {

	public Invictus_Patcher() {
		
		// Create frames
		this.frame_main();
	}
	
	public void frame_main(){
		// Debug
		Logger.logDebug("Creating Main Frame");
		// Frame
		JFrame frame = new JFrame("Invictus Patcher");
		frame.setResizable(false);
		//frame.setUndecorated(true);
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		// Background element
		frame.setLayout(new BorderLayout());
		JLabel background = new JLabel(new ImageIcon(getClass().getResource("/resources/frame_main/background.png")));
		frame.setContentPane(background);
		//FlowLayout layout_Navbar = new FlowLayout();
		//frame.setLayout(layout_Navbar);
		// Add Tabs
		ImageButton tab0 = new ImageButton("/resources/tabs/tab_normal.png", "/resources/tabs/tab_pressed.png", "/resources/tabs/tab_hover.png", "/resources/tabs/tab_disabled.png");
		tab0.setLocation(10+125*0, 10);
		frame.add(tab0);
		ImageButton tab1 = new ImageButton("/resources/tabs/tab_normal.png", "/resources/tabs/tab_pressed.png", "/resources/tabs/tab_hover.png", "/resources/tabs/tab_disabled.png");
		tab1.setLocation(20+125*1, 10);
		frame.add(tab1);
		ImageButton tab2 = new ImageButton("/resources/tabs/tab_normal.png", "/resources/tabs/tab_pressed.png", "/resources/tabs/tab_hover.png", "/resources/tabs/tab_disabled.png");
		tab2.setLocation(30+125*2, 10);
		frame.add(tab2);
		
		// Add Buttons
		ImageIcon b_n = new ImageIcon(this.getClass().getResource("/resources/frame_main/button_normal.png"));
		ImageIcon b_p = new ImageIcon(this.getClass().getResource("/resources/frame_main/button_pressed.png"));
		ImageIcon b_h = new ImageIcon(this.getClass().getResource("/resources/frame_main/button_hover.png"));
		ImageIcon b_d = new ImageIcon(this.getClass().getResource("/resources/frame_main/button_disabled.png"));
		ImageButton test = new ImageButton(b_n, b_p, b_h, b_d);
		test.setLocation(40, 10);
		//frame.add(test);
		
		
		// Make it visible
		frame.setVisible(true);
	}
}
