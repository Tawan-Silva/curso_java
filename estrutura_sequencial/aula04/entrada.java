package aula04;
import java.util.Locale;
import java.util.Scanner;

public class entrada {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String s;
		int i;
		float f;
		double d;
		char c;
		
		s = sc.next();/*LER UM DADO*/
		
		i = sc.nextInt(); /*LER UM DADO DO TIPO INTEIRO*/
		
		d = sc.nextDouble(); /*LER UM DADO DO TIPO DOUBLE*/
		
		System.out.println("Dados digitados: ");
		System.out.println(s);
		System.out.println(i);
		System.out.println(d);
		
		/*c = sc.next().charAt(0);*/ /*LER E RETORNA E RETORNA O INDEX ESP. NO CHARAT()*/
		
		/*f = sc.nextFloat();*/ /*LER UM DADO DO TIPO FLOAT*/
		
		/*System.out.printf("Você digitou: %.2f%n" + d);*/
		
		/* 
		System.out.println("Você digitou: " + s);
		System.out.println("Você digitou: " + i);
		System.out.println("Você digitou: " + d);
		*/
		sc.close();	
	}
	
}