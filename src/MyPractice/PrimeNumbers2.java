package MyPractice;

public class PrimeNumbers2 {

	public static void main(String[] args) {
		// Write a Java program to compute the sum of prime numbers between 0 to 100

		int sum = 1;
		int counter = 0;
		int number = 0;
		
		while (counter < 100) {
			number++;
			if(number % 2 != 0) {
				if (is_Prime(number)) {
					sum += number;
				}
			}
					counter++;
		}
		System.out.println("The sum of the prime numbers from 0 to 100 is: " +sum);
	}

	public static boolean is_Prime(int number) {
		for(int i = 3; i * i <= number; i+=2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
