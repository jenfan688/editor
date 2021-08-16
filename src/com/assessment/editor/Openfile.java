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
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Openfile{
	
	public static String filePath;
	public static String fileType;
	public static JFileChooser fileChooser;
	FrameUI f=new FrameUI();
	
	
	public  void openLocalFile() {
		
f.openFile.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					//Open local file
					    fileChooser = new JFileChooser();
				        fileChooser.setDialogTitle("Choose File");
				        fileChooser.showOpenDialog(null);
				        fileChooser.setVisible(true);
				        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				        filePath = fileChooser.getSelectedFile().getAbsolutePath();
				       
				        FileReader readFile=new FileReader(filePath);
				        BufferedReader bufferedReader = new BufferedReader(readFile);
				        String content="";
				        String allContent="";
				        
                        fileType=filePath.substring(filePath.lastIndexOf(".")+1);
//				        
//				        
//				        if( fileType=="txt"){
				        while((content = bufferedReader.readLine()) != null)
						{
							 allContent += content + "\r\n";
						}
				        
				         f.textArea.setText(allContent);
				      
					     
				        
				      } catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
					
				}
				
				
			
					
			}
		});
	}
   
}