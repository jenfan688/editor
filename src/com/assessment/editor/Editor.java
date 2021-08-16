
  
package com.assessment.editor;

import java.awt.EventQueue;




public class Editor {
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				FrameUI f=new FrameUI();
				Openfile of=new Openfile();
				f.framSetting();
				of.openLocalFile();
			
				
			};
			
		});
	}
}	
