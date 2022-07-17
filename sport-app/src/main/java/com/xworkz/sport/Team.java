package com.xworkz.sport;

public class Team {
	Player player;

	public Team(Player player) {
		this.player = player;
		System.out.println(this.getClass().getSimpleName() + " bean is created");

	}
	
	
}
