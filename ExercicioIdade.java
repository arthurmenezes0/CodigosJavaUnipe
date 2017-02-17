
import java.util.Scanner;

public class ExercicioIdade {

	public static void main(String[] args) {
	
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = leitor.nextLine();

		System.out.println("Digite sua idade: ");
		int idade = leitor.nextInt();

		System.out.println("Digite o seu ano de nascimento: ");
		int nascimento = leitor.nextInt();

		System.out.println("Digite o ano atual: ");
		int atual = leitor.nextInt();
		
		System.out.println(nome + " tem " + idade + " anos.");

		System.out.println("Ele fará " + (atual - nascimento) + " anos em " + atual + ".");

	}

}