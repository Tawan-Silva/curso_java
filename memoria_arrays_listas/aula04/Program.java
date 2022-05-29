package aula04;

public class Program {
	public static void main(String[] args) {

		// int tipo primitivo não aceita valor null
		int x = 20;

		// Wrapper Classes
		Integer obj = x;

		System.out.println(obj);

		// Casting
		// int y = (int) obj;
		
		int y = obj;
		System.out.println(y);

	}
}
