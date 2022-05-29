package exercicio1;

public class Triangulo {
	
	public double whidth;
	public double height;
	
	public double calcArea() {
		double result = (whidth * height) / 2;
		return result; 
	}
	
	public double calcPerimeter() {
		double result = whidth + height + height;
		return result;
	}
	
	public double calcDiagonal() {
		double result = whidth * 3 * (whidth * 3 - 3) / 2;
		return result;
	}
}
