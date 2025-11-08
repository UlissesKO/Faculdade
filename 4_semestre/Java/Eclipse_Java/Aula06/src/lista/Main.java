//Atividade
//1 - A lista de produtos deve ter os atributos Nome, Preço e Quantidade.
//2 -  Ao consultar os produtos na lista, mostrar o nome, o preço e a quantidade, ao término da lista colocar o valor total (quantidade * preço).


package lista;
import java.util.Scanner;
import java.util.List; //Importa as funções de lista
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		//Variavel para a opção escolhida do menu
		int opc = 0;
		
		// criando o objeto da classe Scanner para entrada de dados
		Scanner entrada = new Scanner(System.in);
		
		// Cria o OBJETO lista. Listas são tratadas como objetos em java
		List<Produtos> listaProdutos = new ArrayList<>();
		//List<Produtos> vai gerar uma lista que só vai aceitar objetos do tipo Produtos. (List são só as instruções básicas)
		//ArrayList<>() Está criando uma nova instancia da classe ArrayList (Implementa uma lista de fato)
		
		while ( opc != 3) {
			System.out.println("\n\n==== Escolha uma das opções a seguir ====");
			System.out.println("[1] - Adicionar produto na lista");
			System.out.println("[2] - Consultar a lista");
			System.out.println("[3] - Finalizar o programa");
			System.out.print("Opção selecionada : ");
			opc = entrada.nextInt();
			if (opc == 1) {
				System.out.print("Digite o nome do produto: ");
				String nome = entrada.next();
				
				System.out.print("Digite o preço do produto: ");
				float preco = entrada.nextFloat();
				
				System.out.print("Digite a quantidade do produto: ");
				int quant = entrada.nextInt();
				
				//Cria um objeto Produtos, pois a lista só aceita esse tipo de objeto
				Produtos prod = new Produtos();
				prod.setNome(nome);
				prod.setPreco(preco);
				prod.setQuant(quant);
				
				//.add() - Adiciona o objeto do tipo Produtos na lista
				listaProdutos.add(prod);
				System.out.println("\n Produto inserido na lista com sucesso!");
				
			}else if(opc == 2) {
				if (listaProdutos.isEmpty()) { //.isEmpty() em um objeto lista verifica se está vazia
					System.out.println("\n A lista está vazia");
				} else {
				
					System.out.println("\n Lista de Produtos");
					//Variavel para o calculo do preço total do carrinho
					float precoTotal = 0; //Precisa ter um valor setado antes de fazer operação
					
					//Está fazendo um for normal na lista. Passando de um em um
					//Está criando um objeto novo para o item que será iterado na lista.
					for (Produtos produto: listaProdutos) {
						float total = produto.getPreco() * produto.getQuant();
						
						System.out.println("Produto : " + produto.getNome()
								+ " -  Preço : " + produto.getPreco()
								+ " -  Total produto : " + total);
						
						precoTotal += total;
					}
					System.out.println("============\nValor total: " + precoTotal);
				}			
				
			}else if (opc == 3) {
				System.out.println("\n\nFim do programa!");
				entrada.close();
			}else {
				System.out.println("\n\nOpção selecionada inválida, cabaço!");
			}
		}
	}
}
