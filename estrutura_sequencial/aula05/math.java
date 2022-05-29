package aula05;

public class math {
	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		double delta, x1, x2;
		double a = 1;
		double b = 4;
		double c = -5;
		
		// Raiz quadrada
		A = Math.sqrt(x); 
		B = Math.sqrt(y); 
		C = Math.sqrt(25.0); 
		
		
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		// Potência - Base multiplicado pela pelo expoente
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		// Valor absoluto - Tirar o sinal de negativo caso exista
		A = Math.abs(y);
		B = Math.abs(z);
		
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
		delta = Math.pow(b, 2.0) - 4*a*c;
		x1 = (-b + Math.sqrt((delta)) / (2.0 * a));
		x2 = (-b - Math.sqrt((delta)) / (2.0 * a));
		
		System.out.println(delta);
		System.out.println(x1);
		System.out.println(x2);
		
	}
}