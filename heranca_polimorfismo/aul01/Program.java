package aul01;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Tawan", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Cátia", 0.0, 500.0);
		
		// UPCASTING
		// Fazer um objeto se passar por um objeto que seja um supertipo dele
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Roseli", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Silva", 0.0, 0.01);
		
		
		// DOWNCASTING
		//  Objeto se passa como se fosse um subtipo dele
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		
		
		// Se Account for do tipo BusinessAccount
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		// DOWNCASTING
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		
		Account acc6 = new Account(1005, "Taw", 1000.0);
		System.out.println("Saldo da conta: " + acc6.getBalance()); // verifica valor da conta antes da operação
		acc6.withdraw(200.0); // operação de saque + taxa no valor de 5.0
		System.out.println("Saldo da conta após o saque: " + acc6.getBalance()); // verifica valor da conta
		
		// UPCASTING
		Account acc7 = new SavingsAccount(1006, "Sr. Tawan", 1000.0, 0.01);
		System.out.println("Saldo da conta: " + acc7.getBalance());
		acc7.withdraw(200.0); // operação de saque sem taxa
		System.out.println("Saldo da conta após o saque: " + acc7.getBalance());
		
		
		Account acc8 = new SavingsAccount(1007, "Srta. Cátia", 1000.0, 500.0);
		System.out.println("Saldo da conta: " + acc8.getBalance());
		acc8.withdraw(200.0); // operação de saque + taxa no valor de 2.0
		System.out.println("Saldo da conta após o saque: " + acc8.getBalance());
	}

}
