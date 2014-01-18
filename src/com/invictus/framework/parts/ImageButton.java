package com.invictus.framework.parts;

import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import com.invictus.log.Logger;

@SuppressWarnings("serial")
public class ImageButton extends JButton{

	public ImageButton(String normal, String pressed, String rollover, String disable){
		// Create icons
		ImageIcon b_n = new ImageIcon(this.getClass().getResource(normal));
		ImageIcon b_p = new ImageIcon(this.getClass().getResource(pressed));
		ImageIcon b_r = new ImageIcon(this.getClass().getResource(rollover));
		ImageIcon b_d = new ImageIcon(this.getClass().getResource(disable));
		// Set defaults
		this.setSize(b_n.getIconWidth(), b_n.getIconHeight());
		Logger.logDebug("Button: "+b_n.toString());
		this.setIcon(b_n);
		this.setMargin(new Insets(0,0,0,0));
		this.setIconTextGap(0);
		this.setBorderPainted(false);
		this.setBorder(null);
		this.setText(null);
		// Set dynamics
		Logger.logDebug("Button Pressed: "+b_p.toString());
		this.setPressedIcon(b_p);
		Logger.logDebug("Button Rollover: "+b_r.toString());
		this.setRolloverIcon(b_r);
		Logger.logDebug("Button Disable: "+b_d.toString());
		this.setDisabledIcon(b_d);;
	}
	
	public ImageButton(ImageIcon normal, ImageIcon pressed, ImageIcon rollover, ImageIcon disable){
		// Set defaults
		this.setSize(normal.getIconWidth(), normal.getIconHeight());
		Logger.logDebug("Button: "+normal.toString());
		this.setIcon(normal);
		this.setMargin(new Insets(0,0,0,0));
		this.setIconTextGap(0);
		this.setBorderPainted(false);
		this.setBorder(null);
		this.setText(null);
		// Set dynamics
		Logger.logDebug("Button Pressed: "+pressed.toString());
		this.setPressedIcon(pressed);
		Logger.logDebug("Button Rollover: "+rollover.toString());
		this.setRolloverIcon(rollover);
		Logger.logDebug("Button Disable: "+disable.toString());
		this.setDisabledIcon(disable);;
	}
}
