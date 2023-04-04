package number;

import java.util.Random;

import number.RandomNumber;

public class RandomNumber {
	
	 public int getNumber()
	 {
		 return randomNumber;
	 }
	 
	 public static RandomNumber generateRandomNumber()
	    {
	        if (instance == null) {
	            instance = new RandomNumber();
	        }
	        return instance;
	    }
	
	private RandomNumber()
	{
		 randomNumber = random.nextInt(1000);
	}
	
	private int randomNumber;
	private static Random random = new Random();
	private static RandomNumber instance = null;
}
