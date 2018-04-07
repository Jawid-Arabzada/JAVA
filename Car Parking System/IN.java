package FINALPROJECT;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.awt.List;
import java.util.Scanner;

public class IN extends JFrame {

	static ArrayList<String> guest = new ArrayList<String>();
	static ArrayList<Long> time = new ArrayList<Long>();
	
	long start;
	private JPanel contentPane;
	private JTextField textField;
	public ImageIcon in = new ImageIcon("c:/Users/Bares/Desktop/projectpictures/in.png");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IN frame = new IN();
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
	public IN() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1190, 688);
		contentPane = new JPanel();
		setTitle("Check In");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterYourNumber = new JLabel("Enter Your Number Plate   :");
		lblEnterYourNumber.setFont(new Font("Tahoma", Font.PLAIN, 44));
		lblEnterYourNumber.setBounds(15, 75, 589, 192);
		contentPane.add(lblEnterYourNumber);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 30));
		textField.setBounds(619, 121, 534, 123);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnCheckIn = new JButton("Check In",in);
		btnCheckIn.setFont(new Font("Snap ITC", Font.BOLD, 30));
		btnCheckIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (textField.getText().length() >= 1)
				{
					if(guest.size()<10)
					{
					start = System.currentTimeMillis();
					
					guest.add(textField.getText());
					time.add(start);
					
					JOptionPane.showMessageDialog(null, "You are checked In ");	
					setVisible(false);
					}
					else 
					{
						JOptionPane.showMessageDialog(null, "Parking is Full ");	
						setVisible(false);
					}
						
				}
				
				else 
				{
					JOptionPane.showMessageDialog(null, "Please Insert NP ");	
					setVisible(false);
				}
				
			}
		});
		btnCheckIn.setBounds(406, 327, 359, 207);
		contentPane.add(btnCheckIn);
		
		JLabel lblCapacity = new JLabel("cars : "+guest.size());
		lblCapacity.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCapacity.setBounds(15, 15, 115, 44);
		contentPane.add(lblCapacity);
		
		JLabel lblCapacity_1 = new JLabel("capacity : "+(10-(guest.size())));
		lblCapacity_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCapacity_1.setBounds(1007, 15, 146, 44);
		contentPane.add(lblCapacity_1);
	}

	public static ArrayList<String> getGuest() {
		return guest;
	}

	public static ArrayList<Long> getTime() {
		return time;
	}
}
