package aula05;

public class escopo_e_inicializacao {
	public static void main(String[] args) {

		/*
		 * Enquanto a variável não for inicializada, vai gerar erro e outras variáveis
		 * que recebe seu valor também irá gerar erros
		 */

		double price = 400.00;
		double discount;

		if (price < 200) {
			// se esse bloco de codigo for false a variável não se inicializada
			discount = price * 0.1;
		}
		else {
			// se esse bloco foi acessado, a variável será incilizada aqui
			discount = 0;
		}
		/*
		 * Essa espressão irar gerar erro, pós a variável está fora do escopo de alcance
		 
		 * System.out.println(discount);
		 * 
		 */
	}
}