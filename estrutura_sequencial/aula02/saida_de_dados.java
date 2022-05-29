package aula02;


public class saida_de_dados {
	public static void main(String[] args) {
		/*
		 * %f = ponto futuante
		 * %d = inteiro
		 * %s = texto
		 * %n = quebra de linha
		 */
		/*
			
			double x = 10.5555;
			String nome = "Tawan";
			int idade = 20;
			double salario = 5000;
			
			System.out.printf("%.2f%n", x);
			System.out.printf("%.4f%n", x);
			Locale.setDefault(Locale.US);
			System.out.printf("%.4f%n", x);
			System.out.printf("%.4f%n", x);
			System.out.println("Resultado = " + x + " METROS");
			System.out.printf("Resultado = %.2f metros%n", x);
			System.out.printf("%s tem %d anos e ganha R$ %2.f reais%n", nome, idade, salario);
		*/
		
			String product1 = "Computer";
			String product2 = "Office desk";
			
			int age = 30;
			int code = 5290;
			char gender = 'F';
			
			double price1 = 2100.0;
			double price2 = 650.50;
			double measure = 53.234567;
			
			System.out.println("Products:");
			System.out.printf("%s, which price is $ %f", product1, price1);
			System.out.printf("%s, which price is $ %f", product2, price2);
			System.out.printf("Record: %d years old, code %d and gender: %f", age, code, gender);
			System.out.printf("Measue which eight decimal places: %d", measure);
			System.out.printf("Measue (three decimal places): %.%f", measure);
			System.out.printf("US decimal point: %.%f", measure);
	}
}
