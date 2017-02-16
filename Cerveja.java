

import java.util.Scanner;

public class Cerveja {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite quantas cervejas tem na freezer: ");
		int cerveja = leitor.nextInt();
		
		while (cerveja > 0) {
			System.out.println(cerveja + " cervejas na freezer.");
			System.out.println("Pego uma cerveja e passo para frente");
			cerveja = cerveja - 1;
			System.out.println("Agora são " + cerveja + " cervejas");
		}
		if (cerveja == 0) {
			System.out.println("A cerveja acabou, vá comprar mais!");
			leitor.close();
		}
	}
}
