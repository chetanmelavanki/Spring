package com.xworkz.train;

import org.springframework.stereotype.Component;

@Component
public class Train {
	
	public Train() {
		System.out.println(this.getClass().getSimpleName()+" bean created");
	}
}
