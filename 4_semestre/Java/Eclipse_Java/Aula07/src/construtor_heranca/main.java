package construtor_heranca;

public class main {

	public static void main(String[] args) {
		// Cria o objeto da classe Associados
		
		//Cria com o construtor sem parametros. (Fica tudo vazio)
		Pessoa pess1 = new Pessoa();
		pess1.MostrarDados();
		
		Pessoa pess2 = new Pessoa(001, "Ulisses", "Benedito", "531", "123456789", 
				"Cumbica", "Guarulhos", "SP", "11 94319 1827", "963.214.785-91");
		pess2.MostrarDados();
		
		Associado pess3 = new Associado();
		pess3.MostrarDados();

	}

}
