package aul03;

public class ContaCnpj extends Conta {
	
	private Double limiteDeEmprestimo; 
	

	public ContaCnpj(Integer numeroDaConta, String titular, Double saldo, Double limiteDeEmprestimo) {
		super(numeroDaConta, titular, limiteDeEmprestimo);
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}

	public Double getLimiteDeEmprestimo() {
		return limiteDeEmprestimo;
	}

	public void setLimiteDeEmprestimo(Double limiteDeEmprestimo) {
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}
	
	public void emprestimo(double quantia) {
		if (quantia <= limiteDeEmprestimo) {
			saldo += quantia + 10.0;			
		}
	}
	
	@Override 
	public void saque(double quantia) {
		super.saque(quantia); 
		saldo -= 2.0; 
	}
	
}
