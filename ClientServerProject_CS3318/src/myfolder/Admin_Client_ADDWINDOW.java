package myfolder;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Admin_Client_ADDWINDOW {

	private JFrame admin_Client_frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Client_ADDWINDOW window = new Admin_Client_ADDWINDOW();
					window.admin_Client_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Admin_Client_ADDWINDOW() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		admin_Client_frame = new JFrame();
		admin_Client_frame.setBounds(100, 100, 450, 300);
		admin_Client_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
