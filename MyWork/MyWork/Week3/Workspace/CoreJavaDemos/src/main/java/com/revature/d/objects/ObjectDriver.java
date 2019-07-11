package com.revature.d.objects;

public class ObjectDriver {
public static void  main (String[] args){
	
	
	Ball tennis = new Ball();
	tennis.color = "green";
	tennis.material = "rubber/felt";
	tennis.radius = 2.5;
	tennis.weight = 1;
	
	
	Ball football = new Ball();
	football.color = "brown";
	football.material = "rubber";
	football.radius = 3;
	football.weight = 5;
	
	Ball soccer = new Ball("white and black", 50, "leather", 8);
	
	System.out.println(tennis);
	System.out.println(football);
	System.out.println(soccer);
	
	Dog d = new Dog("spike",true,"pit","short","medium");
	System.out.println(d);
	
}
	
}
