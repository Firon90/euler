package de.gwvs.euler.aufgabe12;

public class Aufgabe12 {

	public static void main(String[] args) {
		
		int numberOfDivisors = 500;
		long triangleNumber = 0;
		long count = 1;
		boolean success = false;
		
		do {
			triangleNumber += count++;			
			if(getNumberOfDivisors(triangleNumber) >= numberOfDivisors) {
				success = true;
			}
			
		} while(!success);
		
		System.out.println(triangleNumber);
	}
	
	public static int getNumberOfDivisors(long number) {
		int count = 1; //1 ist immer Divisor
		long ceiling = number;
		
		for(int i = 2;i<ceiling;i++) {
			if(number % i == 0) {
				//ceiling /= i;
				count++;
			}
		}
		System.out.println(count);
		return count;
	}
	
}
