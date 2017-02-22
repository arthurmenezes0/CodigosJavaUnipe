import java.util.Scanner;

public class ProdutoDao {
	
	static Scanner leitor = new Scanner(System.in);

	static Produto produtos = new Produto();

	/**
	 * 
	 * Esse m�todo realiza o cadastro dos produtos
	 * 
	 */

	public static void cadastrar(Produto produtos) {

		System.out.print("Qual o ID do produto: ");
		produtos.Ids = leitor.nextInt();

		System.out.print("Qual o NOME do produto: ");
		produtos.Nomes = leitor.nextLine();

		System.out.println("Qual a MARCA do produto: ");
		produtos.Marcas = leitor.nextLine();

		System.out.print("Qual o TIPO do produto: ");
		produtos.Tipos = leitor.nextLine();

		System.out.print("Qual a DESCRI��O do produto: ");
		produtos.Descri��es = leitor.nextLine();

	}

	/**
	 * 
	 * Esse m�todo realiza a atualiza��o dos produtos
	 * 
	 */

	public static void atualizar(Produto produtos) {

		int x = 0;
		System.out.println("1 - ID");
		System.out.println("2 - NOME");
		System.out.println("3 - MARCA");
		System.out.println("4 - TIPO");
		System.out.println("5 - DESCRI��O");
		System.out.print("Escolha a op��o: ");
		x = leitor.nextInt();

		switch (x) {
		case 1:
			System.out.print("Qual o ID do produto: ");
			produtos.Ids = leitor.nextInt();
			break;

		case 2:
			System.out.print("Qual o NOME do produto: ");
			produtos.Nomes = leitor.nextLine();
			break;

		case 3:
			System.out.println("Qual a MARCA do produto: ");
			produtos.Marcas = leitor.nextLine();
			break;

		case 4:
			System.out.print("Qual o TIPO do produto: ");
			produtos.Tipos = leitor.nextLine();
			break;

		case 5:
			System.out.print("Qual a DESCRI��O do produto: ");
			produtos.Descri��es = leitor.nextLine();
			break;

		default:

			System.out.println("Esta n�o � uma op��o v�lida!");

		}

	}

	/**
	 * 
	 * Esse m�todo printa os produtos na tela
	 * 
	 */

	public static void listar(Produto produtos) {

		System.out.println("Os produtos cadastrados s�o: ");
		System.out.println("Nome:  " + produtos.Nomes);
		System.out.println("Id:  " + produtos.Ids);
		System.out.println("Marca:  " + produtos.Marcas);
		System.out.println("Tipo:  " + produtos.Marcas);
		System.out.println("Descri��o:  " + produtos.Descri��es);
	}

	public static int main(String[] args) {

		int controle = 9;

		while (controle != 0) {

			System.out.println("1 - Adicionar produtos");
			System.out.println("2 - Atualizar produtos");
			System.out.println("3 - Listar produtos");
			System.out.println("0 - Sair");
			System.out.print("Escolha a op��o: ");
			controle = leitor.nextInt();

			if (controle == 1) {
				cadastrar(produtos);
			} 
			else if (controle == 2) {
				atualizar(produtos);
			} 
			else if (controle == 3) {
				listar(produtos);
			}
			else if (controle == 0) {
				break;
			} 
			else {
				System.out.println("Esta n�o � uma op��o v�lida!");
			}
		}
		return 0;
	}
}