package de.gwvs.euler.aufgabe1;

public class Aufgabe1 {
	
	public static void main(String[] args) {
		
		int ceiling = 1000;
		
		int sum = 0;
		
		for(int i = 1;i<ceiling;i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		
		System.out.println(sum);
		
	}

}
