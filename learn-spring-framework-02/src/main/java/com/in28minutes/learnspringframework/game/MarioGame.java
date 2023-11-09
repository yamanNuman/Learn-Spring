package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole{

	@Override
	public void upButton() {
		System.out.println("Up");
		
	}

	@Override
	public void downButton() {
		System.out.println("Down");
		
	}

	@Override
	public void leftButton() {
		System.out.println("Back");
		
	}

	@Override
	public void rightButton() {
		System.out.println("Go");
		
	}

	
}
