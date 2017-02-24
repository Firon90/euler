package de.gwvs.euler.utils;

public class CalcUtils {

	public static boolean isPrime(long number) {
		
		for(int i = 2;i<=Math.sqrt(number);i++) {
			if(number % i == 0) {
				return false;
			}
		}
		
		return true;
		
	}	
	
}
