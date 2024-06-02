package passport_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class police_verify extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField p1;
	private JTextField p2;
	private JTextField p3;
	private JTextField p4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					police_verify frame = new police_verify();
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
	public police_verify() {
		setTitle("Police Verification");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("POLICE VERIFICATION");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(162, 22, 183, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("  INSERT CHARACTER DETAILS");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(157, 70, 188, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NAME");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(27, 123, 86, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("NIC NUMBER");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(27, 173, 86, 23);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("CHARACTER");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_2_2.setBounds(27, 226, 86, 23);
		contentPane.add(lblNewLabel_2_2);
		
		p1 = new JTextField();
		p1.setBounds(162, 123, 183, 23);
		contentPane.add(p1);
		p1.setColumns(10);
		
		p2 = new JTextField();
		p2.setColumns(10);
		p2.setBounds(162, 174, 183, 23);
		contentPane.add(p2);
		
		p3 = new JTextField();
		p3.setColumns(10);
		p3.setBounds(162, 226, 183, 23);
		contentPane.add(p3);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("APPLICATION");
		lblNewLabel_2_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_2_2_1.setBounds(27, 267, 86, 23);
		contentPane.add(lblNewLabel_2_2_1);
		
		p4 = new JTextField();
		p4.setColumns(10);
		p4.setBounds(162, 268, 183, 23);
		contentPane.add(p4);
		
		JButton btnNewButton = new JButton("INSERT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = p1.getText();
				String nic = p2.getText();
				String life_status = p3.getText();
				String application =p4.getText();
				
				int Nic = Integer.parseInt(nic);
				
				Police p = new Police(name,Nic,life_status,application);
				p.Insert_character(name,Nic,life_status,application);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(24, 315, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p1.setText(null);
				p2.setText(null);
				p3.setText(null);
				p4.setText(null);
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnClear.setBounds(196, 315, 89, 23);
		contentPane.add(btnClear);
		
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
		btnExit.setBounds(351, 315, 89, 23);
		contentPane.add(btnExit);
	}
}
