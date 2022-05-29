package aul001;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" "); // vect recebe oque o usuario digitar seprado por espaço
			int position = sc.nextInt();
		
			System.out.println(vect[position]); // imprime a posição do vetor que o usuario digitar 
		}
		catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("Invalid position!"); // posição digita é inválida
		}
		catch (InputMismatchException error) {
			System.out.println("Input error");
		}
		System.out.println("End of program!");
		
		
		sc.close();

	}

}
