/**
 * 
 */
package assignments;

public class assignment1 {

	public static void main(String[] args) {
		System.out.println("Hello world!");

		variable();
		sumxyz();
		array1();
		array2();
		array3();

	}

	public static void variable() {
		int x = 5;

		System.out.println(x);

	}

	public static void sumxyz() {
		int x = 15;
		int y = 10;
		int z = x + y;

		System.out.println(z);
	}

	public static void array1() {
		int numbers[] = new int[5];

		System.out.println(numbers.length);

	}

	public static void array2() {
		int numbers[] = new int[10];
		numbers[0] = 1;
		numbers[1] = 1;
		numbers[2] = 1;
		numbers[3] = 1;
		numbers[4] = 1;
		numbers[5] = 1;
		numbers[6] = 1;
		numbers[7] = 1;
		numbers[8] = 1;
		numbers[9] = 1;

		System.out.println(numbers[1]);
	}

	public static void array3() {
		double numbers[] = new double[2];
		numbers[0] = 10.5;
		numbers[1] = 11.5;

		double sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println(sum);
	}
	
	

}
