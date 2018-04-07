package FINALPROJECT;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class OUT extends JFrame {
	
	private final double price=0.1;
	private boolean find = false ;
	private long stop;
	private double Tprice;
	private JPanel contentPane;
	private JTextField textField;
	public ImageIcon out = new ImageIcon("c:/Users/Bares/Desktop/projectpictures/out.png");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OUT frame = new OUT();
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
	public OUT() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1190, 688);
		setTitle("Check Out");
		contentPane = new JPanel();
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
		
		JButton btnCheckOut = new JButton("Check out",out);
		btnCheckOut.setFont(new Font("Snap ITC", Font.BOLD, 30));
		btnCheckOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textField.getText().length() >= 1)
				{
				    stop = System.currentTimeMillis();
					for (int i = 0 ; i < IN.getGuest().size() ; i++)
					{
						if ((textField.getText()).equals(IN.getGuest().get(i)))
								{
							find =true;
							stop = System.currentTimeMillis();
							Tprice = (stop - IN.getTime().get(i))*price;
							
							JOptionPane.showMessageDialog(null, "Total Price is :  "+ Tprice+"\n You are checked out \n Thank you and come again :) ");
							setVisible(false);
							IN.getGuest().remove(i);
							IN.getTime().remove(i);
								}
					}
					if (find == false)
					{
						JOptionPane.showMessageDialog(null, "The NP doesnt exist in our DataBase ");
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
		btnCheckOut.setBounds(406, 327, 359, 207);
		contentPane.add(btnCheckOut);
	}

}
