package com.revature.e.Arrays;

import java.util.Arrays;

public class CarDriver {

	public static void main(String[] args) {

		Nissan[] likedCars = new Nissan[6];
		
		likedCars[0] = new Nissan("rty345", "red", "coupe", 2015, 50000, false, "GTR-35", "nismo", 4, true);
		likedCars[1] = new Nissan("rty345", "blue", "coupe", 2019, 0000, true, "GTR-35", "nismo", 4, true);
		likedCars[2] = new Nissan("rty345", "black", "coupe", 1959, 50000, false, "fairlady", "na", 4, true);
		likedCars[3] = new Nissan("rty345", "orange", "coupe", 2015, 10000, false, "350z", "technology", 4, true);
		likedCars[4] = new Nissan("rty345", "red", "coupe", 2015, 50000, false, "GTR-35", "nismo", 4, true);	
		//likedCars[5] = new Nissan(5,true);
		
		System.out.println(Arrays.toString(likedCars));
	
		
		
	}

}
