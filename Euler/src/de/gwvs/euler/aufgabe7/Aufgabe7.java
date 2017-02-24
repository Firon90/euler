package de.gwvs.euler.aufgabe7;

import de.gwvs.euler.utils.CalcUtils;

public class Aufgabe7 {

	public static void main(String[] args) {
	
		int primeCount = 0;
		int searchedPrime = 10001;
		
		for(int i = 2;primeCount<searchedPrime;i++) {
			if(CalcUtils.isPrime(i)) {
				primeCount++;
				if(primeCount == searchedPrime) {
					System.out.println(i);
				}
			}
		}
		
	}	
	
}
