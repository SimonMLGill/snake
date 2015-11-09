package gui;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;


public class NewGame extends JPanel {
	private JTextField moveField;
	private JTable opponentTbl;
	private JTextField userField;
	private JLabel snakeLbl;
	private JLabel opponentsLbl;
	private JLabel nextMovesLbl;
	private JButton moveBtn;
	private JTextArea logArea;
	private JButton logBtn;
	private JButton endGameBtn;
	private JLabel loggedInAsLbl;
	private JButton logOutBtn;
	private JButton menuBtn;
	

	/**
	 * Create the panel.
	 */
	public NewGame() {
		setBackground(new Color(255, 255, 224));
		setLayout(null);
		
		ImageIcon snake = new ImageIcon(this.getClass().getResource("animated-snake-image-0027.gif")); 
		snakeLbl = new JLabel("");
		snakeLbl.setIcon(snake);
		snakeLbl.setBounds(30, 11, 209, 81);
		add(snakeLbl);
		
		opponentsLbl = new JLabel("Opponents:");
		opponentsLbl.setFont(new Font("Gill Sans MT", Font.BOLD, 14));
		opponentsLbl.setBounds(30, 119, 94, 14);
		add(opponentsLbl);
		
		nextMovesLbl = new JLabel("Enter next moves:");
		nextMovesLbl.setFont(new Font("Gill Sans MT", Font.BOLD, 14));
		nextMovesLbl.setBounds(158, 120, 134, 14);
		add(nextMovesLbl);
		
		moveField = new JTextField();
		moveField.setFont(new Font("Gill Sans MT", Font.PLAIN, 11));
		moveField.setBounds(291, 117, 89, 20);
		add(moveField);
		moveField.setColumns(10);
		
		opponentTbl = new JTable();
		opponentTbl.setFont(new Font("Gill Sans MT", Font.PLAIN, 11));
		opponentTbl.setBounds(30, 144, 126, 96);
		add(opponentTbl);
		
		moveBtn = new JButton("Commit");
		moveBtn.setFont(new Font("Gill Sans MT", Font.BOLD, 14));
		moveBtn.setBounds(291, 145, 89, 23);
		add(moveBtn);
		
		logArea = new JTextArea();
		logArea.setEditable(false);
		logArea.setFont(new Font("Gill Sans MT", Font.PLAIN, 13));
		logArea.setBounds(179, 145, 94, 53);
		logArea.setVisible(false);
		add(logArea);
		
		logBtn = new JButton("Log");
		logBtn.setFont(new Font("Gill Sans MT", Font.BOLD, 14));
		logBtn.setBounds(179, 209, 89, 23);
		add(logBtn);
		
		endGameBtn = new JButton("End Game");
		endGameBtn.setFont(new Font("Gill Sans MT", Font.BOLD, 14));
		endGameBtn.setBounds(278, 209, 101, 23);
		add(endGameBtn);
		
		loggedInAsLbl = new JLabel("Logged in as:");
		loggedInAsLbl.setFont(new Font("Gill Sans MT", Font.BOLD, 14));
		loggedInAsLbl.setBounds(259, 11, 107, 17);
		add(loggedInAsLbl);
		
		userField = new JTextField();
		userField.setEditable(false);
		userField.setFont(new Font("Gill Sans MT", Font.PLAIN, 11));
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

	}
	
	public void addActionListener(ActionListener n){
		moveBtn.addActionListener(n);
		logBtn.addActionListener(n);
		endGameBtn.addActionListener(n);
		logOutBtn.addActionListener(n);
		menuBtn.addActionListener(n);
	}
	
	public JButton getMoveBtn(){
		return moveBtn;
	}
	
	public JButton getLogBtn(){
		return logBtn;
	}
	
	public JButton getEndGameBtn(){
		return endGameBtn;
	}
	
	public JButton getLogOutBtn(){
		return logOutBtn;
	}
	
	public JButton getMenuBtn(){
		return menuBtn;
	}
	
	public String getMoveField(){
		return moveField.getText();
	}
	
	public void setLogArea(String log){
		log = moveField.getText();
		logArea.setText(log);
	}
	public void setLogAreaVisible(boolean b){
		if(b == true){
		logArea.setVisible(b);
		}else if (b == false){
			logArea.setVisible(b);
		}
	}
	
}
