package de.gwvs.euler.aufgabe2;

public class Aufgabe2 {

	public static void main(String[] args) {
		
		int ceiling = 4000000;
		
		int fib1 = 1;
		int fib2 = 2;
		
		int sum = 2;
		
		while(fib2 <= ceiling) {
			
			int newFib1 = fib2;
			int newFib2 = fib1 + fib2;
			
			if(newFib2 % 2 == 0) {
				sum += newFib2;
			}
			
			fib1 = newFib1;
			fib2 = newFib2;
			
		}
		
		System.out.println(sum);
		
	}
	
}
