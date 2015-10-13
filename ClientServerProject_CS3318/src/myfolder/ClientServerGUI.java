package myfolder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClientServerGUI  
{

	private JFrame client_Server_frame;
	private JPasswordField passwordField;
	private JTextField UsrName_textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientServerGUI window = new ClientServerGUI();
					window.client_Server_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ClientServerGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		client_Server_frame = new JFrame();
		client_Server_frame.setBounds(100, 100, 450, 300);
		client_Server_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		client_Server_frame.getContentPane().setLayout(null);
		
		
		/*
		 * exit application properties exit will perform to close the GUI
		 */
		
		JButton exitButtonAPP = new JButton("Exit Application");
		
		
		exitButtonAPP.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				/*
				 * here we close the application successfully.
				 */
				client_Server_frame.dispose();
				//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			}
		});
		exitButtonAPP.setBounds(12, 220, 134, 29);
		client_Server_frame.getContentPane().add(exitButtonAPP);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setBounds(75, 142, 100, 16);
		client_Server_frame.getContentPane().add(lblUserName);
		
		JLabel lblClientServerApplication = new JLabel("Client Server Application");
		lblClientServerApplication.setBounds(140, 32, 163, 16);
		client_Server_frame.getContentPane().add(lblClientServerApplication);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(75, 176, 71, 16);
		client_Server_frame.getContentPane().add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(310, 220, 117, 29);
		client_Server_frame.getContentPane().add(btnLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(174, 170, 107, 28);
		client_Server_frame.getContentPane().add(passwordField);
		
		UsrName_textField = new JTextField();
		UsrName_textField.setBounds(169, 136, 134, 28);
		client_Server_frame.getContentPane().add(UsrName_textField);
		UsrName_textField.setColumns(10);
		
		JButton btnNewUser = new JButton("New User");
		btnNewUser.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
		client_Server_frame.dispose();
	
			}
		});
		
		btnNewUser.setBounds(164, 220, 117, 29);
		client_Server_frame.getContentPane().add(btnNewUser);
	}
}
