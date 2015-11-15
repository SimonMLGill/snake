package gui;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;


public class SnakeScreen extends JFrame {
	public static final String Login = "login";
	public static final String Menu = "menu";
	public static final String Highscores = "highscores";
	public static final String NewGame = "newGame";
	public static final String About = "about";
	private JPanel contentPane;
	public Login login;
	public Menu menu;
	public Highscores highscores;
	public NewGame newGame;
	public About about;
	private CardLayout c;
	/**
	 * Launch the application.
	 */
	
	
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					SnakeScreen frame = new SnakeScreen();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public SnakeScreen() {
		setTitle("No Snake Eyes");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new CardLayout(0, 0));
		setContentPane(contentPane);
		
		login = new Login();
		contentPane.add(login, Login);
		
		menu = new Menu();
		contentPane.add(menu, Menu);
		
		highscores = new Highscores();
		contentPane.add(highscores, Highscores);
		
		newGame = new NewGame();
		contentPane.add(newGame, NewGame);
		
		about = new About();
		contentPane.add(about, About);
		
		c = (CardLayout) getContentPane().getLayout();
	}
	
	public Login getLogin(){
		return login;
	}
	
	public Menu getMenu(){
		return menu;
	}
	
	public Highscores getHighscores(){
		return highscores;
	}
	
	public NewGame getNewGame(){
		return newGame;
	}
	
	public About getAbout(){
		return about;
	}
	
	public void show(String card){
		c.show(this.getContentPane(), card);
	}

}
