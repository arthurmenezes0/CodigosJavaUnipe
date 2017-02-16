package br.unipe.java.unidade1;

import java.util.Scanner;

public class Cerveja {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite quantas cervejas tem na freezer: ");
		int cerva = leitor.nextInt();
		while (cerva > 0) {
			System.out.println(cerva + " cervejas na freezer.");
			System.out.println("Pego uma cerveja e passo para frente");
			cerva = cerva - 1;
			System.out.println("Agora são " + cerva + " cervejas");
		}
		if (cerva == 0) {
			System.out.println("A cerveja acabou, vá comprar mais!");
			leitor.close();
		}
	}
}
