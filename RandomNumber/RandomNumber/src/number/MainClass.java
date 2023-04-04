package number;

import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		RandomNumber x = RandomNumber.generateRandomNumber();
		RandomNumber y = RandomNumber.generateRandomNumber();
		
		System.out.println("First number generated using RandomNumber class: " + x.getNumber());
		System.out.println("Second number generated using RandomNumber class: " + y.getNumber());
		
		Random rand = new Random();
		int z = rand.nextInt(1000);
		System.out.println("Number generated without using RandomNumber class: " + z);
		
		

	}

}
