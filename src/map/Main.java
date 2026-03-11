package map;
import javax.swing.JFrame;
import map.MenuScreen;

public class Main {
	
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Pokemon Game");
	MenuScreen menu = new MenuScreen();

	}
	public void GameStage() {
		JFrame window = new JFrame();
	     window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GamePanel gamePanel = new GamePanel();
		window.add(gamePanel);
		
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		gamePanel.startGameThread();
	}
}

