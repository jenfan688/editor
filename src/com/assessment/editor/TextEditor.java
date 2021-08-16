package com.assessment.editor;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
 
import javax.swing.*;
 
public class TextEditor extends JFrame implements ActionListener{
 
	//定义需要的组件
	JTextArea jta=null;
	//菜单条
	JMenuBar jmb=null;
	//第一JMenu
	JMenu jm1=null;
	//定义JMenuItem
	JMenuItem jmi1=null;
	JMenuItem jmi2=null;
	JMenuItem jmi3=null;
	
	public static void main(String[] args) {
		TextEditor demo=new TextEditor();
		
	}
	//构造函数
	public TextEditor()
	{
		//创建jta
		jta=new JTextArea();
		jmb=new JMenuBar();
		jm1=new JMenu("文件");
		//设置助记符
		jm1.setMnemonic('F');
		jmi1=new JMenuItem("打开",new ImageIcon("new.png"));
		//注册监听
		jmi1.addActionListener(this);
		jmi1.setActionCommand("open");
		
		jmi2=new JMenuItem("保存",new ImageIcon("save.png"));
		//注册监听
		jmi2.addActionListener(this);
		jmi2.setActionCommand("save");
		
		jmi3=new JMenuItem("退出",new ImageIcon("close.png"));
		jmi3.addActionListener(this);
		jmi3.setActionCommand("close");
		
		//加入
		this.setJMenuBar(jmb);
		//把菜单放到MenuBar
		jmb.add(jm1);
		//把Item放入Menu
		jm1.add(jmi1);
		jm1.add(jmi2);
		jm1.add(jmi3);
		
		//放入到JFrame
		this.add(jta);
		
		this.setTitle("记事本..");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,500);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//判断那个菜单被选中
		if(e.getActionCommand().equals("open"))//打开
		{
			System.out.println("打开");
			//打开文件对话框JFileChooser
			JFileChooser jfc1=new JFileChooser();//创建一个文件选择组件
			jfc1.setDialogTitle("请选择文件..");
			jfc1.showOpenDialog(null);//默认方式
			jfc1.setVisible(true);//设置显示
			String filename=jfc1.getSelectedFile().getAbsolutePath();//得到用户选择的全路径
			//System.out.println(filename);	
			
			FileReader fr=null;
			BufferedReader br=null;
			try
			{
				fr=new FileReader(filename);
				br=new BufferedReader(fr);
				//从文件中读取信息并显示到JTextArea中
				String s="";
				String allcon="";
				while((s=br.readLine())!=null)
				{
					allcon+=s+"\r\n";
				}
				//将内容放置到jta
				jta.setText(allcon);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			finally
			{
				try 
				{
					fr.close();
					br.close();
				} 
				catch (IOException e1) 
				{
					e1.printStackTrace();
				}
				
			}
		}
		else if(e.getActionCommand().equals("save"))//保存
		{
			System.out.println("保存");
			JFileChooser jfc2=new JFileChooser();
			jfc2.setDialogTitle("另存为..");
			jfc2.showSaveDialog(null);
			jfc2.setVisible(true);
			//得到选择的路径，全路径
			String file=jfc2.getSelectedFile().getAbsolutePath();
			//准备写入到指定文件
			FileWriter fw=null;
			BufferedWriter bw=null;
			try
			{
				fw = new FileWriter(file);
				bw = new BufferedWriter(fw);
				//将JTextArea内容写入到指定文件夹
				//自己优化,用字符数组
				bw.write(this.jta.getText());
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			finally
			{
				try 
				{
					bw.close();
					fw.close();
				} 
				catch (IOException e1) 
				{
					e1.printStackTrace();
				}
			}
		}
		else if(e.getActionCommand().equals("close"))
		{
			System.exit(0);
		}	
	}
}


