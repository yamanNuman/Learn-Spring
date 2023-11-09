package com.in28minutes.learnspringframework;

//import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.GameRunner;
//import com.in28minutes.learnspringframework.game.SuperContraGame;
import com.in28minutes.learnspringframework.game.PacmanGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		//var marioGame = new MarioGame();
		//var superContraGame = new SuperContraGame();
		var pacmanGame = new PacmanGame(); // 1: Creating Object for PacmanGame
		var gameRunner = new GameRunner(pacmanGame); // 2: Creating Object for GameRunner + Wiring of Dependencies
		//Game is a Dependency of GameRunner
		gameRunner.run();
	}
}
