package aul01;

public class SavingsAccount extends Account {
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	// Atualiza saldo da conta com base na taxa de juros
	public void updateBalance() {
		balance += balance * interestRate; 
	}
	
	@Override // Garante uma sobrescrita de método
	public void withdraw(double amount) {
		balance -= amount;
	}
}
