package com.springcore.auto.wire;


public class Emp {
	
	private String name;
	
	private Address address;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", address=" + address + "]";
	} 

}
