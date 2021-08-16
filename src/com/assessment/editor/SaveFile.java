package com.assessment.editor;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.plaf.LabelUI;



public class SaveFile {
	
	FrameUI f=new FrameUI();
	Openfile openf=new Openfile();
	
	public  void saveFile() {
		f.save.addActionListener(new ActionListener() {
			
			public  void actionPerformed(ActionEvent e) {
				 
				 File file = new File(Openfile.filePath);
				
				if (Openfile.filePath!=null) {
					 try (FileWriter fw = new FileWriter(file);
						       BufferedWriter bw = new BufferedWriter(fw)) {
						      bw.write(f.textArea.getText());
						      bw.newLine();
						  } catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

			}
				
				
		};
	});

}
	}
