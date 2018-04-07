package FINALPROJECT;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class StaffIn extends JFrame {

	
	static ArrayList<String> staff = new ArrayList<String>();
	static ArrayList<Long> time = new ArrayList<Long>();
	
	private boolean display=false;
	private JPanel contentPane;
	private JTextField textField;
	public ImageIcon in = new ImageIcon("c:/Users/Bares/Desktop/projectpictures/in.png");
	public ImageIcon user = new ImageIcon("c:/Users/Bares/Desktop/projectpictures/user.png");
	public ImageIcon password = new ImageIcon("c:/Users/Bares/Desktop/projectpictures/password.png");
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffIn frame = new StaffIn();
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
	public StaffIn() {	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 1190, 688);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setTitle("Staff Check In");
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JLabel lblEnterYourNumber = new JLabel("User Name  :");
	lblEnterYourNumber.setFont(new Font("Sitka Text", Font.BOLD, 40));
	lblEnterYourNumber.setBounds(318, 16, 286, 136);
	contentPane.add(lblEnterYourNumber);
	
	textField = new JTextField();
	textField.setFont(new Font("Tahoma", Font.BOLD, 30));
	textField.setBounds(605, 64, 534, 63);
	contentPane.add(textField);
	textField.setColumns(10);
	

	
	JLabel lblPassword = new JLabel("  Password   :");
	lblPassword.setFont(new Font("Sitka Text", Font.BOLD, 40));
	lblPassword.setBounds(304, 208, 286, 136);
	contentPane.add(lblPassword);
	
	JLabel lblNewLabel = new JLabel(user);
	lblNewLabel.setBounds(15, 36, 268, 127);
	contentPane.add(lblNewLabel);
	
	JLabel label = new JLabel(password);
	label.setBounds(15, 238, 268, 91);
	contentPane.add(label);
	
	textField_1 = new JPasswordField();
	textField_1.setFont(new Font("Tahoma", Font.BOLD, 30));
	textField_1.setColumns(10);
	textField_1.setBounds(605, 238, 534, 63);
	contentPane.add(textField_1);
	
	
	JButton btnCheckIn = new JButton("Log In",in);
	btnCheckIn.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 20));
	btnCheckIn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (textField.getText().length()>=1 && textField_1.getText().length()>=1)
			{
			
				for(int i=0 ; i<SignUp.getStaff().size();i++)
			{
				if ( (textField).equals(SignUp.getStaff().get(i).getUser()) && (textField_1).equals(SignUp.getStaff().get(i).getPassword()))
				{
					display=true;
					JOptionPane.showMessageDialog(null, "Mr. "+ SignUp.getStaff().get(i).getName()  +" : Logged In");
					
					staff.add(textField.getText());
					time.add(System.currentTimeMillis());
					
				}
			}
				if (display == false)
				{
					JOptionPane.showMessageDialog(null, " Wrong UserName or Password ");
				}
			
			}
			else 
				JOptionPane.showMessageDialog(null, " please enter the user and password ");	
		}
	});
	btnCheckIn.setBounds(654, 422, 323, 127);
	contentPane.add(btnCheckIn);
	
	}

	public static ArrayList<String> getStaff() {
		return staff;
	}

	public static ArrayList<Long> getTime() {
		return time;
	}

}
