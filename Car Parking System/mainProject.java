package FINALPROJECT;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import java.awt.Color;
import java.awt.Font;

import javax.swing.border.LineBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class mainProject {

	private JFrame frame;
	public ImageIcon car = new ImageIcon("c:/Users/Bares/Desktop/projectpictures/car.png");
	public ImageIcon staffcar = new ImageIcon("c:/Users/Bares/Desktop/projectpictures/staff.png");
	public ImageIcon vipcar = new ImageIcon("c:/Users/Bares/Desktop/projectpictures/vip.png");
	public ImageIcon Map = new ImageIcon("c:/Users/Bares/Desktop/projectpictures/Map.png");
	public ImageIcon parking = new ImageIcon("c:/Users/Bares/Desktop/projectpictures/parking.png");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainProject window = new mainProject();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mainProject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Car Parking");
		frame.setBounds(100, 100, 1355, 863);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnGuest = new JButton("Guest");
		btnGuest.setFont(new Font("Sitka Subheading", Font.BOLD, 30));
		btnGuest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Guest showframe = new Guest();
				showframe.setVisible(true);
			}
		});
		btnGuest.setBounds(15, 208, 327, 84);
		frame.getContentPane().add(btnGuest);
		
		JButton btnStaff = new JButton("Staff");
		btnStaff.setFont(new Font("Sitka Subheading", Font.BOLD, 30));
		btnStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Staff showframe = new Staff();
				showframe.setVisible(true);
			}
		});
		btnStaff.setBounds(384, 208, 294, 84);
		frame.getContentPane().add(btnStaff);
		
		JButton btnVip = new JButton("VIP");
		btnVip.setFont(new Font("Sitka Subheading", Font.BOLD, 30));
		btnVip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VIP showframe = new VIP();
				showframe.setVisible(true);
			}
		});
		btnVip.setBounds(734, 208, 279, 84);
		frame.getContentPane().add(btnVip);
		
		JButton btnMap = new JButton("Map");
		btnMap.setFont(new Font("Sitka Subheading", Font.BOLD, 30));
		btnMap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				map Map = new map();
				Map.setVisible(true);
			}
		});
		btnMap.setBounds(1051, 208, 267, 84);
		frame.getContentPane().add(btnMap);
		
		JLabel lblWelcomeToEnjs = new JLabel(parking);
		lblWelcomeToEnjs.setText("Welcome To Afghan Car Parking\r\n");
		lblWelcomeToEnjs.setToolTipText("");
		lblWelcomeToEnjs.setBackground(Color.LIGHT_GRAY);
		lblWelcomeToEnjs.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblWelcomeToEnjs.setForeground(Color.DARK_GRAY);
		lblWelcomeToEnjs.setBounds(122, 16, 1116, 140);
		frame.getContentPane().add(lblWelcomeToEnjs);
		
		JLabel lblNewLabel = new JLabel(car);
		lblNewLabel.setBounds(25, 292, 294, 188);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(staffcar);
		lblNewLabel_1.setBounds(378, 323, 284, 157);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(vipcar);
		lblNewLabel_2.setBounds(734, 356, 285, 105);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(Map);
		lblNewLabel_3.setBounds(1070, 356, 231, 121);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblSayedFaqir = new JLabel("\t1.  Sayed Faqir Bares              (1320587) ");
		lblSayedFaqir.setFont(new Font("Yu Mincho Light", Font.BOLD, 40));
		lblSayedFaqir.setBounds(122, 507, 844, 70);
		frame.getContentPane().add(lblSayedFaqir);
		
		JLabel lblEhsanullahAhmadi = new JLabel("\t2.  Ehsanullah Ahmadi            (1210731)  \r\n\t");
		lblEhsanullahAhmadi.setFont(new Font("Yu Mincho Light", Font.BOLD, 40));
		lblEhsanullahAhmadi.setBounds(122, 571, 844, 70);
		frame.getContentPane().add(lblEhsanullahAhmadi);
		
		JLabel lblJawidArabzada = new JLabel("\t3.  Jawid Arabzada                 (1328317)");
		lblJawidArabzada.setFont(new Font("Yu Mincho Light", Font.BOLD, 40));
		lblJawidArabzada.setBounds(122, 632, 804, 70);
		frame.getContentPane().add(lblJawidArabzada);
		
		JLabel lblNajmuddinSadruddin = new JLabel("4.  Najmuddin Sadruddin        (1427539)");
		lblNajmuddinSadruddin.setFont(new Font("Yu Mincho Light", Font.BOLD, 40));
		lblNajmuddinSadruddin.setBounds(122, 692, 804, 70);
		frame.getContentPane().add(lblNajmuddinSadruddin);
		
	}
}
