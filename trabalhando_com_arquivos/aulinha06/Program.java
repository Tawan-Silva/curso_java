package aulinha06;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		// pega o nome do arquivo e descarta o caminho
		System.out.println("getName: " + path.getName()); 
		
		// pega o caminho do arquivo e descarta o nome
		System.out.println("getParent: " + path.getParent()); 
		
		// pega todo o caminho do arquivo 
		System.out.println("getPath: " + path.getPath());
		
		sc.close();                                

	}

}
