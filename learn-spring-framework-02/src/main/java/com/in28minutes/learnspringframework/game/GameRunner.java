package com.in28minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {


	private GamingConsole game;
	
	//Constructor Injection
	@Autowired
	public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole game) {
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
