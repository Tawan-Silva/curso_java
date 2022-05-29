package aul002;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		method1();
		
		System.out.println("End of program!");
		
	}
	
	public static void method1() {
		System.out.println("**METHOD1 START**");
		method2();
		System.out.println("**METHOD1 END**");
	}
	
	public static void method2() {
		System.out.println("**METHOD2 START**");
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" "); // vect recebe oque o usuario digitar seprado por espaço
			int position = sc.nextInt();
		
			System.out.println(vect[position]); // imprime a posição do vetor que o usuario digitar 
		}
		catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("Invalid position!"); // posição digita é inválida
			error.printStackTrace(); // imprime o rastreamento do stack
			sc.next();
		}
		catch (InputMismatchException error) {
			System.out.println("Input error");
		}
		System.out.println("**METHOD2 END**");
		sc.close();
	}
}
