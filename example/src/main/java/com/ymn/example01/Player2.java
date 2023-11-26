package com.ymn.example01;

public class Player2 implements PlayerService {

	private String name;
	private String team;
	private String position;
	
	public Player2(String name, String team, String position) {
		super();
		this.name = name;
		this.team = team;
		this.position = position;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	@Override
	public void score() {
		System.out.println("Player-2 Goal.");
		
	}

	@Override
	public void assist() {
		System.out.println("Player-2 Assist.");
		
	}

	@Override
	public String toString() {
		return "Player2 [name=" + name + ", team=" + team + ", position=" + position + "]";
	}
	
}
