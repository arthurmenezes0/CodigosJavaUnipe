
import java.util.Scanner;

public class Condicoes {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um numero para ser testado");
		int z = leitor.nextInt();
		
		if (z == 10) {
			System.out.println("z e igual a 10 :)");
		}
		
		else {
			System.out.println("z nao e igual a 10");
		}
		System.out.println("e isso é enrolação");
		leitor.close();	
	}
}
