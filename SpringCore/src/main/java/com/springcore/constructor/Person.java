package com.springcore.constructor;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certi  certification;
	private List<String> phoneList;

	public Person(String name, int personId, Certi  certification,  List<String> phoneList) {
		super();
		this.name = name;
		this.personId = personId;
		this.certification  =  certification;
		this.phoneList  = phoneList;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", certification=" + certification + ", phoneList="
				+ phoneList + "]";
	}
}