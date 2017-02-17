
import java.util.Scanner;

public class ExercicioMedia {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite sua primeira nota: ");

		float nota1 = leitor.nextFloat();

		System.out.println("Digite sua segunda nota: ");

		float nota2 = leitor.nextFloat();

		System.out.println("Digite sua terceira nota: ");

		float nota3 = leitor.nextFloat();

		float media = ((nota1 + nota2 + nota3) / 3);

		if (media >= 7) {

			System.out.println("Você foi aprovado. Sua média é: " + media);

		}

		else if (media >= 5) {

			System.out.println("Você foi para recuperação. Sua média é: " + media);

		}

		else {

			System.out.println("Você foi reprovado. Sua média é: " + media);

		}

	}

}