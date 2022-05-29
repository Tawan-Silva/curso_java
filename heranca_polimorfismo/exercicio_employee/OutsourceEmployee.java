package exercicio_employee;

public class OutsourceEmployee extends Employee {
	
	private double addtionalCharge;
	
	public void OutsourceEmployee() {
		
	}

	public OutsourceEmployee(String name, Integer hours, Double valuePerHour, double addtionalCharge) {
		super(name, hours, valuePerHour);
		this.addtionalCharge = addtionalCharge;
	}

	public double getAddtionalCharge() {
		return addtionalCharge;
	}

	public void setAddtionalCharge(double addtionalCharge) {
		this.addtionalCharge = addtionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + addtionalCharge * 1.1; // pagamento comum da super classe + add de 110%
	}
	
}
