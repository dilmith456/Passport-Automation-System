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

public class update_status extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField u1;
	private JTextField u2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					update_status frame = new update_status();
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
	public update_status() {
		setTitle("Update");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UPDATE APPLICANT STATUS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(106, 11, 230, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NIC NUMBER");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(35, 81, 99, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("STATUS");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(35, 132, 99, 27);
		contentPane.add(lblNewLabel_1_1);
		
		u1 = new JTextField();
		u1.setBounds(166, 84, 203, 20);
		contentPane.add(u1);
		u1.setColumns(10);
		
		u2 = new JTextField();
		u2.setColumns(10);
		u2.setBounds(166, 135, 203, 20);
		contentPane.add(u2);
		
		JButton btnNewButton = new JButton("UPDATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nic=u1.getText();
				String status=u2.getText();
				
				int nic_no = Integer.parseInt(nic);
				
				Administrator ad = new Administrator(status,nic_no);
				ad.update_data(status,nic_no);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(35, 208, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				u1.setText(null);
				u2.setText(null);
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnClear.setBounds(174, 208, 89, 23);
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
		btnExit.setBounds(312, 208, 89, 23);
		contentPane.add(btnExit);
	}
}
