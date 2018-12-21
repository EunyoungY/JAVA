package Joon.java;

public class Star {
	public static void Star1() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void Star2() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void Star3() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=6-i ; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	public static void Star4() {
		for(int i=1; i<=5; i++) {
			for(int j=0; j<i; j++){
				System.out.print(" ");
			}
			for(int k=1; k<=6-i; k++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		Star1();
		Star2();
		Star3();
		Star4();
	}


 


 
}
