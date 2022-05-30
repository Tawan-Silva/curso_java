package aulinha05;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
			
				System.out.println("Enter a folder path: ");
				String strPath = sc.nextLine();
				
				File path = new File(strPath); // intancia um path apartir do que o usuario digitou
				
				File[] folders = path.listFiles(File::isDirectory); // captura somente pastas
				System.out.println("FOLDERS");
				
				for (File folder : folders) {
					System.out.println(folder);
				}
				
				File[] files = path.listFiles(File::isFile); // captura somente arquivos
				System.out.println("FILES");
				
				for (File file : files) {
					System.out.println(file); 
				}
				
				// Cria uma subpasta apartir do que o usuario digitar
				boolean success = new File(strPath + "\\subdir").mkdir(); 
				System.out.println("Directory created successfully: " + success);
				sc.close();

	}

}
