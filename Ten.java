package Joon.java;

import java.util.Scanner;

public class Ten {
	
	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		for(int i=0; i<input.length(); i++) {
			if(i%3==0) {
				System.out.println();
			}
			System.out.print(input.charAt(i));
		}
		sc.close();
	}
	
}
