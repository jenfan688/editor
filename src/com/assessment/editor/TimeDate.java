package com.assessment.editor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFileChooser;





public class TimeDate {
	FrameUI f=new FrameUI();
	
	public void insertTimeStamp() {
	f.td.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			
			//Insert time to the beginning of the file
		LocalDateTime	timeText;
		timeText=java.time.LocalDateTime.now();
		f.textArea.setText(timeText+"\n"+f.textArea.getText());
		}
	});

	
	}
}

