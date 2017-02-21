import java.util.Scanner;

public class ConsumoMedio {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite a distância percorrida (em Km): ");
		float dist = leitor.nextFloat();

		System.out.println("Digite o total de combustivel gasto (em Litros): ");
		float comb = leitor.nextFloat();

		System.out.println("A média de gasto de combustivel é: " + (dist/comb) + " Km/L.");
		leitor.close();

	}
}