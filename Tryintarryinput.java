package Joon.java;
import java.util.Scanner;
public class Tryintarryinput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] data= new int[5];

		System.out.println("input integers" );
		for (int i=0; i <data.length; i++){
			int input = sc.nextInt();
			data[i]= input;
		}
	
		for (int i=0; i < data.length; i++) {
			System.out.print(data[i]);
		}
	}
}
