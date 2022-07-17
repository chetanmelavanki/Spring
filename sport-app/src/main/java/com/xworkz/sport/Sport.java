package com.xworkz.sport;

public class Sport {
	private Byte noOfPlayers;
	private String sportsName;
	String type;
	Team team;

	public Sport() {
		System.out.println(this.getClass().getSimpleName() + " bean is created");
	}

	public Byte getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(Byte noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	
	public String getSportsName() {
		return sportsName;
	}
	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}

	public Sport(Team team) {
		this.team = team;
		System.out.println(this.getClass().getSimpleName() + " bean is created");

	}
	
}
