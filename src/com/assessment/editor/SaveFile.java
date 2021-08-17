package com.assessment.editor;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;








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
	
	public  void saveAsFile() {
		f.saveas.addActionListener(new ActionListener(){
			public  void actionPerformed(ActionEvent e) {
                JFrame saveFrame = new JFrame();
                FileOutputStream fo = null;
                DataOutputStream ds = null;
				FileDialog fDialog = new FileDialog(saveFrame, "Save", FileDialog.SAVE);
		        fDialog.setVisible(true);
		        String path = fDialog.getDirectory() + fDialog.getFile();
		        String str=f.textArea.getText()+"\n"; 
		        
		        File f = new File(path);
		        try {
		               
			            f.createNewFile();
			             fo = new FileOutputStream(f);
			             byte[] b= str.getBytes();
			            fo.write(b);
			            fo.close();     
						
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});

}
	}
