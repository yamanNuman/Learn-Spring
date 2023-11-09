package com.in28minutes.learnspringframework.game;

public class GameRunner {

	//private MarioGame game;
	//private SuperContraGame game;
	private GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Running Game : " + game);
		game.upButton();
		game.downButton();
		game.leftButton();
		game.rightButton();
	}
}
