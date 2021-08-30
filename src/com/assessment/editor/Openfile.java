package com.assessment.editor;

import javax.swing.*;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.apache.commons.io.FilenameUtils;

public class Openfile{
	
	public static String filePath;
	public static String fileType;
	public static JFileChooser fileChooser;
	FrameUI f=new FrameUI();
	
//	public void setColor() {
//		
//		
//		
//	}
//	public void readFile() throws IOException {
//		
//		    FileReader readFile=new FileReader(filePath);
//	        BufferedReader bufferedReader = new BufferedReader(readFile);
//	        String content="";
//	        String allContent="";
//	        
//            fileType=filePath.substring(filePath.lastIndexOf(".")+1);
//	        while((content = bufferedReader.readLine()) != null)
//			{
//				 allContent += content + "\r\n";
//			}
//	        
//	        //Show text in JtextArea.
//	         f.textArea.setText(allContent);
//		
//	}

	
	public  void openLocalFile() {
		
		
			
f.openFile.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					//Open local file
					    f.save.setEnabled(true);
					    fileChooser = new JFileChooser();
				        fileChooser.setDialogTitle("Choose File");
				        fileChooser.showOpenDialog(null);
				        fileChooser.setVisible(true);
				        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				        
				      //Get the file extension
				        filePath = fileChooser.getSelectedFile().getAbsolutePath();
				        String extension =FilenameUtils.getExtension(filePath);
				     
				        
				        
				        
				     //Read the file and get the text  
				        FileReader readFile=new FileReader(filePath);
				        BufferedReader bufferedReader = new BufferedReader(readFile);
				        String content="";
				        String allContent="";
				        
                        fileType=filePath.substring(filePath.lastIndexOf(".")+1);
				        while((content = bufferedReader.readLine()) != null)
						{
							 allContent += content + "\r\n";
						}
				        
				        //Show text in JtextArea.
				         f.textArea.setText(allContent);
				      
					     
				        
				      } catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
					
				}
				

					
			}
		});


	}
   
}