package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.sport.Coach;
import com.xworkz.sport.Player;
import com.xworkz.sport.Sport;

public class Tester {
	public static void main(String[] args) {
		context();

	}

	public static void context() {
		ApplicationContext applicationContext = null;
		try {
			applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
			
//			Coach coach1 = applicationContext.getBean(Coach.class);
//			System.out.println(coach1.hashCode());
//			
//			Coach coach2 = applicationContext.getBean(Coach.class);
//			System.out.println(coach2.hashCode());
//			
//			Coach coach3 = applicationContext.getBean(Coach.class);
//			System.out.println(coach3.hashCode());
//			System.out.println(applicationContext.hashCode());
//
//			Player player = applicationContext.getBean(Player.class);
//			System.out.println("Player Name :" + player.getPlayerName());
//
//			Sport sport = applicationContext.getBean(Sport.class);
//			System.out.println("No of players in sport :" + sport.getNoOfPlayers());
//
//			String string = applicationContext.getBean(String.class);
//			System.out.println("String Context :" + string);
//
//			Integer integer = applicationContext.getBean(Integer.class);
//			System.out.println("Integer Context :" + integer);
//
//			Boolean boolean1 = applicationContext.getBean(Boolean.class);
//			System.out.println("Boolean context :" + boolean1);
//
//			Float float1 = applicationContext.getBean(Float.class);
//			System.out.println("Float context :" + float1);
//
//			Double double1 = applicationContext.getBean(Double.class);
//			System.out.println("Double context :" + double1);
//
//			Character character = applicationContext.getBean(Character.class);
//			System.out.println("Character context :" + character);
//
//			Short short1 = applicationContext.getBean(Short.class);
//			System.out.println("Short context :" + short1);
//
//			Byte byte1 = applicationContext.getBean(Byte.class);
//			System.out.println("Byte context :" + byte1);
//
//			Long long1 = applicationContext.getBean(Long.class);
//			System.out.println("Long context :" + long1);
//
//			ArrayList arrayList = applicationContext.getBean(ArrayList.class);
//			System.out.println("ArrayList :" + arrayList);
//
//			LinkedList linkedList = applicationContext.getBean(LinkedList.class);
//			System.out.println("LinkedList:" + linkedList);
//
//			HashSet hashSet = applicationContext.getBean(HashSet.class);
//			System.out.println("Hashset :" + hashSet);
//
//			TreeSet set = applicationContext.getBean(TreeSet.class);
//			System.out.println("TreeSet :" + set);
//
//			HashMap hashMap = applicationContext.getBean(HashMap.class);
//			System.out.println("Hash map :"+hashMap);
			} finally {
			if (applicationContext != null) {
				ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) applicationContext;
				context.close();
				System.out.println("applicationContext is closed");
			} else {
				System.out.println("applicationContext is not closed");
			}
		}
	}
}
