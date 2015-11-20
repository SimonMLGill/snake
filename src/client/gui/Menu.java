package client.gui;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;


public class Menu extends JPanel {
	private JTextField userField;
	private JButton newGameBtn;
	private JButton highscoresBtn;
	private JButton aboutBtn;
	private JLabel snakeLbl;
	private JLabel loggedInAsLbl;
	private JButton logOutBtn;
	
	/**
	 * Create the panel.
	 */
	public Menu() {
		setBackground(new Color(255, 255, 224));
		setLayout(null);
		
		newGameBtn = new JButton("New Game");
		newGameBtn.setFont(new Font("Gill Sans MT", Font.BOLD, 14));
		newGameBtn.setBounds(33, 127, 112, 81);
		add(newGameBtn);
		
		highscoresBtn = new JButton("Highscores");
		highscoresBtn.setFont(new Font("Gill Sans MT", Font.BOLD, 14));
		highscoresBtn.setBounds(167, 127, 112, 81);
		add(highscoresBtn);
		
		aboutBtn = new JButton("About");
		aboutBtn.setFont(new Font("Gill Sans MT", Font.BOLD, 14));
		aboutBtn.setBounds(308, 127, 113, 81);
		add(aboutBtn);
		
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

	}
	
	public void addActionListener(ActionListener m){
		newGameBtn.addActionListener(m);
		highscoresBtn.addActionListener(m);
		aboutBtn.addActionListener(m);
		logOutBtn.addActionListener(m);
	}
	
	public JButton getNewGameBtn(){
		return newGameBtn;
	}
	
	public JButton getHighscoresBtn(){
		return highscoresBtn;
	}
	
	public JButton getAboutBtn(){
		return aboutBtn;
	}
	
	public JButton getLogOutBtn(){
		return logOutBtn;
	}

}
