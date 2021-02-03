import java.security.SecureRandom;

public class RollDie {
	
	public static void main(String[] args) {
		
		//create SecureRandom object to produce a secure random number
		SecureRandom randomNumbers = new SecureRandom();
		
		//initialize int variables to hold the number of times each random number is generated
		int frequency1 = 0;
		int frequency2 = 0;
		int frequency3 = 0;
		int frequency4 = 0;
		int frequency5 = 0;
		int frequency6 = 0;
		
		//roll the dice 6,000,000 times
		for(int roll = 1; roll <= 6000000; roll++)
		{
			//assign "face" to a number from 1-6
			int face = 1 + randomNumbers.nextInt(6);
			
			//use face value 1-6 to determine which counter to increment
			switch(face)
			{
				case 1:
					++frequency1;
					break;
				case 2:
					++frequency2;
					break;
				case 3:
					++frequency3;
					break;
				case 4:
					++frequency4;
					break;
				case 5:
					++frequency5;
					break;
				case 6:
					++frequency6;
					break;
			}
			
		}
		
		System.out.println("Face\tFrequency"); //display header
		System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",
				frequency1, frequency2, frequency3, frequency4, frequency5, frequency6);
		
	}

}
