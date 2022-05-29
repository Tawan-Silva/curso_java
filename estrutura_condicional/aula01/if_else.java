package aula01;

import java.util.Scanner;

public class if_else {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = 5;
		int hora;
		
		
		System.out.println("Quantas horas ?");
		hora = sc.nextInt();
		
		/* 
		 Se a estrutura for vedadeira o 
		 bloco de código sera executado
		  */
		
		if (hora < 12) {
			System.out.println("Bom dia");
		} 
		else if (hora > 12) {
			System.out.println("Boa tarde");
		}
		else if (hora > 18){
			System.out.println("Boa noite");
		}
	}
}