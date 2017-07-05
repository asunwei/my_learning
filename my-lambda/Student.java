package com.learn.java;

public class Student {
	int enlishScope;
	String name;
	

	public Student(int enlishScope, String name) {
		super();
		this.enlishScope = enlishScope;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnlishScope() {
		return enlishScope;
	}

	public void setEnlishScope(int enlishScope) {
		this.enlishScope = enlishScope;
	}
	
}
