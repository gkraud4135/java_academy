package com.lec206.ex07_collect;

public class Student {
	
	public enum Gender {MALE, FEMALE}
	public enum City {SEOUL, BUSAN}
	
	private String name;
	private int score;
	private Gender gender;
	private City city;
	
	public Student(String name, int score, Gender gender) {
		super();
		this.name = name;
		this.score = score;
		this.gender = gender;
	}

	public Student(String name, int score, Gender gender, City city) {
		super();
		this.name = name;
		this.score = score;
		this.gender = gender;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public Gender getGender() {
		return gender;
	}

	public City getCity() {
		return city;
	}
}
