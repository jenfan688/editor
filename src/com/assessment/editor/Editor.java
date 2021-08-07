package com.assessment.editor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;




public class Editor {
	
	public static void framSetting(){
		//Create main frame
		JFrame frame = new JFrame();
		frame.setBounds(350,350,850, 650);
		frame.setTitle("Edit your world");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		//Add text field
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 00, 850, 650);
		textArea.setLineWrap(true);
		frame.add(textArea);
		
		
		//Add menu and sub menu 
		
		JMenuBar menuBar=new JMenuBar();
		JMenu main=new JMenu("Main");
		
		menuBar.add(main);
		
		JMenuItem newFile=new JMenuItem("New");
		JMenuItem openFile=new JMenuItem("Open");
		JMenuItem td=new JMenuItem("T&D");
		JMenuItem about=new JMenuItem("About");
		JMenuItem exit=new JMenuItem("Exit");
		
		main.add(newFile);	
		main.add(openFile);	
		main.add(td);	
		main.add(about);	
		main.add(exit);	
		
		frame.setJMenuBar(menuBar);
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
			
				framSetting();
				
				
			};
			
		});
	}
}	
	