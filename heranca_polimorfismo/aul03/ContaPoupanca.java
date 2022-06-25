package aul03;

public class ContaPoupanca extends Conta {
	
	private Double taxaDeJuros;

	public ContaPoupanca(Integer numberoDaConta, String titular, Double saldo, Double taxaDeJuros) {
		super(numberoDaConta, titular, saldo);
		this.taxaDeJuros = taxaDeJuros;
	}

	public Double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public void setTaxaDeJuros(Double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	public void updateSaldo() {
		saldo += saldo * taxaDeJuros; 
	}
	
	@Override 
	public void saque(double quantia) {
		saldo -= quantia;
	}
}
