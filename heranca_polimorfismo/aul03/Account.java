package aul03;

public class Account {
	
	private Integer number; // N° da conta
	private String holder; // Titular da conta
	protected Double balance; // Saldo inicial da conta
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	// Operação de saque
	public void withdraw(double amount) {
		balance -= amount + 5.0; // no ato do saque é cobrado taxa de 5.0 
	}
	
	// Operação de deposito
	public void deposit(double amount) {
		balance += amount;
	}
	

}
