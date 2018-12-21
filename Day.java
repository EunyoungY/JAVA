package Joon.java;
import java.util.Scanner;

public class Day {
	public static String calculate(int y) {
		String day ="";
		switch(y%7){
		case 0: day ="MON";
			break; 
		case 1: day ="TUE";
			break;
		case 2: day ="WED";
			break;
		case 3: day ="THU";
			break;
		case 4: day ="FRI";
			break;
		case 5: day ="SAT";
			break;
		case 6: day ="SUN";
			break;
		}
		return day;
	}
	
	public static void main(String[] args) {
		int x,y;
		int[] monthday= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		int daysum=0;
		String dayoftheweek ="";

		System.out.println("2019년 1월 1일은 화요일이다. 그렇다면 x월 y일은 무슨 요일일까?");
		System.out.println("x(1≤x≤12)범위의 x를 입력하세요.");
		Scanner keyboard = new Scanner(System.in);
		x = keyboard.nextInt();
		System.out.println("y(1≤x≤31)범위의 y를 입력하세요.");
		Scanner keyboard2 = new Scanner(System.in);
		y = keyboard2.nextInt();

		daysum += y;
		for(int i=1; i<=x; i++) {
			daysum += monthday[i-1];
		}
		
		System.out.println(calculate(daysum));
		
		
		
		 

	}
}



