package com.assessment.editor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;





public class NewFile {
	FrameUI f=new FrameUI();
	SaveFile s=new SaveFile();
	public void newfile() {
	f.newFile.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			
			//Click "New" then the text will be cleared.
			f.save.setEnabled(false);
			f.textArea.setText(null);
			s.saveAsFile();
			
		}
	});

	
	}
}

