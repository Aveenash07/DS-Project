import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class WelcomePage extends JFrame {

	private JPanel contentPane;
	private JTextField userText;
	private JTextField passText;
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePage frame = new WelcomePage();
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
	public WelcomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(255, 0, 0), 3));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome");
		lblNewLabel_1.setForeground(SystemColor.control);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 50));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(23, 11, 345, 59);
		contentPane.add(lblNewLabel_1);
		
		userText = new JTextField();
		userText.setBounds(179, 315, 131, 20);
		contentPane.add(userText);
		userText.setColumns(10);
		
		passText = new JTextField();
		passText.setColumns(10);
		passText.setBounds(179, 365, 131, 20);
		contentPane.add(passText);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(userText.getText().equals("SIBA") && passText.getText().equals("7700"))
				{
				dispose();
				
				try {
					/*
					 * If file  does not exist then it will be created automatically
					 */
					FileWriter file1 = new FileWriter(new File("src//dr1.txt"),true);
					FileWriter file2 = new FileWriter(new File("src//dr2.txt"),true);
					FileWriter file3 = new FileWriter(new File("src//dr3.txt"),true);
					
					FileWriter file4 = new FileWriter(new File("src//drsTimingForNormal.txt"),true);
					file1.close();
					file2.close();
					file3.close();
					file4.close();
					
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				new patientStatus();
				
			}
				else 
					JOptionPane.showMessageDialog(contentPane, "Kindly Enter The Correct UserName and Passwords :(");
					
				
			}
			
			
		});
		
		btnNewButton.setFont(new Font("Microsoft YaHei", Font.BOLD, 13));
		btnNewButton.setForeground(SystemColor.desktop);
		btnNewButton.setBounds(179, 424, 131, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("To");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(SystemColor.menu);
		lblNewLabel_1_1.setFont(new Font("SansSerif", Font.BOLD, 50));
		lblNewLabel_1_1.setBounds(45, 81, 300, 51);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("The Helping Hand");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(SystemColor.menu);
		lblNewLabel_1_1_1.setFont(new Font("SansSerif", Font.BOLD, 50));
		lblNewLabel_1_1_1.setBounds(10, 121, 469, 108);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Hospital Sukkur");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setForeground(SystemColor.menu);
		lblNewLabel_1_1_1_1.setFont(new Font("SansSerif", Font.BOLD, 50));
		lblNewLabel_1_1_1_1.setBounds(23, 218, 434, 59);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("User Name");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(SystemColor.menu);
		lblNewLabel_1_2.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(45, 310, 140, 24);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Password");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setForeground(SystemColor.menu);
		lblNewLabel_1_2_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_1_2_1.setBounds(45, 365, 140, 24);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(102, 255, 51));
		lblNewLabel.setForeground(new Color(51, 255, 0));
		lblNewLabel.setIcon(new ImageIcon("src//pic2.PNG"));
		lblNewLabel.setBounds(0, 0, 784, 487);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("UserName");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setForeground(SystemColor.menu);
		lblNewLabel_1_1_1_1_1.setFont(new Font("SansSerif", Font.BOLD, 50));
		lblNewLabel_1_1_1_1_1.setBounds(340, 326, 434, 59);
		contentPane.add(lblNewLabel_1_1_1_1_1);
	}
}
