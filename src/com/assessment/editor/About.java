package com.assessment.editor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;





public class About {
	FrameUI f=new FrameUI();
	
	public void at() {
	f.about.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
		
			ImageIcon icon = new ImageIcon("src/Kitten.jpg");
			JOptionPane.showMessageDialog(null, 
	                "Cool bananas!!!!", "V1.0", 
	                JOptionPane.INFORMATION_MESSAGE,icon);
			
		}
	});

	
	}
}

