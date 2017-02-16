import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Cachorro cachorro = new Cachorro();
		
		System.out.println("Informe o nome do cachorro: ");
		cachorro.nome = leitor.nextLine();
		cachorro.late();
		leitor.close();
		
		Carro ferrari = new Carro();
		ferrari.retroceder();
		ferrari.avançar();
		
		Carro fusca = new Carro();
		fusca.abastecer();
		fusca.parar();
	}
}
