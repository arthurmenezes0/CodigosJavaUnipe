
import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
  
		int x, y;
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o primeiro número : ");
		x = leitor.nextInt();
		System.out.println("Digite o segundo número : ");
		y = leitor.nextInt();
		
		System.out.println("A soma dos dois números é: " + (x+y));
	}
}
