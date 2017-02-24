package de.gwvs.euler.aufgabe4;

public class Aufgabe4 {

	public static void main(String[] args) {
		
		int largestPalindrom = 0;
		
		int max = 999;
		
		for(int i = 1;i<=max;i++) {
			for(int j = 1; j<=max;j++) {
				int product = i*j;
				if(isPalindrom(product)) {
					if(product > largestPalindrom) {
						largestPalindrom = product;
					}
				}
			}			
		}
		
		System.out.println(largestPalindrom);
		
	}
	
	private static boolean isPalindrom(int number) {
		
		String numberString = Integer.toString(number);
		
		for(int i = 0;i<numberString.length();i++) {
			if(numberString.charAt(i) != numberString.charAt(numberString.length()-1-i)) {
				return false;
			}
		}
		return true;
		
	}
	
}
