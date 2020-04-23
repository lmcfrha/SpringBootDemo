package com.example.demo.model;

public class User {
	String first=null;
	String name=null;
	
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(String Id, String Name) {
    	this.first = Id;
    	this.name = Name;
    }

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}
    
    
}
