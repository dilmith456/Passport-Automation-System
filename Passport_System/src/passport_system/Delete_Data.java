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

public class Delete_Data extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField d1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete_Data frame = new Delete_Data();
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
	public Delete_Data() {
		setTitle("Delete Data");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REMOVE APPLICANT");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(142, 11, 169, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER APPLICANT NIC NUMBER BELOW");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(108, 60, 249, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NIC NUMBER");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_2.setBounds(183, 104, 95, 26);
		contentPane.add(lblNewLabel_2);
		
		d1 = new JTextField();
		d1.setBounds(142, 142, 169, 20);
		contentPane.add(d1);
		d1.setColumns(10);
		
		JButton btnNewButton = new JButton("REMOVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nic = d1.getText();
				
				int nic_no = Integer.parseInt(nic);
				
				Administrator aa = new Administrator(nic_no);
				aa.delete_data(nic_no);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(30, 191, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d1.setText(null);
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnReset.setBounds(301, 191, 89, 23);
		contentPane.add(btnReset);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_Functions af = new Admin_Functions();
				af.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnBack.setBounds(163, 191, 89, 23);
		contentPane.add(btnBack);
	}
}
