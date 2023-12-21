package com.springcore.stereotype.springexpressionlanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("demo1")
public class Demo {

	@Value("#{5+9}")
	private int x;
	@Value("#{5+10+9}")
	private int y;
	@Value("#{T(java.lang.Math).sqrt(7)}")
	private double z;
	@Value("#{T(java.lang.Math).E}")
	private double e;
	@Value("#{ new java.lang.String('Dharmesh')}")
	private String name;
	@Value("#{8.99>7}")
	private boolean isGreatere;

	public boolean isGreatere() {
		return isGreatere;
	}

	public void setGreatere(boolean isGreatere) {
		this.isGreatere = isGreatere;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isGreatere=" + isGreatere
				+ "]";
	}

	public void sum(int x, int y) {
		int a = x + y;
		System.out.println(a);

	}

}
