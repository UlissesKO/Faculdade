package construtor_heranca;

public class main {

	public static void main(String[] args) {
		// Cria o objeto da classe Associados
		
		//Cria com o construtor sem parametros. (Fica tudo vazio)
		Associados asso1 = new Associados();
		asso1.MostrarDados();
		
		Associados asso2 = new Associados(001, "Ulisses", "Benedito", "531", "123456789", 
				"Cumbica", "Guarulhos", "SP", "11 94319 1827", "963.214.785-91");
		asso2.MostrarDados();

	}

}
