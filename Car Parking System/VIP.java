package FINALPROJECT;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VIP extends JFrame {

	private JPanel contentPane;

	public ImageIcon in = new ImageIcon("c:/Users/Bares/Desktop/projectpictures/in.png");
	public ImageIcon out = new ImageIcon("c:/Users/Bares/Desktop/projectpictures/out.png");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VIP frame = new VIP();
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
	public VIP() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1313, 591);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setTitle("VIP");
		contentPane.setLayout(null);
		
		JButton btnCheckIn = new JButton("Check In",in);
		btnCheckIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VIPIN checkin = new VIPIN();
				checkin.setVisible(true);
			}
		});
		btnCheckIn.setBounds(97, 133, 450, 212);
		contentPane.add(btnCheckIn);
		
		JButton btnCheckOut = new JButton("Check Out",out);
		btnCheckOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VIPOUT checkout = new VIPOUT();
				checkout.setVisible(true);
			}
		});
		btnCheckOut.setBounds(622, 133, 450, 212);
		contentPane.add(btnCheckOut);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp user = new SignUp("vip");
				user.setVisible(true);
			}
		});
		btnSignUp.setBounds(376, 386, 471, 104);
		contentPane.add(btnSignUp);
	}

}
