package Joon.java;
/*����: ������ ���� ��Ģ�� ������ �ڿ� ���� ��� ������.
�Է�: ù° �ٿ� N�� �־�����. N�� �׻� 3��2��k�� ���̴�. 
(3, 6, 12, 24, 48, ...) (k �� 10)
���: ù° �ٺ��� N��° �ٱ��� ���� ����Ѵ�.*/
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
