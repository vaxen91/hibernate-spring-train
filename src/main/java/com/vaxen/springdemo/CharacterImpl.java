package com.vaxen.springdemo;

public class CharacterImpl implements Character {
	
	private FantasyClass classType;
	private String name;
	private int age;
	
	public CharacterImpl(FantasyClass classType, String charName) {
		this.classType = classType;
		this.name = charName;
		System.out.println("Dentro il costruttore");
	}
	
	public void testInit(){
		System.out.println("Dentro init method");
	}
	
	public void testDestroy(){
		System.out.println("Dentro destroy method");
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public FantasyClass getClassType() {
		return classType;
	}

	public void setClassType(FantasyClass classType) {
		this.classType = classType;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override 
	public String toString(){
		return ("Hello, i'm "+name+" and "+classType.presentation()+ " and I'm "+this.age+" years Old");
	}

}
