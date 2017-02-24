package de.gwvs.euler.aufgabe6;

public class Aufgabe6 {

	public static void main(String[] args) {
		
		int ceiling = 100;
		
		int sumOfSquares = 0;
		int squareOfSums = 0;
		
		for(int i = 1;i<=ceiling;i++) {
			sumOfSquares += i*i;
			squareOfSums += i;
		}
		
		squareOfSums = squareOfSums*squareOfSums;
		
		int ergebnis = squareOfSums - sumOfSquares;
		
		System.out.println(ergebnis);
	}
	
}
