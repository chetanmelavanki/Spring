package com.xworkz.sport;
public class Db {
	String dbUrl;
	String dbName;
	String dbPw;
	public Db(String dbUrl, String dbName, String dbPw) {
		super();
		this.dbUrl = dbUrl;
		this.dbName = dbName;
		this.dbPw = dbPw;
		System.out.println("url = "+dbUrl+" | "+"dbname = "+dbName+" | "+"dbPW = "+dbPw);
	}
	
	
	
}
