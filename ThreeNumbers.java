package Joon.java;
import java.util.Scanner;
/*�� ���� A, B, C�� �־�����. �̶�, �� ��°�� ū ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
�Է�: ù° �ٿ� �� ���� A, B, C�� �������� ���еǾ� �־�����. (1 �� A, B, C �� 100)
���: �� ��°�� ū ������ ����Ѵ�.*/ 


public class ThreeNumbers {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int[] data = new int[3];
		int input=0;
		int max=0, second=0;

		do {
			System.out.println("Input three numbers (1 �� A, B, C �� 100)");
			for(int i=0; i<3; i++) {
				input = kb.nextInt();
				data[i] = input;
			}
		} while(data[0]<1 || data[0]>100 ||data[1]<1 || data[1]>100 ||data[2]<1 || data[2]>100);
		
		for(int i=0; i<3; i++) {
			if(data[i]>max)  
				max=data[i];
		}
		for(int i=0; i<3; i++) {
			if(data[i]<max && data[i]>second) 
				second=data[i];			
		}
		System.out.println("max = " + max);
		System.out.println("second = " + second);
	}
}
