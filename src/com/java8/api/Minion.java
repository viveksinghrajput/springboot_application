package com.java8.api;

public class Minion {
	
	private String favouriteFruit;
	
	private int numberOfEyes;
	
	private String name;
	

	public Minion() {
	}


	public Minion(String favouriteFruit, int numberOfEyes, String name) {
		super();
		this.favouriteFruit = favouriteFruit;
		this.numberOfEyes = numberOfEyes;
		this.name = name;
	}

	public String getFavouriteFruit() {
		return favouriteFruit;
	}

	public void setFavouriteFruit(String favouriteFruit) {
		this.favouriteFruit = favouriteFruit;
	}

	public int getNumberOfEyes() {
		return numberOfEyes;
	}

	public void setNumberOfEyes(int numberOfEyes) {
		this.numberOfEyes = numberOfEyes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
