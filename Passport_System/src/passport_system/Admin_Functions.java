package passport_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin_Functions extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Functions frame = new Admin_Functions();
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
	public Admin_Functions() {
		setTitle("Admin Work Flow");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 673, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TASK  LIST");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(280, 11, 94, 44);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("FORWARD DETAILS TO POLICE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Applicant_Details ad = new Applicant_Details();
				ad.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(24, 67, 230, 44);
		contentPane.add(btnNewButton);
		
		JButton btnSendSms = new JButton("SEND SMS");
		btnSendSms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Send_sms ss = new Send_sms();
				ss.setVisible(true);
			}
		});
		btnSendSms.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnSendSms.setBounds(24, 154, 217, 44);
		contentPane.add(btnSendSms);
		
		JButton btnShowStaus = new JButton("SHOW STAUS");
		btnShowStaus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show_status ss = new show_status();
				ss.setVisible(true);
			}
		});
		btnShowStaus.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnShowStaus.setBounds(24, 240, 217, 44);
		contentPane.add(btnShowStaus);
		
		JButton btnInsertData = new JButton("INSERT DATA");
		btnInsertData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Insert_Status is = new Insert_Status();
				is.setVisible(true);
			}
		});
		btnInsertData.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnInsertData.setBounds(381, 66, 217, 44);
		contentPane.add(btnInsertData);
		
		JButton btnUpdateData = new JButton("UPDATE DATA");
		btnUpdateData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update_status us = new update_status();
				us.setVisible(true);
			}
		});
		btnUpdateData.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnUpdateData.setBounds(381, 154, 217, 44);
		contentPane.add(btnUpdateData);
		
		JButton btnDeleteData = new JButton("DELETE DATA");
		btnDeleteData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delete_Data dd = new Delete_Data();
				dd.setVisible(true);
			}
		});
		btnDeleteData.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnDeleteData.setBounds(381, 240, 217, 44);
		contentPane.add(btnDeleteData);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(312, 66, 0, 249);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(24, 53, 623, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(24, 122, 623, 2);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(24, 216, 623, 13);
		contentPane.add(separator_3);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null, "Are you sure you want to Exit ? ","Select", JOptionPane.YES_NO_OPTION);
				if (a==0) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnExit.setBounds(204, 302, 217, 44);
		contentPane.add(btnExit);
	}
}
