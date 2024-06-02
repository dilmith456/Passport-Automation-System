package passport_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Payment extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment frame = new Payment();
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
	public Payment() {
		setTitle("Payemt Method");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SELECT YOUR PAYMENT METHOD");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(96, 21, 282, 71);
		contentPane.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("CREDIT / DEBIT CARD");
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxNewCheckBox.setBounds(49, 99, 182, 30);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxEzCash = new JCheckBox("eZ CASH");
		chckbxEzCash.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxEzCash.setBounds(49, 155, 182, 30);
		contentPane.add(chckbxEzCash);
		
		JButton btnNewButton = new JButton("CONFIRM");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(292, 213, 108, 37);
		contentPane.add(btnNewButton);
	}
}
