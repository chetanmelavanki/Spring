package com.xworkz.sport;

public class Coach {
	String name;

	public Coach(String name) {
		this.name = name;
		System.out.println(this.getClass().getSimpleName() + " bean is created");
		System.out.println(name);
	}
	
	
}
