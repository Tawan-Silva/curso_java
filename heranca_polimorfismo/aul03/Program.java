package aul03;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>(); 
		
		list.add(new SavingsAccount(1001, "Tawan", 1000.0, 0.1));
		list.add(new BusinessAccount(1003, "Catia", 1000.0, 500.0));
		list.add(new BusinessAccount(1004, "Rose", 2000.0, 500.0));
		list.add(new SavingsAccount(1005, "Thially", 500.0, 500.0));
		
		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for (Account acc : list) {
			acc.deposit(10.0);
		}
		
		for (Account acc : list) {
			System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}

}
