package de.gwvs.euler.aufgabe3;

import de.gwvs.euler.utils.CalcUtils;

public class Aufgabe3 {

	public static void main(String[] args) {
	
		long largestPrim = 1;
		
		long number = 600851475143L;
		
		long ceiling = number;
		
		for(int i = 2;i<=ceiling;i++) {
			if(number % i == 0 && CalcUtils.isPrime(i)) {
				largestPrim = i;
				ceiling = ceiling / i;
			}
		}
		
		System.out.println(largestPrim);
		
	}
	
}
