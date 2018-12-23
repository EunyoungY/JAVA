package Joon.java;
/*0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 
 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 
 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 
26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.*/
import java.util.Scanner;

public class PlusCycle {
	public static void main(String[] args) {
		int input=1;
		int newnum=0;
		int a=0, b=0, c=0;
		int n=1;
		do {
			System.out.println("(0<=N<=99) 다음 범위의 N을 입력하세요");
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();
		} while(input<0 || input>100);
		
		while(input!=newnum) {
			if(n==1) {
				a=input/10;
				b=input%10;
				c=(a+b)%10;
				newnum=b*10+c%10;
			} 
			a=newnum/10;
			b=newnum%10;
			c=(a+b)%10;
			newnum=b*10+c%10;
			n++;	
						System.out.print("a: "+a + " b: " + b + " c:" +c);
			System.out.println(" newnum: " + newnum);
			if(n>=100 ) break;
		}
		System.out.println("N의 사이클은" + n + "입니다.");	
	}
}
