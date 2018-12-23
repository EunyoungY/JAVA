package Joon.java;

import java.util.Scanner;

public class Tenerror {
	public static void main(String[] args) {
		System.out.println("문자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
//		for(int i=1; i<=input.length(); i++) {  -->out of bounds
		for(int i=0; i<input.length(); i++) {
			if(i%3==0) {
				System.out.println();
			}
			System.out.print(input.charAt(i));
		}
		sc.close();
	}
}

