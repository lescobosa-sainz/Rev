package com.revature.e.Arrays;

public class Cars {

	private String VIN;
	private String color;
	private String type;
	private int year;
	private int milage;
	private boolean New;
	
	public Cars() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cars(String vIN, String color, String type, int year, int milage, boolean new1) {
		super();
		VIN = vIN;
		this.color = color;
		this.type = type;
		this.year = year;
		this.milage = milage;
		New = new1;
	}
	
	public String getVIN() {
		return VIN;
	}
	public void setVIN(String vIN) {
		VIN = vIN;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	public boolean isNew() {
		return New;
	}
	public void setNew(boolean new1) {
		New = new1;
	}
	
	@Override
	public String toString() {
		return "Cars [VIN=" + VIN + ", color=" + color + ", type=" + type + ", year=" + year + ", milage=" + milage
				+ ", New=" + New + "]";
	}
	
	
	
	
}
