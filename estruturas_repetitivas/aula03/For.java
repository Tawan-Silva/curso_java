package aula03;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int soma = 0;
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			System.out.println("Valor de i: " + i);
			soma += x;
		}
		System.out.println(soma);
		sc.close();
	}
}