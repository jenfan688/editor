package com.assessment.editor;


import java.awt.EventQueue;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.text.DefaultEditorKit;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;




public class TestIgonor {
    
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
        JMenu file=new JMenu("File");
        
        menuBar.add(main);
        menuBar.add(file);
        
        JMenuItem newFile=new JMenuItem("New");
        JMenuItem openFile=new JMenuItem("Open");
        JMenuItem td=new JMenuItem("T&D");
        JMenuItem about=new JMenuItem("About");
        JMenuItem exit=new JMenuItem("Exit");
        
        
        JMenuItem save=new JMenuItem("Save");
        JMenuItem search=new JMenuItem("Search");
        JMenuItem print=new JMenuItem("Print");
        
        // EDIT COMMANDS 
        JMenuItem copy = new JMenuItem( new DefaultEditorKit.CopyAction() );
         copy.setText("Copy");
            file.add(copy);
        JMenuItem paste = new JMenuItem( new DefaultEditorKit.PasteAction() );
         paste.setText("Paste");
            file.add(paste);
        JMenuItem cut = new JMenuItem( new DefaultEditorKit.CutAction() );
         cut.setText("Cut");
            file.add(cut);
        
    //MAIN TAB         
        main.add(newFile);    
        main.add(openFile);    
        main.add(td);    
        main.add(about);    
        main.add(exit);    

    //FILE TAB    
        file.add(save);
        file.add(search);
        file.add(print);
        file.add(cut);
        file.add(copy);
        file.add(paste);
        frame.setJMenuBar(menuBar);
        
        
    }
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
 
        if (s.equals("cut")) {
       
        }
       // else if (s.equals("copy")) {
       //     t.copy();
      //  }
       // else if (s.equals("paste")) {
       //     t.paste();
       // }
       // else if (s.equals("Save")) {
            // Create an object of JFileChooser class
           
       // }        
    }
    
    
    public static void notmain(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrameUI f=new FrameUI();
                Openfile of=new Openfile();
                f.framSetting();
                NewFile nFile=new NewFile();
                SaveFile sf=new SaveFile();
                nFile.newfile();
                //Save as new file to local
                sf.saveAsFile();
            
                //Open local file
                of.openLocalFile();
                framSetting();
                
                
                //Save opened file
                sf.saveFile();
                
                
                //Exit
                
                Exit etExit=new Exit();
                etExit.et();
            
                //About
                
                About about=new About();
                about.at();
                        
            };
            
        });
    }
}
