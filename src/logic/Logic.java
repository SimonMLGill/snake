package logic;

import gui.SnakeScreen;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class Logic {

	private SnakeScreen snakeScreen;
	
	public Logic(){
		snakeScreen = new SnakeScreen();
		snakeScreen.setVisible(true);
	}
	
	public void run(){
		
		snakeScreen.getLogin().addActionListener(new LoginActionListener());
		snakeScreen.getMenu().addActionListener(new MenuActionListener());
		snakeScreen.getNewGame().addActionListener(new NewGameActionListener());
//		snakeScreen.getHighscores().addActionListener(new HighscoresActionListener());
//		snakeScreen.getAbout().addActionListener(new AboutActionListener());
		
		snakeScreen.show(snakeScreen.Login);
	}
	
	public class LoginActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e){
			if (e.getSource() == snakeScreen.getLogin().getLoginBtn()){
				snakeScreen.show(snakeScreen.Menu);
			}
		}
	}
	
	public class MenuActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == snakeScreen.getMenu().getNewGameBtn()){
				snakeScreen.show(snakeScreen.NewGame);
			}else if(e.getSource() == snakeScreen.getMenu().getHighscoresBtn()){
				snakeScreen.show(snakeScreen.Highscores);
			}else if(e.getSource() == snakeScreen.getMenu().getAboutBtn()){
				snakeScreen.show(snakeScreen.About);
			}else if(e.getSource() == snakeScreen.getMenu().getLogOutBtn()){
				snakeScreen.show(snakeScreen.Login);
			}
		}
	}
	
	public class NewGameActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == snakeScreen.getNewGame().getMoveBtn()){
				snakeScreen.getNewGame().getMoveField();
				snakeScreen.getNewGame().setLogArea(snakeScreen.getNewGame().getMoveField());
			}else if(e.getSource() == snakeScreen.getNewGame().getLogBtn()){
				snakeScreen.getNewGame().setLogAreaVisible(true);
			}else if(e.getSource() == snakeScreen.getNewGame().getLogBtn()){
				snakeScreen.getNewGame().setLogAreaVisible(false);
			}
			
		}
	}
}
