package FINALPROJECT;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class smap extends map {

	private JPanel contentPane;
	private ImageIcon image = new ImageIcon("C:\\Users\\Bares\\Desktop\\projectpictures\\green.png");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					smap frame = new smap();
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
	public smap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 789, 770);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JLabel button = new JLabel();
	button.setVerticalAlignment(SwingConstants.BOTTOM);
	button.setIcon(image);
	button.setText("1");
	button.setFont(new Font("Tahoma", Font.BOLD, 30));
	button.setHorizontalTextPosition(SwingConstants.CENTER);
	button.setVerticalTextPosition(SwingConstants.CENTER);
	button.setForeground(new Color(0, 0, 0));
	button.setBackground(new Color(0, 255, 0));
	button.setBounds(38, 16, 169, 96);
	contentPane.add(button);
	
	
	JLabel button_1 = new JLabel("2");
	button_1.setVerticalAlignment(SwingConstants.BOTTOM);
	button_1.setIcon(image);
	button_1.setFont(new Font("Tahoma", Font.BOLD, 30));
	button_1.setHorizontalTextPosition(SwingConstants.CENTER);
	button_1.setVerticalTextPosition(SwingConstants.CENTER);
	button_1.setForeground(new Color(0, 0, 0));
	button_1.setBackground(new Color(0, 255, 0));
	button_1.setBounds(38, 135, 169, 96);
	contentPane.add(button_1);
	
	JLabel button_2 = new JLabel("3");
	button_2.setIcon(image);
	button_2.setFont(new Font("Tahoma", Font.BOLD, 30));
	button_2.setHorizontalTextPosition(SwingConstants.CENTER);
	button_2.setVerticalTextPosition(SwingConstants.CENTER);
	button_2.setForeground(new Color(0, 0, 0));
	button_2.setBackground(new Color(0, 255, 0));
	button_2.setBounds(38, 247, 169, 96);
	contentPane.add(button_2);
	
	JLabel button_3 = new JLabel("4");
	button_3.setIcon(image);
	button_3.setFont(new Font("Tahoma", Font.BOLD, 30));
	button_3.setHorizontalTextPosition(SwingConstants.CENTER);
	button_3.setVerticalTextPosition(SwingConstants.CENTER);
	button_3.setForeground(new Color(0, 0, 0));
	button_3.setBackground(new Color(0, 255, 0));		
	button_3.setBounds(38, 359, 169, 96);
	contentPane.add(button_3);
	
	JLabel button_4 = new JLabel("5");
	button_4.setIcon(image);
	button_4.setFont(new Font("Tahoma", Font.BOLD, 30));
	button_4.setHorizontalTextPosition(SwingConstants.CENTER);
	button_4.setVerticalTextPosition(SwingConstants.CENTER);
	button_4.setForeground(new Color(0, 0, 0));
	button_4.setBackground(new Color(0, 255, 0));		
	button_4.setBounds(38, 484, 169, 96);
	contentPane.add(button_4);
	
	JLabel button_5 = new JLabel("6");
	button_5.setIcon(image);
	button_5.setFont(new Font("Tahoma", Font.BOLD, 30));
	button_5.setHorizontalTextPosition(SwingConstants.CENTER);
	button_5.setVerticalTextPosition(SwingConstants.CENTER);
	button_5.setForeground(new Color(0, 0, 0));
	button_5.setBackground(new Color(0, 255, 0));		
	button_5.setBounds(439, 16, 169, 96);
	contentPane.add(button_5);
	
	JLabel button_6 = new JLabel("7");
	button_6.setIcon(image);
	button_6.setFont(new Font("Tahoma", Font.BOLD, 30));
	button_6.setHorizontalTextPosition(SwingConstants.CENTER);
	button_6.setVerticalTextPosition(SwingConstants.CENTER);
	button_6.setForeground(new Color(0, 0, 0));
	button_6.setBackground(new Color(0, 255, 0));
	button_6.setBounds(439, 135, 169, 96);
	contentPane.add(button_6);
	
	JLabel button_7 = new JLabel("8");
	button_7.setIcon(image);
	button_7.setFont(new Font("Tahoma", Font.BOLD, 30));
	button_7.setHorizontalTextPosition(SwingConstants.CENTER);
	button_7.setVerticalTextPosition(SwingConstants.CENTER);
	button_7.setForeground(new Color(0, 0, 0));
	button_7.setBackground(new Color(0, 255, 0));
	button_7.setBounds(439, 247, 169, 96);
	contentPane.add(button_7);
	
	JLabel button_8 = new JLabel("9");
	button_8.setIcon(image);
	button_8.setFont(new Font("Tahoma", Font.BOLD, 30));
	button_8.setHorizontalTextPosition(SwingConstants.CENTER);
	button_8.setVerticalTextPosition(SwingConstants.CENTER);
	button_8.setForeground(new Color(0, 0, 0));
	button_8.setBackground(new Color(0, 255, 0));
	button_8.setBounds(439, 359, 169, 96);
	contentPane.add(button_8);
	
	JLabel button_9 = new JLabel("10");
	button_9.setIcon(image);
	button_9.setFont(new Font("Tahoma", Font.BOLD, 30));
	button_9.setHorizontalTextPosition(SwingConstants.CENTER);
	button_9.setVerticalTextPosition(SwingConstants.CENTER);
	button_9.setForeground(new Color(0, 0, 0));
	button_9.setBackground(new Color(0, 255, 0));
	button_9.setBounds(439, 471, 169, 96);
	contentPane.add(button_9);
	
	
	
	JRadioButton rdbtnPark = new JRadioButton("Park");
	rdbtnPark.setBounds(273, 50, 155, 29);
	contentPane.add(rdbtnPark);
	
	JRadioButton radioButton = new JRadioButton("Park");
	radioButton.setBounds(273, 169, 155, 29);
	contentPane.add(radioButton);
	
	JRadioButton radioButton_1 = new JRadioButton("Park");
	radioButton_1.setBounds(273, 281, 155, 29);
	contentPane.add(radioButton_1);
	
	JRadioButton radioButton_2 = new JRadioButton("Park");
	radioButton_2.setBounds(273, 393, 155, 29);
	contentPane.add(radioButton_2);
	
	JRadioButton radioButton_3 = new JRadioButton("Park");
	radioButton_3.setBounds(273, 518, 155, 29);
	contentPane.add(radioButton_3);
	
	JRadioButton radioButton_4 = new JRadioButton("Park");
	radioButton_4.setBounds(655, 50, 155, 29);
	contentPane.add(radioButton_4);
	
	JRadioButton radioButton_5 = new JRadioButton("Park");
	radioButton_5.setBounds(655, 169, 155, 29);
	contentPane.add(radioButton_5);
	
	JRadioButton radioButton_6 = new JRadioButton("Park");
	radioButton_6.setBounds(655, 281, 155, 29);
	contentPane.add(radioButton_6);
	
	JRadioButton radioButton_7 = new JRadioButton("Park");
	radioButton_7.setBounds(655, 393, 155, 29);
	contentPane.add(radioButton_7);
	
	JRadioButton radioButton_8 = new JRadioButton("Park");
	radioButton_8.setBounds(655, 518, 155, 29);
	contentPane.add(radioButton_8);
	
	ButtonGroup group = new ButtonGroup();
	
	group.add(rdbtnPark);
	group.add(radioButton);
	group.add(radioButton_1);
	group.add(radioButton_2);
	group.add(radioButton_3);
	group.add(radioButton_4);
	group.add(radioButton_5);
	group.add(radioButton_6);
	group.add(radioButton_7);
	group.add(radioButton_8);

	
	JButton btnOk = new JButton("OK");
	btnOk.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			image = new ImageIcon("C:\\Users\\Bares\\Desktop\\projectpictures\\red.png");
			if(rdbtnPark.isSelected())
			{
				
				button.setIcon(image);
				repaint();
			//	setVisible(false);
			}
			
			else if(radioButton.isSelected())
			{
				button_1.setIcon(image);
				repaint();
				//setVisible(false);
			}
			
			else if(radioButton_1.isSelected())
			{
				button_2.setIcon(image);
				repaint();
				//setVisible(false);
			}
			
			else if(radioButton_2.isSelected())
			{
				button_3.setIcon(image);
				repaint();
				//setVisible(false);
			}
			else if(radioButton_3.isSelected())
			{
				button_4.setIcon(image);
				repaint();
				//setVisible(false);
			}
			else if(radioButton_4.isSelected())
			{
				button_5.setIcon(image);
				repaint();
				//setVisible(false);
			}
			else if(radioButton_5.isSelected())
			{
				button_6.setIcon(image);
				repaint();
			//	setVisible(false);
			}
			else if(radioButton_6.isSelected())
			{
				button_7.setIcon(image);
				repaint();
				//setVisible(false);
			}
			else if(radioButton_7.isSelected())
			{
				button_8.setIcon(image);
				repaint();
				//setVisible(false);
			}
		else if(radioButton_8.isSelected())
			{
				button_9.setIcon(image);
				repaint();
				//setVisible(false);
			}
		
		}
	});
	btnOk.setBackground(Color.GRAY);
	btnOk.setBounds(259, 602, 169, 96);
	contentPane.add(btnOk);

}
	
}
