package com.invictus.framework;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import com.invictus.framework.parts.ImageButton;
import com.invictus.log.Logger;

public class Invictus_Patcher {
	
	JFrame frame_main;
	JFrame frame_loading;

	public Invictus_Patcher() {
		
		// Create frames
		this.frame_main();
		this.frame_loading();
		
		// Temp make visible
		frame_main.setVisible(true);
		frame_loading.setVisible(true);
	}
	
	private void frame_main(){
		// Info
		Logger.logInfo("Creating Main Frame");
		// Frame
		frame_main = new JFrame("Invictus Patcher");
		frame_main.setResizable(false);
		frame_main.setSize(900,600);
		frame_main.setLocationRelativeTo(null);
		frame_main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		// Background element
		frame_main.setLayout(new BorderLayout());
		JLabel background = new JLabel(new ImageIcon(getClass().getResource("/resources/frame_main/background.png")));
		frame_main.setContentPane(background);
		// Add Tabs
		ImageButton tab0 = new ImageButton("/resources/tabs/tab_normal.png", "/resources/tabs/tab_pressed.png", "/resources/tabs/tab_hover.png", "/resources/tabs/tab_disabled.png");
		tab0.setLocation(10+125*0, 10);
		frame_main.add(tab0);
		ImageButton tab1 = new ImageButton("/resources/tabs/tab_normal.png", "/resources/tabs/tab_pressed.png", "/resources/tabs/tab_hover.png", "/resources/tabs/tab_disabled.png");
		tab1.setLocation(20+125*1, 10);
		frame_main.add(tab1);
		ImageButton tab2 = new ImageButton("/resources/tabs/tab_normal.png", "/resources/tabs/tab_pressed.png", "/resources/tabs/tab_hover.png", "/resources/tabs/tab_disabled.png");
		tab2.setLocation(30+125*2, 10);
		frame_main.add(tab2);
		
		// Add Buttons
		ImageIcon b_n = new ImageIcon(this.getClass().getResource("/resources/frame_main/button_normal.png"));
		ImageIcon b_p = new ImageIcon(this.getClass().getResource("/resources/frame_main/button_pressed.png"));
		ImageIcon b_h = new ImageIcon(this.getClass().getResource("/resources/frame_main/button_hover.png"));
		ImageIcon b_d = new ImageIcon(this.getClass().getResource("/resources/frame_main/button_disabled.png"));
		ImageButton test = new ImageButton(b_n, b_p, b_h, b_d);
		test.setLocation(40, 10);
		//frame.add(test);
	}
	
	private void frame_loading(){
		// Info
		Logger.logInfo("Creating Loading Frame");
		// Frame
		frame_loading = new JFrame("Invictus Patcher");
		frame_loading.setResizable(false);
		frame_loading.setSize(400,300);
		frame_loading.setLocationRelativeTo(frame_main);
		frame_loading.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		// Background element
		frame_loading.setLayout(new BorderLayout());
		JLabel background = new JLabel(new ImageIcon(getClass().getResource("/resources/frame_main/background.png")));
		frame_loading.setContentPane(background);
	}
}
