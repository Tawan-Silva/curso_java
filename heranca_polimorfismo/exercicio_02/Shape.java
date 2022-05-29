package exercicio_02;

// se a classe possuir algum método abstrado, ela se tornara classe abstrata
public abstract class Shape {
	private Color color;
	
	public Shape() {
		
	}
	// Construtor
	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	// métidi abstrato
	public abstract double area();
	
}
