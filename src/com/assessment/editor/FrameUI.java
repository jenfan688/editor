package com.assessment.editor;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class  FrameUI {
	
   
	public static JFrame frame;
	public static JTextArea textArea;
	public static JMenuBar menuBar;
	public static JMenu main;
	public static JMenu file;
	public static JMenuItem openFile;
	public static JMenuItem newFile;
	public static JMenuItem td;
	public static JMenuItem about;
	public static JMenuItem exit;
	public static JMenuItem save;
	public static JMenuItem saveas;
	public static JMenuItem search;
	public static JMenuItem print;
	
//	public static void framSetting(){
//		frame = new JFrame();
//		frame.setBounds(350,350,850, 650);
//		frame.setTitle("Edit your world");
//		frame.setLocationRelativeTo(null);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
//		frame.setVisible(true);
//		
//		textArea = new JTextArea();
//		textArea.setBounds(0, 00, 850, 650);
//		textArea.setLineWrap(true);
//		frame.add(textArea);
//		
//		menuBar=new JMenuBar();
//		main=new JMenu("Main");
//		file=new JMenu("File");
//		
//		menuBar.add(main);
//		menuBar.add(file);
//		
//	}
	
	public void framSetting(){
		//Create main frame
		frame = new JFrame();
	
		frame.setBounds(350,350,850, 650);
		frame.setTitle("Edit your world");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		//Add text field
		textArea = new JTextArea();
		textArea.setBounds(0, 00, 850, 650);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);     
		frame.add(textArea);
		
		
		//Add menu and sub menu 
		
		menuBar=new JMenuBar();
		main=new JMenu("Main");
		file=new JMenu("File");
		
		menuBar.add(main);
		menuBar.add(file);
		
		newFile=new JMenuItem("New");
	    openFile=new JMenuItem("Open");
		td=new JMenuItem("T&D");
		about=new JMenuItem("About");
		exit=new JMenuItem("Exit");
		
		
		save=new JMenuItem("Save");
        save.setEnabled(false);
		saveas=new JMenuItem("Save As");
		search=new JMenuItem("Search");
		print=new JMenuItem("Print");
		
		main.add(newFile);	
		main.add(openFile);	
		main.add(td);	
		main.add(about);	
		main.add(exit);	
		
		file.add(save);
		file.add(saveas);
		file.add(search);
		file.add(print);
		
		frame.setJMenuBar(menuBar);
	}

	
	
	
}