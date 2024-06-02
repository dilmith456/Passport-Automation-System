package passport_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Applicant_Register extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JPasswordField psw;
	private JTextField text4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Applicant_Register frame = new Applicant_Register();
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
	public Applicant_Register() {
		setTitle("Register");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("APPLICANT REGISTRATION");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(157, 11, 228, 66);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(39, 90, 99, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("USERNAME");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(39, 123, 99, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ADDRESS ");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(39, 159, 99, 22);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("PASSWORD");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(39, 198, 99, 22);
		contentPane.add(lblNewLabel_4);
		
		text1 = new JTextField();
		text1.setBounds(158, 90, 266, 22);
		contentPane.add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setColumns(10);
		text2.setBounds(158, 125, 266, 22);
		contentPane.add(text2);
		
		text3 = new JTextField();
		text3.setColumns(10);
		text3.setBounds(158, 160, 266, 22);
		contentPane.add(text3);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = text1.getText();
				String username = text2.getText();
				String address = text3.getText();
				String password = psw.getText();
				String nic = text4.getText();
				
				int intnic = Integer.parseInt(nic);
				
				Applicant ob = new Applicant(name,username,address,password,intnic);
				ob.RegisterAccount(name,username,address,password,intnic);
				
				JOptionPane.showMessageDialog(null, "Submit Success");
			}
		});
		btnNewButton.setBounds(39, 287, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CLEAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText(null);
				text2.setText(null);
				text3.setText(null);
				psw.setText(null);
				text4.setText(null);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_1.setBounds(217, 287, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main_interface mi = new main_interface();
				mi.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_2.setBounds(395, 287, 89, 23);
		contentPane.add(btnNewButton_2);
		
		psw = new JPasswordField();
		psw.setBounds(157, 193, 266, 22);
		contentPane.add(psw);
		
		JLabel lblNewLabel_4_1 = new JLabel("NIC");
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_4_1.setBounds(39, 242, 99, 22);
		contentPane.add(lblNewLabel_4_1);
		
		text4 = new JTextField();
		text4.setColumns(10);
		text4.setBounds(157, 242, 266, 22);
		contentPane.add(text4);
		
		JLabel lblNewLabel_5 = new JLabel("PLEASE INSERT ONLY INTEGER VALUES");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 10));
		lblNewLabel_5.setBounds(156, 217, 266, 14);
		contentPane.add(lblNewLabel_5);
	}
}
