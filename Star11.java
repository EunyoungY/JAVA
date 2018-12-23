package Joon.java;
/*문제: 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
입력: 첫째 줄에 N이 주어진다. N은 항상 3×2의k승 수이다. 
(3, 6, 12, 24, 48, ...) (k ≤ 10)
출력: 첫째 줄부터 N번째 줄까지 별을 출력한다.*/
import java.util.Scanner;

public class Star11 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int star=0, blank=0;

		System.out.println("Input N (N=3*2^k)");
		int n = kb.nextInt(); 
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			System.out.println("*");			
		}
	}
}
