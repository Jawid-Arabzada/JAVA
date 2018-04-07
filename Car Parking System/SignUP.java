package FINALPROJECT;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class SignUp extends JFrame {
	
    
    
	static ArrayList<StaffDataBase> staff = new ArrayList<StaffDataBase>();
	static ArrayList<VIPDataBase> vip = new ArrayList<VIPDataBase>();
	
	
	public ImageIcon save = new ImageIcon("c:/Users/Bares/Desktop/projectpictures/save.png");
	public ImageIcon out =  new ImageIcon("c:/Users/Bares/Desktop/projectpictures/out.png");
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private static String type ;
	 boolean make;
	 private static int index = 0 ;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp(type);
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
	public SignUp(String type) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1492, 918);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Segoe Print", Font.BOLD, 50));
		lblName.setBounds(53, 16, 289, 123);
		contentPane.add(lblName);
		
		JLabel lblUserName = new JLabel("User Name :");
		lblUserName.setFont(new Font("Segoe Print", Font.BOLD, 50));
		lblUserName.setBounds(53, 155, 649, 123);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password :\r\n\r\n");
		lblPassword.setFont(new Font("Segoe Print", Font.BOLD, 50));
		lblPassword.setBounds(53, 294, 408, 123);
		contentPane.add(lblPassword);
		
		JLabel lblName_1 = new JLabel("NO Plate :");
		lblName_1.setFont(new Font("Segoe Print", Font.BOLD, 50));
		lblName_1.setBounds(53, 433, 540, 123);
		contentPane.add(lblName_1);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtName.setBounds(717, 51, 689, 57);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 30));
		textField.setColumns(10);
		textField.setBounds(717, 182, 689, 57);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		textField_1.setColumns(10);
		textField_1.setBounds(722, 472, 689, 57);
		contentPane.add(textField_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 30));
		passwordField.setBounds(717, 327, 689, 57);
		contentPane.add(passwordField);
		
		
		JButton btnNewButton = new JButton("Save",save);
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) 
			{
				if (txtName.getText().length()>=1  && textField.getText().length()>=1 && textField_1.getText().length()>=1 && passwordField.getText().length()>=1)
				{
					
					if (type == "staff"){
						setTitle("Staff Sign Up");
						for(int i = 0 ; i<staff.size() ; i++){
							if (textField.getText()!= staff.get(i).getUser())
	                         make = true;
							
							else 
							 make = false;
						}
							
						if (make == true ){
						staff.add(new StaffDataBase(txtName.getText(), textField.getText() , textField_1.getText(), passwordField.getText(),'s'));
                           JOptionPane.showMessageDialog(null, "Sign UP Done !");
       					setVisible(false);
       					}
						else
						{ 
						JOptionPane.showMessageDialog(null, "The user name already exist ");
						setVisible(false);}
						
					}
					
					else if (type == "vip")
					{
						setTitle("VIP Sign Up");
						for(int i = 0 ; i<vip.size() ; i++){
							if (textField.getText()!= vip.get(i).getUser())
	                         make = true;
							
							else 
							 make = false;
						}
							
						     if (make ==true ){
						    	 vip.add(new VIPDataBase(txtName.getText(), textField.getText() , textField_1.getText(), passwordField.getText(),'s'));
		                           JOptionPane.showMessageDialog(null, "Sign UP Done !");
		       					setVisible(false);
	       					}
							else 
							{ 
								JOptionPane.showMessageDialog(null, "The user name already exist ");
							setVisible(false);}
						}
					}
					 
					
				
					
			}	
		
			
				
				
			
		});
		
		
		btnNewButton.setFont(new Font("Snap ITC", Font.BOLD, 30));
		btnNewButton.setBounds(237, 634, 430, 163);
		contentPane.add(btnNewButton);
		
		
		
		JButton btnCancel = new JButton("Cancel",out);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
			}
		});
		btnCancel.setFont(new Font("Snap ITC", Font.BOLD, 30));
		btnCancel.setBounds(831, 634, 430, 163);
		contentPane.add(btnCancel);
	}

	public static ArrayList<StaffDataBase> getStaff() {
		return staff;
	}

	public static ArrayList<VIPDataBase> getVip() {
		return vip;
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
