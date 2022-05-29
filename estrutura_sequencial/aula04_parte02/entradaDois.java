package aula04_parte02;

import java.util.Scanner;

public class entradaDois {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		
		/*nextLine LER A LINHA TODA! até a quebra de linha*/
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		/* 
		 * BUFFER DE LEITURA
		 
		 * PROBLEMA
		 se usar comando de leitura diferente do nextLine() e 
		 dá alguma quebra de linha, ela fica "pendente" na entradaDois padrão
		 
		 * SOLUÇÃO
		 fazer um novo nextLine() após a quebra de linha,
		 para consumir a quebra de linha geradora de erro
		 */
		
		System.out.println(x); /*Gerando quebra de linha pedente*/
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}
}