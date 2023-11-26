package com.ymn.example01;

public class PlayerRunner {
	
	private PlayerService playerService;
	
	//Dependency Injection
	public PlayerRunner(PlayerService playerService) {
		this.playerService = playerService;
	}
	
	public void score() {
		playerService.score();
		System.out.println(playerService.toString());
	}
	
	public void assist() {
		playerService.assist();
		System.out.println(playerService.toString());
	}

}
