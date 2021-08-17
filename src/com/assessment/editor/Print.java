package com.assessment.editor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;





public class Print {
	FrameUI f=new FrameUI();
	
	public void et() {
	f.print.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			f.frame.setVisible(false);
			f.frame.dispose();
			
		}
	});

	
	}
}

