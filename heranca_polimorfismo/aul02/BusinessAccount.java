package aul02;

public class BusinessAccount extends Account {
	
	private Double loanLimit; // Limite de emprestimo
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	// Emprestimo
	public void loan(double amount) {
		if (amount <= loanLimit) { // valor do emprestimo é <= ao limite de emprestimo
			balance += amount + 10.0;			
		}
	}
	
	@Override // Garante uma sobrescrita de método
	public void withdraw(double amount) {
		super.withdraw(amount); // efetua saque normal
		balance -= 2.0; // desconta 2.0 no saque kkk
	}
	
}
