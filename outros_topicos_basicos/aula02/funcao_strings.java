package aula02;

import java.util.Scanner;

public class funcao_strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String original = "tawan É um ÓTIMO marido     ";
		String textSplit = "Tawan Software Engineer?";
		
		String[] split = textSplit.split(" "); // Retorna um novo array recortado com base no parametro
		String min = original.toLowerCase(); //Retorna tudo em minúsculas
		String mai = original.toUpperCase(); //Retorna tudo em maiúsculas
		String trim = original.trim(); // Limpa espaços em branco
		String subtring = original.substring(2); // Gera nova string com base na index passado por parametro
		String subtringTwo = original.substring(2, 9); // Gera nova string com base na index passado por parametro
		String replace = original.replace('a', 'x'); // Troca o primeiro parametro pelo segundo
		int indexOf = original.indexOf("ta"); // Retorna a primeira index da ocorrencia do indexOf
		int lastIndexOf = original.lastIndexOf("an"); // Retorna a ultima index da ocorrencia do indexOf
		
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		System.out.println("Antes: " + original + "-");
		System.out.println("Depois com toLowerCase(): " + min + "-");
		System.out.println("Depois com toUpperCase(): " + mai + "-");
		System.out.println("Limpando espaços com tim(): " + trim + "-");
		System.out.println("Gerando nova String com substring(): " + subtring + "-");
		System.out.println("Gerando nova String com substring(): " + subtringTwo + "-");
		System.out.println("Troca o valor do primeiro parametro pelo segundo: " + replace + "-");
		System.out.println("Retornando primeira index da ocorrencia do indexOf(): " + indexOf + "-");
		System.out.println("Retornando ultima index da ocorrencia do indexOf(): " + lastIndexOf + "-");
	}
}