package passport_system;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main_interface extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main_interface frame = new main_interface();
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
	public main_interface() {
		setForeground(Color.RED);
		setTitle("Passport");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO SRI LANKA PASSPORTS");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(84, 11, 297, 84);
		contentPane.add(lblNewLabel);
		
		JButton register = new JButton("REGISTER");
		register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Applicant_Register ap = new Applicant_Register();
				ap.setVisible(true);
			}
		});
		register.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		register.setBounds(154, 106, 147, 40);
		contentPane.add(register);
		
		JButton login = new JButton("LOGIN");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Applicant_Login al = new Applicant_Login();
				al.setVisible(true);
				
			}
		});
		login.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		login.setBounds(154, 175, 147, 40);
		contentPane.add(login);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 79, 414, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 251, 414, 2);
		contentPane.add(separator_1);
	}
}
