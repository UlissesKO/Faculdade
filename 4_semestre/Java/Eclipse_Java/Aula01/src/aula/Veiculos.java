package aula;

public class Veiculos {
	String placa, cor, marca, modelo; 
	int anoFabric;
	
	//Void = Nenhum retorno da funcao
	void acelerar() {
		System.out.println("Acelera esse " + this.modelo + " Caraio!");
		//System = sistema vai escrever
		//out = Output
		//println = Print line next (Adiciona um \n no final)
	}
	
	void freiar() {
		System.out.println("Fudeu, freia essa porra!");
		System.out.println("Chegou a fotinha " + this.marca + this.modelo + this.placa + " Se fudeu otário");
	}
}
