
public class Emprestimo {

	public String nomeUsuario;
	public int idade;
	public float valorEmprestimo;
	public float percentualJurosMes;
	public float mesesParaPagar;

	public void imprimir() {

		System.out.println("Nome: " + nomeUsuario);
		System.out.println("Idade: " + idade);
		System.out.println("Valor do empréstimo: " + valorEmprestimo);
		System.out.println("Percentual de juros por mês: " + percentualJurosMes);
		System.out.println("Quantidade de meses para pagar: " + mesesParaPagar);
	}

	public void calcularEmprestimo() {

		if (idade >= 18 && idade < 23) {
			valorEmprestimo += (valorEmprestimo / mesesParaPagar) * percentualJurosMes;
		}

		else if (idade > 23 && idade <= 33) {
			valorEmprestimo += (valorEmprestimo * 10) / 100;
		}
	}
}
