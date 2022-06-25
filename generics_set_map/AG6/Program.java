package AG6;

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("Tawan", "tawan.tls@gmail.com");
		Client c2 = new Client("Tawan", "tawan@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode()); // compara o hash code de cada objeto
		System.out.println(c1.equals(c2)); // compara o conteúdo dos dados
		System.out.println(c1 == c2); // compara as referencias de memoria
	}

}
