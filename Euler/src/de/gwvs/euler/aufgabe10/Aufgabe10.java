package de.gwvs.euler.aufgabe10;

import de.gwvs.euler.utils.CalcUtils;

public class Aufgabe10 {

	public static void main(String[] args) {
		
		int ceiling = 2000000;
		long sum = 0;
		
		for(int i = 2;i<ceiling;i++) {
			if(CalcUtils.isPrime(i)) {
				sum += i;
			}
		}
		
		System.out.println(sum);
	}
	
}
