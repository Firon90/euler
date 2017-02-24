package de.gwvs.euler.aufgabe9;

public class Aufgabe9 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		OUTER: for(a = 1;a<=1000;a++) {
			for(b = 1;b<=1000-a;b++) {
				c = 1000 - a - b;
				if(a*a+b*b==c*c) {
					System.out.println(a*b*c);
					break OUTER;
				}
			}
		}
		
	}
	
}
