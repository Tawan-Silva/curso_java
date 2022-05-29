package aula04;

public class condicional_ternaria {
	public static void main(String[] args) {
		
		double preco = 34.5;
		double desconto;
		
		// resolução com if else
		if(preco < 50) {
			desconto = preco * 0.1;
			System.out.println("Desconto com if else " + desconto);
		}
		else {
			desconto = preco * 0.05;
		}
		
		double preco2 = 34.5;
		double desconto2 = (preco < 50) ? preco2 * 0.1 : preco2 * 0.05;
		System.out.println("Desconto com if ternario " + desconto2);
	}
}