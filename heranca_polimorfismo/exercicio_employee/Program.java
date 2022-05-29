package exercicio_employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Lista de empregados inicializada vazia
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data: ");
			System.out.print("Outsourced (y/n)? "); // funcionario tercerizado ?
			char ch = sc.next().charAt(0);
			
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Hours: ");
			int hours = sc.nextInt();
			
			System.out.println("Value per hours: ");
			double valuePerHour = sc.nextDouble();
			
			if (ch == 'y') { // se o funcionario for tercerizado
				System.out.print("Additional charge: ");
				double addtionalCharge = sc.nextDouble();
				Employee emp = new OutsourceEmployee(
						name, 
						hours, 
						valuePerHour, 
						addtionalCharge);
				
				list.add(emp); // push do funcionario na lista de empregados
			}
			else { // se o funcionario não for tercerizado
				Employee emp = new Employee(name, hours, valuePerHour);
				
				list.add(emp); // push do funcionario na lista de empregados
			}
			
			System.out.println();
			System.out.println("PAYMENTS:");
			for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));	
			}
			
		}
		
		
		sc.close();
		
	}
}
