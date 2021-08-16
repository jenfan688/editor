package com.assessment.editor;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
 
import javax.swing.*;
 
public class TextEditor extends JFrame implements ActionListener{
 
	//������Ҫ�����
	JTextArea jta=null;
	//�˵���
	JMenuBar jmb=null;
	//��һJMenu
	JMenu jm1=null;
	//����JMenuItem
	JMenuItem jmi1=null;
	JMenuItem jmi2=null;
	JMenuItem jmi3=null;
	
	public static void main(String[] args) {
		TextEditor demo=new TextEditor();
		
	}
	//���캯��
	public TextEditor()
	{
		//����jta
		jta=new JTextArea();
		jmb=new JMenuBar();
		jm1=new JMenu("�ļ�");
		//�������Ƿ�
		jm1.setMnemonic('F');
		jmi1=new JMenuItem("��",new ImageIcon("new.png"));
		//ע�����
		jmi1.addActionListener(this);
		jmi1.setActionCommand("open");
		
		jmi2=new JMenuItem("����",new ImageIcon("save.png"));
		//ע�����
		jmi2.addActionListener(this);
		jmi2.setActionCommand("save");
		
		jmi3=new JMenuItem("�˳�",new ImageIcon("close.png"));
		jmi3.addActionListener(this);
		jmi3.setActionCommand("close");
		
		//����
		this.setJMenuBar(jmb);
		//�Ѳ˵��ŵ�MenuBar
		jmb.add(jm1);
		//��Item����Menu
		jm1.add(jmi1);
		jm1.add(jmi2);
		jm1.add(jmi3);
		
		//���뵽JFrame
		this.add(jta);
		
		this.setTitle("���±�..");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,500);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//�ж��Ǹ��˵���ѡ��
		if(e.getActionCommand().equals("open"))//��
		{
			System.out.println("��");
			//���ļ��Ի���JFileChooser
			JFileChooser jfc1=new JFileChooser();//����һ���ļ�ѡ�����
			jfc1.setDialogTitle("��ѡ���ļ�..");
			jfc1.showOpenDialog(null);//Ĭ�Ϸ�ʽ
			jfc1.setVisible(true);//������ʾ
			String filename=jfc1.getSelectedFile().getAbsolutePath();//�õ��û�ѡ���ȫ·��
			//System.out.println(filename);	
			
			FileReader fr=null;
			BufferedReader br=null;
			try
			{
				fr=new FileReader(filename);
				br=new BufferedReader(fr);
				//���ļ��ж�ȡ��Ϣ����ʾ��JTextArea��
				String s="";
				String allcon="";
				while((s=br.readLine())!=null)
				{
					allcon+=s+"\r\n";
				}
				//�����ݷ��õ�jta
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
		else if(e.getActionCommand().equals("save"))//����
		{
			System.out.println("����");
			JFileChooser jfc2=new JFileChooser();
			jfc2.setDialogTitle("���Ϊ..");
			jfc2.showSaveDialog(null);
			jfc2.setVisible(true);
			//�õ�ѡ���·����ȫ·��
			String file=jfc2.getSelectedFile().getAbsolutePath();
			//׼��д�뵽ָ���ļ�
			FileWriter fw=null;
			BufferedWriter bw=null;
			try
			{
				fw = new FileWriter(file);
				bw = new BufferedWriter(fw);
				//��JTextArea����д�뵽ָ���ļ���
				//�Լ��Ż�,���ַ�����
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


