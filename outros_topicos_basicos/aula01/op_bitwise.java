package aula01;

import java.util.Scanner;

public class op_bitwise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = 89;
		int n2 = 60;
		
		int mask = 32;
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("O 6 bit é verdadeiro");
		}
		else {
			System.out.println("O 6 bit é falso");
		}
		sc.close();
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		
	}
}
