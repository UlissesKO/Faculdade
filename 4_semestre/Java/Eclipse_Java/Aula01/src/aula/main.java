package aula;

public class main {
//Tem que ser criado com o public static void para ser reconhecido como um exe
	public static void main(String[] args) {
		// Sintaxe criacao de objetos:
		//Nome_Classe Nome_Objeto = new Nome_Construtor(); (Nome_Construtor é o mesmo nome da classe
		
		Veiculos cincao = new Veiculos();
		
		//Seta os atributos da classe
		cincao.placa = "OVO-6969";
		cincao.anoFabric = 2001;
		cincao.cor = "Vermelho";
		cincao.marca = "Fiat";
		cincao.modelo = "Marea";
		
		cincao.acelerar();
		cincao.freiar();
	}

}
