package com.revature.d.objects;

public class Ball {
	public String color;
	public double weight;
	public String material;
	public double radius;

	public Ball() {
		super();
		// TODO Auto-generated constructor stub
	}

	// we can have multiple constructor but their parameters list must be different
	public Ball(String color, double weight, String material, double radius) {
		// the this keyword will reference the current instance
		this.color = color;
		this.weight = weight;
		this.material = material;
		this.radius = radius;
	}

	public String toString() {
		return "Ball [ color = " + color + ", weight = " + weight + ", material = " + material + " ,radius = " + radius
				+ "]";
	}

	public String getColor() {
		return color;
	}

}
