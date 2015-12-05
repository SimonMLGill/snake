package client.gui;
import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class SnakeScreen extends JFrame {

	// screen class - effectively my JFrame
	// variables/JPanels to the JFrame

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
	 * Create the frame.
	 */

	// adding the JPanels to the JFrame

	public SnakeScreen() {
		setTitle("No Snake Eyes");
		setResizable(false);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 320);
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

	// getters to my JPanels

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

	// method that ensures that my CardLayout is in effect
	
	public void show(String card){
		c.show(this.getContentPane(), card);
	}

}
