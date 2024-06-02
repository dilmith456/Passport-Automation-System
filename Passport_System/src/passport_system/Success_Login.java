package passport_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Success_Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Success_Login frame = new Success_Login();
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
	public Success_Login() {
		setTitle("you are Logged In");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PLEASE CLICK ONE OPTION");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(114, 11, 221, 60);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 69, 414, 2);
		contentPane.add(separator);
		
		JButton btnNewButton = new JButton("GET APPLICATION");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form fm = new Form();
				fm.setVisible(true);
			}
		});
		btnNewButton.setBounds(146, 90, 161, 46);
		contentPane.add(btnNewButton);
		
		JButton btnViewStatus = new JButton("VIEW STATUS");
		btnViewStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				View_Status vs = new View_Status();
				vs.setVisible(true);
			}
		});
		btnViewStatus.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnViewStatus.setBounds(146, 176, 161, 46);
		contentPane.add(btnViewStatus);
	}
}
