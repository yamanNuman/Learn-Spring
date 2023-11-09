package com.in28minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole{

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
		System.out.println("Shoot");
		
	}

	
}
