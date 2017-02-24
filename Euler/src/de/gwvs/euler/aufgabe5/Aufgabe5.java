package de.gwvs.euler.aufgabe5;

public class Aufgabe5 {

	public static void main(String[] args) {
		
		int ergebnis = 20;
		boolean solved = false;
		
		while(!solved) {
			ergebnis++;
			boolean solution = true;
			for(int i = 2; i<=20;i++) {
				if(ergebnis % i != 0) {
					solution = false;
					break;
				}
			}
			if(solution) {
				solved = true;
			}
		}
		
			
		System.out.println(ergebnis);	
	}
	
}
