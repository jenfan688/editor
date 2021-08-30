package com.assessment.editor;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;





public class Search {
	FrameUI f=new FrameUI();
	
	public void search() {
	f.search.addActionListener(new ActionListener() {
		
		public  void actionPerformed(ActionEvent e) {
			
			//Show search windon
			String search=JOptionPane.showInputDialog(null,"Find","Type the words",JOptionPane.INFORMATION_MESSAGE);
			
			Highlighter.HighlightPainter highlight = new DefaultHighlighter.DefaultHighlightPainter(Color.yellow);
			int offset = f.textArea.getText().indexOf(search);
	        int length = search.length();
	        
	        while (offset != -1) {
	            try {
	                f.textArea.getHighlighter().addHighlight(offset, offset + length, highlight);
	                offset =  f.textArea.getText().indexOf(search, offset + 1);
	            } catch (BadLocationException  e1){
	                System.err.println("An error occured, please try again");
	            }
	        }
		}
	});

	
	}
}

