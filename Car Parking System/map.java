package FINALPROJECT;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class map extends JFrame {

	private JPanel contentPane;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					map frame = new map();
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
	public map() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Guest Map");
		btnNewButton.setFont(new Font("Sylfaen", Font.ITALIC, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			gmap frame = new gmap();
			}
		});
		btnNewButton.setBounds(15, 317, 252, 67);
		getContentPane().add(btnNewButton);
		
		JButton btnStaffMap = new JButton("Staff Map");
		btnStaffMap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			smap frame = new smap();
			}
		});
		btnStaffMap.setFont(new Font("Sylfaen", Font.ITALIC, 30));
		btnStaffMap.setBounds(439, 317, 252, 67);
		getContentPane().add(btnStaffMap);
		
		JButton btnVipMap = new JButton("VIP Map");
		btnVipMap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vmap frame = new vmap();
			}
		});
		btnVipMap.setFont(new Font("Sylfaen", Font.ITALIC, 30));
		btnVipMap.setBounds(852, 317, 252, 67);
		getContentPane().add(btnVipMap);
		
		JLabel lblMap = new JLabel("");
		lblMap.setIcon(new ImageIcon("C:\\Users\\Bares\\Desktop\\projectpictures\\Map.png"));
		lblMap.setHorizontalAlignment(SwingConstants.CENTER);
		lblMap.setToolTipText("");
		lblMap.setBounds(360, 42, 367, 222);
		getContentPane().add(lblMap);
	
		
	}
}
