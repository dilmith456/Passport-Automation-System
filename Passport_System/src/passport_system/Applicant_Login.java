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
import javax.swing.JPasswordField;

public class Applicant_Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField uname;
	private JPasswordField psw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Applicant_Login frame = new Applicant_Login();
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
	public Applicant_Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER  LOGIN");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(170, 22, 115, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(43, 86, 109, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(43, 137, 109, 23);
		contentPane.add(lblNewLabel_1_1);
		
		uname = new JTextField();
		uname.setBounds(180, 87, 160, 22);
		contentPane.add(uname);
		uname.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = uname.getText();
				String password = psw.getText();
				
				Applicant ob = new Applicant(username,password);
				ob.Login(username, password);
				
				Success_Login sl = new Success_Login();
				sl.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(43, 208, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uname.setText(null);
				psw.setText(null);
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnClear.setBounds(291, 208, 89, 23);
		contentPane.add(btnClear);
		
		psw = new JPasswordField();
		psw.setBounds(180, 138, 160, 22);
		contentPane.add(psw);
	}
}
