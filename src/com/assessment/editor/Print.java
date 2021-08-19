package com.assessment.editor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.text.MessageFormat;

import javax.swing.JFileChooser;





public class Print {
	FrameUI f=new FrameUI();
	
	public void pt() {
	f.print.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			
			//Print the file and save as PDF file if print is cancelled.
			  MessageFormat ms = new MessageFormat(f.textArea.getText());
              MessageFormat ms1 = new MessageFormat("Page {0}");
              try {
                  f.textArea.print(ms,ms1);
              } catch (PrinterException ex) {
                  ex.printStackTrace();
              }
			
		}
	});

	
	}
}

