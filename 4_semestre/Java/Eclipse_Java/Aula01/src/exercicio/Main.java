package exercicio;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		//numeros 1.80, 1.20 etc sao reconhecidos como double por padrao
		pessoa1.altura = (float) 1.80; //(float) converte o double para float.
		pessoa1.peso = (float) 73.700;
		
		pessoa1.nome = "Ulisses Gostosao";
		pessoa1.idade = 19;
		pessoa1.sexo = "Muito";
		
		pessoa1.apresentar();
		pessoa1.imc();
		

	}

}
