package mywork;

import javax.swing.JFrame;

public class Main {
	
	public Main() {
		
		JFrame frame = new JFrame();
		GamePanel gamepanel = new GamePanel();
		frame.add(gamepanel);
		frame.pack();
		frame.setTitle("SnakeGame");
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Main();
	}

}
