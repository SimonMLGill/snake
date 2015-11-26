package client.logic;

import client.gui.SnakeScreen;
import client.sdk.*;
import com.mysql.fabric.Server;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Logic {

	private SnakeScreen snakeScreen;
	private SdkLogic sdkLogic;
	private ServerConnection serverConnection;
	
	public Logic(){
		snakeScreen = new SnakeScreen();
		snakeScreen.setVisible(true);

		serverConnection = new ServerConnection();

		sdkLogic = new SdkLogic();

	}
	
	public void run(){
		
		snakeScreen.getLogin().addActionListener(new LoginActionListener());
		snakeScreen.getMenu().addActionListener(new MenuActionListener());
		snakeScreen.getNewGame().addActionListener(new NewGameActionListener());
		snakeScreen.getHighscores().addActionListener(new HighscoresActionListener());
		snakeScreen.getAbout().addActionListener(new AboutActionListener());
		
		snakeScreen.show(snakeScreen.Login);

		//serverConnection.get("api/");
		//serverConnection.get("api/games/open/");


	}

	public void RickRoll(String url){
		try{
			java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
		}catch(java.io.IOException r){
			System.out.print("error");
		}
	}

	public class LoginActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e){
			if (e.getSource() == snakeScreen.getLogin().getLoginBtn()){

				sdkLogic.login(snakeScreen.getLogin().getUsernameField(), snakeScreen.getLogin().getPasswordField());
				
				snakeScreen.getMenu().setUserField(snakeScreen.getLogin().getUsernameField());
				snakeScreen.getNewGame().setUserField(snakeScreen.getLogin().getUsernameField());
				snakeScreen.getHighscores().setUserField(snakeScreen.getLogin().getUsernameField());
				snakeScreen.getAbout().setUserField(snakeScreen.getLogin().getUsernameField());
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
				snakeScreen.getNewGame().setUserField("");
				String name = JOptionPane.showInputDialog(snakeScreen, "Please enter the name of the game: ",
						"Game name", JOptionPane.QUESTION_MESSAGE);
				//sdkLogic.createGame();
				snakeScreen.getNewGame().getOpponentTbl().setModel(sdkLogic.getAllUsers());

			}else if(e.getSource() == snakeScreen.getNewGame().getShowLogRdbtn()){
				snakeScreen.getNewGame().getHideLogRdbtn().setSelected(false);
				snakeScreen.getNewGame().getShowLogRdbtn().setSelected(true);
				snakeScreen.getNewGame().getLogArea().setVisible(true);
			} else if(e.getSource() == snakeScreen.getNewGame().getHideLogRdbtn()){
				snakeScreen.getNewGame().getShowLogRdbtn().setSelected(true);
				snakeScreen.getNewGame().getHideLogRdbtn().setSelected(false);
				snakeScreen.getNewGame().getLogArea().setVisible(false);
			}else if(e.getSource() == snakeScreen.getNewGame().getMenuBtn()){
				snakeScreen.show(snakeScreen.Menu);
			}else if(e.getSource() == snakeScreen.getNewGame().getLogOutBtn()){
				snakeScreen.show(snakeScreen.Login);
			}
			
		}
	}

	public class HighscoresActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == snakeScreen.getHighscores().getLogOutBtn()){
				snakeScreen.show(SnakeScreen.Login);
			}else if(e.getSource() == snakeScreen.getHighscores().getMenuBtn()){
				snakeScreen.show(snakeScreen.Menu);
			}
		}
	}

	public class AboutActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e){
			if (e.getSource() == snakeScreen.getAbout().getMoreInfoBtn()){
				RickRoll("https://www.youtube.com/watch?v=BROWqjuTM0g");
			}else if(e.getSource() == snakeScreen.getAbout().getLogOutBtn()){
				snakeScreen.show(snakeScreen.Login);
			}else if(e.getSource() == snakeScreen.getAbout().getMenuBtn()){
				snakeScreen.show(snakeScreen.Menu);
			}
		}
	}
}
