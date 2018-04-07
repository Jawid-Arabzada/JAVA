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
import java.awt.Font;
import javax.swing.SwingConstants;

public class Staff extends JFrame {

	private JPanel contentPane;

	public ImageIcon in  = new ImageIcon("c:/Users/Bares/Desktop/projectpictures/in.png");
	public ImageIcon out = new ImageIcon("c:/Users/Bares/Desktop/projectpictures/out.png");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Staff frame = new Staff();
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
	public Staff() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1313, 591);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCheckIn = new JButton("Check In",in);
		btnCheckIn.setFont(new Font("Snap ITC", Font.BOLD, 30));
		btnCheckIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				StaffIn checkin = new StaffIn();
				checkin.setVisible(true);
			}
		});
		btnCheckIn.setBounds(97, 133, 450, 212);
		contentPane.add(btnCheckIn);
		
		JButton btnCheckOut = new JButton("Check Out",out);
		btnCheckOut.setFont(new Font("Snap ITC", Font.BOLD, 30));
		btnCheckOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffOut checkout = new StaffOut();
				checkout.setVisible(true);
			}
		});
		btnCheckOut.setBounds(622, 133, 450, 212);
		contentPane.add(btnCheckOut);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setHorizontalAlignment(SwingConstants.LEFT);
		btnSignUp.setIcon(new ImageIcon("C:\\Users\\Bares\\Desktop\\projectpictures\\signup.png"));
		btnSignUp.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 30));
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SignUp user = new SignUp("staff");
				user.setVisible(true);
			}
		});
		btnSignUp.setBounds(397, 384, 322, 111);
		contentPane.add(btnSignUp);
	}
}
