package passport_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class Form extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	private JTextField txt5;
	private JTextField txt6;
	private JTextField txt7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form frame = new Form();
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
	public Form() {
		setTitle("Applicant Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("APPLICANT FORM");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(219, 11, 157, 54);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(47, 70, 116, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ADDRESS");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(47, 113, 116, 32);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("CITY");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(47, 156, 116, 32);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("OCCUPATION");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1_3.setBounds(47, 199, 116, 32);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("NIC");
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1_4.setBounds(47, 242, 116, 32);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("GENDER");
		lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1_5.setBounds(47, 283, 116, 32);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("MOBILE NUMBER");
		lblNewLabel_1_6.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1_6.setBounds(47, 326, 116, 32);
		contentPane.add(lblNewLabel_1_6);
		
		txt1 = new JTextField();
		txt1.setBounds(229, 76, 261, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(229, 119, 261, 20);
		contentPane.add(txt2);
		
		txt3 = new JTextField();
		txt3.setColumns(10);
		txt3.setBounds(229, 162, 261, 20);
		contentPane.add(txt3);
		
		txt4 = new JTextField();
		txt4.setColumns(10);
		txt4.setBounds(229, 205, 261, 20);
		contentPane.add(txt4);
		
		txt5 = new JTextField();
		txt5.setColumns(10);
		txt5.setBounds(229, 248, 261, 20);
		contentPane.add(txt5);
		
		txt6 = new JTextField();
		txt6.setColumns(10);
		txt6.setBounds(229, 289, 261, 20);
		contentPane.add(txt6);
		
		txt7 = new JTextField();
		txt7.setColumns(10);
		txt7.setBounds(229, 332, 261, 20);
		contentPane.add(txt7);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txt1.getText();
				String address = txt2.getText();
				String city = txt3.getText();
				String occupation= txt4.getText();
				
				String nic = txt5.getText();
				int Nic = Integer.parseInt(nic);
				
				String gender=txt6.getText();
				
				String mobile=txt7.getText();
				int mob =Integer.parseInt(mobile);
				
				//String document=txt8.getText();
				
				Applicant ob = new Applicant(name,address,city,occupation,Nic,gender,mob);
				ob.getapplication(name,address,city,occupation,Nic,gender,mob);
				
				Doc_Interface di = new Doc_Interface();
				di.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(47, 416, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt1.setText(null);
				txt2.setText(null);
				txt3.setText(null);
				txt4.setText(null);
				txt5.setText(null);
				txt6.setText(null);
				txt7.setText(null);
				//txt8.setText(null);
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnClear.setBounds(228, 416, 89, 23);
		contentPane.add(btnClear);
		
		JButton btnExit = new JButton("BACK");
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Success_Login sl = new Success_Login();
				sl.setVisible(true);
				dispose();
			}
		});
		btnExit.setBounds(401, 416, 89, 23);
		contentPane.add(btnExit);
	}
}
