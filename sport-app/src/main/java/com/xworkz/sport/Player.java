package com.xworkz.sport;

public class Player {
	private String playerName;
	private int playersNum;
	double playerWeight;
	Coach coach;
	public Player() {
		System.out.println(this.getClass().getSimpleName() + " bean is created");
	}
	public String getPlayerName() {
		return playerName;
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Player(Coach coach) {
		this.coach = coach;
		System.out.println(this.getClass().getSimpleName() + " bean is created");

	}
	
	
}
