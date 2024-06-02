package passport_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import gui.birth;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.awt.event.ActionEvent;

public class Doc_Interface extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Doc_Interface frame = new Doc_Interface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Doc_Interface() {
		setTitle("Documents Upload");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UPLOAD YOUR SCANNED BIRTH CERTIFICATE");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(38, 11, 371, 44);
		contentPane.add(lblNewLabel);
		
		u1 = new JTextField();
		u1.setBounds(38, 93, 263, 20);
		contentPane.add(u1);
		u1.setColumns(10);
		
		JButton btnNewButton = new JButton("UPLOAD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser fileChooser = new JFileChooser();
		        fileChooser.showOpenDialog(null);
		        
		        
		       File f = fileChooser.getSelectedFile();
		       if(f !=null) {
		    	   String filepath=f.getAbsolutePath();
		    	   u1.setText(filepath);
		    	   
		    	   try {
		    		   FileInputStream fis = new FileInputStream(f);
		    		   ByteArrayOutputStream bos = new ByteArrayOutputStream();
		    		   byte[] buf = new byte[1024];
		    		   
		    		   for(int readNum;(readNum=fis.read(buf)) != -1;) {
		    			   bos.write(buf,0,readNum);
		    		   }
		    		   photo=bos.toByteArray();
		    	   }
		    	   catch(Exception e1) {
		    		   System.out.println(e1.getMessage());
		   			System.out.println(e1);
		    	   }
		       }
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(320, 92, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Note- Please Upload  1123px * 794px  Image");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1.setBounds(38, 124, 263, 31);
		contentPane.add(lblNewLabel_1);
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(u1.getText()!= null) {
					Doc d= new Doc();
					d.upload(u1.getText());
					
					u1.setText("");
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Please upload document");
				}
			}
			
		});
		btnInsert.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnInsert.setBounds(38, 209, 89, 23);
		contentPane.add(btnInsert);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnClear.setBounds(183, 209, 89, 23);
		contentPane.add(btnClear);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Payment py = new Payment();
				py.setVisible(true);
			}
		});
		btnNext.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNext.setBounds(320, 209, 89, 23);
		contentPane.add(btnNext);
	}
byte[]photo=null;
String filename=null;
private JTextField u1;

}
