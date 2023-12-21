package com.springcore.javaconfig;

public class Teacher {

	private Samosa samosa;

	public Teacher(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public void teacherMethod() {
		this.samosa.samosaPrice();
		System.out.println("Inside Teacher Class....");

	}

}
