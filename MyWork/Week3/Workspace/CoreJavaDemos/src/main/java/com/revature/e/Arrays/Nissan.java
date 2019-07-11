package com.revature.e.Arrays;

public class Nissan extends Cars{
	
	private String model;
	private String pakage;
	private int seats;
	private boolean autoStart;
	public Nissan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Nissan(String vIN, String color, String type, int year, int milage, boolean new1, String model,
			String pakage, int seats, boolean autoStart) {
		super(vIN, color, type, year, milage, new1);
		this.model = model;
		this.pakage = pakage;
		this.seats = seats;
		this.autoStart = autoStart;
	}
	
	
//	public Nissan(int seats, boolean autoStart) {
//		this.seats = seats;
//		this.autoStart = autoStart;
//	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPakage() {
		return pakage;
	}
	public void setPakage(String pakage) {
		this.pakage = pakage;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public boolean isAutoStart() {
		return autoStart;
	}
	public void setAutoStart(boolean autoStart) {
		this.autoStart = autoStart;
	}

	@Override
	public String toString() {
		return "Nissan [model=" + model + ", pakage=" + pakage + ", seats=" + seats + ", autoStart=" + autoStart
				+ ", getVIN()=" + getVIN() + ", getColor()=" + getColor() + ", getType()=" + getType() + ", getYear()="
				+ getYear() + ", getMilage()=" + getMilage() + ", isNew()=" + isNew() + "]";
	}

	

}
