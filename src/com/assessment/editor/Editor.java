
  
package com.assessment.editor;

import java.awt.EventQueue;
import java.io.File;
import java.io.IOException;






public class Editor {
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				FrameUI f=new FrameUI();
				Openfile of=new Openfile();
				f.framSetting();
				
				Search s=new Search();
				s.search();
				
				NewFile nFile=new NewFile();
				SaveFile sf=new SaveFile();
				nFile.newfile();
				//Save as new file to local
				sf.saveAsFile();
			
				//Open local file
				of.openLocalFile();
				
				
				//Save opened file
				sf.saveFile();
				
				
				//Exit
				
				Exit etExit=new Exit();
				etExit.et();
			
				//About
				
				About about=new About();
				about.at();
				
				
				//Insert timestamp
				
				TimeDate ts=new TimeDate();
				ts.insertTimeStamp();
				
				
				//Print 
				Print p=new Print();
				p.pt();
			};
			
		});
	}
}	
