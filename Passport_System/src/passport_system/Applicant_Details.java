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

public class Applicant_Details extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField a1;
	private JTextField a2;
	private JTextField a3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Applicant_Details frame = new Applicant_Details();
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
	public Applicant_Details() {
		setTitle("Applicant Details");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FILL OUT APPLICANT DETAILS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(108, 11, 246, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(22, 72, 94, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("NIC NUMBER");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(22, 122, 94, 26);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("CITY");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(22, 170, 94, 26);
		contentPane.add(lblNewLabel_1_2);
		
		a1 = new JTextField();
		a1.setBounds(165, 75, 189, 20);
		contentPane.add(a1);
		a1.setColumns(10);
		
		a2 = new JTextField();
		a2.setColumns(10);
		a2.setBounds(165, 125, 189, 20);
		contentPane.add(a2);
		
		a3 = new JTextField();
		a3.setColumns(10);
		a3.setBounds(165, 173, 189, 20);
		contentPane.add(a3);
		
		JButton btnNewButton = new JButton("FORWARD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name =a1.getText();
				String nic =a2.getText();
				String city =a3.getText();
				
				int Nic = Integer.parseInt(nic);
				
				Administrator at = new Administrator (name,Nic,city);
				at.forward_application(name,Nic,city);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(22, 227, 106, 23);
		contentPane.add(btnNewButton);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a1.setText(null);
				a2.setText(null);
				a3.setText(null);
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnClear.setBounds(164, 227, 106, 23);
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
		btnExit.setBounds(304, 227, 106, 23);
		contentPane.add(btnExit);
	}

}
