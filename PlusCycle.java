package Joon.java;
/*0���� ũ�ų� ����, 99���� �۰ų� ���� ������ �־��� �� ������ ���� ������ �� �� �ִ�. 
 ���� �־��� ���� 10���� �۴ٸ� �տ� 0�� �ٿ� �� �ڸ� ���� �����, �� �ڸ��� ���ڸ� ���Ѵ�. 
 �� ����, �־��� ���� ���� ������ �ڸ� ���� �տ��� ���� ���� ���� ������ �ڸ� ���� �̾� ���̸� ���ο� ���� ���� �� �ִ�. 
26���� �����Ѵ�. 2+6 = 8�̴�. ���ο� ���� 68�̴�. 6+8 = 14�̴�. ���ο� ���� 84�̴�. 8+4 = 12�̴�. ���ο� ���� 42�̴�. 4+2 = 6�̴�. ���ο� ���� 26�̴�.
���� ���� 4������ ���� ���� ���ƿ� �� �ִ�. ���� 26�� ����Ŭ�� ���̴� 4�̴�.N�� �־����� ��, N�� ����Ŭ�� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
import java.util.Scanner;

public class PlusCycle {
	public static void main(String[] args) {
		int input=1;
		int newnum=0;
		int a=0, b=0, c=0;
		int n=1;
		do {
			System.out.println("(0<=N<=99) ���� ������ N�� �Է��ϼ���");
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
		System.out.println("N�� ����Ŭ��" + n + "�Դϴ�.");	
	}
}
