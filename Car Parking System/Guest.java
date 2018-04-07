package FINALPROJECT;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Guest extends JFrame {

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
					Guest frame = new Guest();
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
	public Guest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1313, 591);
		contentPane = new JPanel();
		setTitle("Guest");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCheckIn = new JButton("Check In",in);
		btnCheckIn.setFont(new Font("Snap ITC", Font.BOLD, 30));
		btnCheckIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				IN checkin = new IN();
				checkin.setVisible(true);
			}
		});
		btnCheckIn.setBounds(97, 133, 450, 212);
		contentPane.add(btnCheckIn);
		
		JButton btnCheckOut = new JButton("Check Out",out);
		btnCheckOut.setFont(new Font("Snap ITC", Font.BOLD, 30));
		btnCheckOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OUT checkout = new OUT();
				checkout.setVisible(true);
			}
		});
		btnCheckOut.setBounds(622, 133, 450, 212);
		contentPane.add(btnCheckOut);
	}

}
