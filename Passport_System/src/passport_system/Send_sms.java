package passport_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Send_sms extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField m1;
	private JTextField m2;
	private JTextField m3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Send_sms frame = new Send_sms();
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
	public Send_sms() {
		setTitle("Send SMS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SEND A MESSEGE TO APPLICANT");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(98, 11, 265, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(27, 67, 92, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("MOBILE NUMBER");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(27, 117, 113, 29);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("MESSAGE");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(27, 171, 92, 29);
		contentPane.add(lblNewLabel_1_2);
		
		m1 = new JTextField();
		m1.setBounds(160, 68, 203, 20);
		contentPane.add(m1);
		m1.setColumns(10);
		
		m2 = new JTextField();
		m2.setColumns(10);
		m2.setBounds(160, 121, 203, 20);
		contentPane.add(m2);
		
		m3 = new JTextField();
		m3.setColumns(10);
		m3.setBounds(160, 175, 203, 20);
		contentPane.add(m3);
		
		JButton btnNewButton = new JButton("SEND");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = m1.getText();
				String mob = m2.getText();
				
				int Mob = Integer.parseInt(mob);
				
				String message=m3.getText();
				
				Administrator cc = new Administrator(name,Mob,message);
				cc.send_sms(name,Mob,message);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(30, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m1.setText(null);
				m2.setText(null);
				m3.setText(null);
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnClear.setBounds(182, 227, 89, 23);
		contentPane.add(btnClear);
		
		JButton btnExit = new JButton("BACK");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_Functions af = new Admin_Functions();
				af.setVisible(true);
				dispose();
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnExit.setBounds(324, 227, 89, 23);
		contentPane.add(btnExit);
	}
}
