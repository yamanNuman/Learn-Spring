package com.in28minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole{

	@Override
	public void upButton() {
		System.out.println("Go");
	}

	@Override
	public void downButton() {
		System.out.println("Stop");
		
	}

	@Override
	public void leftButton() {
		System.out.println("Run");
		
	}

	@Override
	public void rightButton() {
		System.out.println("Eat");
		
	}

}
