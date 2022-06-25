package aul03;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Conta> listContas = new ArrayList<>(); 
		List<Conta> listContasCorrente = new ArrayList<>();
		
		listContas.add(new ContaPoupanca(1001, "Tawan", 1000.0, 0.1));
		listContas.add(new ContaCorrente(1003, "Catia", 1000.0, 500.0));
		listContas.add(new ContaCnpj(1004, "Rose", 2000.0, 500.0));
		listContas.add(new ContaPoupanca(1005, "Thially", 500.0, 500.0));
		listContas.add(new ContaCnpj(1006, "Samara", 500.0, 500.0));
		
		listContasCorrente.add(new ContaCorrente(1007, "Silva", 2000.0, 4200.0));
		listContasCorrente.add(new ContaCorrente(1008, "Souza", 100.0, 300.0));
		
		
		double sum = 0.0;
		for (Conta acc : listContas) {
			sum += acc.getSaldo();
		}
		
		System.out.printf("Saldo dos usuários em posse do banco: %.2f%n", sum);
		System.out.printf("----------------------------");
		
		double quantia = 10.0;
		for (Conta acc : listContas) {
			System.out.println("Cliente " + acc.getTitular() + ", seu saldo é de: " + acc.getSaldo());
			acc.deposito(quantia);
			quantia += 2 * 2 + 40 / 2;
			
			System.out.println("Efetuando deposito de " + "R$: " + quantia + " para o cliente: " + acc.getTitular() + ", Saldo atualizado " + acc.getSaldo());
			System.out.println("-----------------------------");
		}
		
		for (Conta acc : listContas) {
			System.out.printf("Saldo da conta atualizado %d: %.2f%n", acc.getnumeroDaConta(), acc.getSaldo());
			System.out.println("--------------------------");
		}
		
		for (Conta acc : listContasCorrente) {
			System.out.println(acc.getTitular() + " solicitou aumento no cartao de credito, resultado: ");
			((ContaCorrente) acc).aumentarLimite();
			System.out.println("-------------------------");
		}
		
		for (Conta acc : listContasCorrente) {
			System.out.println(acc.getTitular() + " efetuou uma compra, seu saldo era de: " + acc.getSaldo());
			System.out.println(((ContaCorrente) acc).compraEfetuada(200.0));
			System.out.println("-------------------------");
			System.out.println(acc.getTitular() + " solicitou aumento no cartao de credito, resultado: ");
			((ContaCorrente) acc).aumentarLimite();
		}
		
	}

}
