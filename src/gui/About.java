package gui;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;


public class About extends JPanel {
	private JTextField userField;
	private JLabel loggedInAsLbl;
	private JLabel snakeLbl;
	private JButton logOutBtn;
	private JButton menuBtn;
	private JTextArea infoArea;
	private JButton moreInfoBtn; 
	
	/**
	 * Create the panel.
	 */
	public About() {
		setBackground(new Color(255, 255, 224));
		setLayout(null);
		
		ImageIcon snake = new ImageIcon(this.getClass().getResource("animated-snake-image-0027.gif")); 
		snakeLbl = new JLabel("");
		snakeLbl.setIcon(snake);
		snakeLbl.setBounds(30, 11, 209, 81);
		add(snakeLbl);
		
		loggedInAsLbl = new JLabel("Logged in as:");
		loggedInAsLbl.setFont(new Font("Gill Sans MT", Font.BOLD, 14));
		loggedInAsLbl.setBounds(259, 11, 107, 17);
		add(loggedInAsLbl);
		
		userField = new JTextField();
		userField.setFont(new Font("Gill Sans MT", Font.PLAIN, 11));
		userField.setEditable(false);
		userField.setBounds(259, 39, 119, 20);
		add(userField);
		userField.setColumns(10);
		
		logOutBtn = new JButton("Log Out");
		logOutBtn.setFont(new Font("Gill Sans MT", Font.BOLD, 14));
		logOutBtn.setBounds(259, 69, 89, 23);
		add(logOutBtn);
		
		menuBtn = new JButton("Menu");
		menuBtn.setFont(new Font("Gill Sans MT", Font.BOLD, 14));
		menuBtn.setBounds(351, 69, 89, 23);
		add(menuBtn);
		
		infoArea = new JTextArea();
		infoArea.setEditable(false);
		infoArea.setBounds(30, 117, 222, 145);
		add(infoArea);
		
		moreInfoBtn = new JButton("More Info");
		moreInfoBtn.setFont(new Font("Gill Sans MT", Font.BOLD, 14));
		moreInfoBtn.setBounds(277, 118, 112, 23);
		add(moreInfoBtn);

	}
	
	public void addActionListener(ActionListener a){
		logOutBtn.addActionListener(a);
		menuBtn.addActionListener(a);
		moreInfoBtn.addActionListener(a);
	}
	
	public JButton getLogOutBtn(){
		return logOutBtn;
	}
	
	public JButton getMenuBtn(){
		return menuBtn;
	}
	
	public JButton getMoreInfoBtn(){
		return moreInfoBtn;
	}

}
