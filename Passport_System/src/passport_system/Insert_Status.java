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

public class Insert_Status extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField s1;
	private JTextField s2;
	private JTextField s3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Insert_Status frame = new Insert_Status();
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
	public Insert_Status() {
		setTitle("Status");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INSERT APPLICATION STATUS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(103, 11, 247, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(28, 66, 101, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("NIC NUMBER");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(28, 118, 101, 29);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("STATUS");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(28, 172, 101, 29);
		contentPane.add(lblNewLabel_1_2);
		
		s1 = new JTextField();
		s1.setBounds(160, 70, 200, 25);
		contentPane.add(s1);
		s1.setColumns(10);
		
		s2 = new JTextField();
		s2.setColumns(10);
		s2.setBounds(160, 122, 200, 25);
		contentPane.add(s2);
		
		s3 = new JTextField();
		s3.setColumns(10);
		s3.setBounds(160, 176, 200, 25);
		contentPane.add(s3);
		
		JButton btnNewButton = new JButton("INSERT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = s1.getText();
				String nic_no = s2.getText();
				String status = s3.getText();
				
				int nic = Integer.parseInt(nic_no);
				
				Administrator in = new Administrator(name,nic,status);
				in.insert_data(name,nic,status);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(20, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1.setText(null);
				s2.setText(null);
				s3.setText(null);
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnClear.setBounds(160, 227, 89, 23);
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
		btnExit.setBounds(299, 227, 89, 23);
		contentPane.add(btnExit);
	}
}
