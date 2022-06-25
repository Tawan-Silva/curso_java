package aul03;

public class Conta {
	
	private Integer numeroDaConta; 
	private String titular; 
	protected Double saldo;
	
	public Conta(Integer numeroDaConta, String titular, Double saldo) {
		this.numeroDaConta = numeroDaConta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Integer getnumeroDaConta() {
		return numeroDaConta;
	}

	public void setnumeroDaConta(Integer numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public String getTitular() {
		return titular;
	}

	public void seTtitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void saque(double quantia) {
		saldo -= quantia + 5.0; 
	}
	

	public void deposito(double quantia) {
		saldo += quantia;
	}
	

}
