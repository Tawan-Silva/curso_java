package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x;
		x = new Triangulo();
		x = new Triangulo();
		
		System.out.println("Enter rectangle width and height");
		x.whidth = sc.nextDouble();
		x.height = sc.nextDouble();
		
		double area = x.calcArea();
		double perimeter = x.calcPerimeter();
		double diagonal = x.calcDiagonal();
		
		System.out.printf("AREA =  %.2f%n", area);
		System.out.printf("PERIMETER = %.2f%n", perimeter);
		System.out.printf("DIAGONAL = %.2f%n", diagonal);
		
		sc.close();
	}
}
