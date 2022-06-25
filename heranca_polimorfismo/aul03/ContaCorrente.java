package aul03;

public class ContaCorrente extends Conta {

	private Double limiteCartaoDeCredito;
	
	public ContaCorrente(Integer numeroDaConta, String titular, Double saldo, Double limiteCartaoDeCredito) {
		super(numeroDaConta, titular, saldo);
		this.limiteCartaoDeCredito = limiteCartaoDeCredito;
	}

	public double getCartaoDeCredito() {
		return limiteCartaoDeCredito;
	}

	public String compraEfetuada(double valorCompra) {
		if(!(this.limiteCartaoDeCredito - valorCompra < 0)) {
			return "Compra efetuada com sucesso! valor da compra? " + valorCompra + " limite do cartao: " + this.limiteCartaoDeCredito;
			
		}
		
		return "Sua compra foi recusada, valor da compra: " + valorCompra + " limite do cartao: " + this.limiteCartaoDeCredito;
	}
	
	public void aumentarLimite() {
		if(!(this.limiteCartaoDeCredito >= 400)) {
			this.limiteCartaoDeCredito += 50;
			System.out.println("Seu limite aumentou !!, e agora é de " + this.limiteCartaoDeCredito);
		} 
		else {
			System.out.println("No momento não podemos aumentar seu limite, continue usando seu cartão :)");
		}
	}
}
