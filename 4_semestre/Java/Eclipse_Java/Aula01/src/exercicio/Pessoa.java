package exercicio;

public class Pessoa {
	float peso, altura;
	int idade;
	String nome, sexo;
	
	void apresentar() {
		System.out.println("Olá, eu sou o " + this.nome + " e tenho " + this.idade + " anos");
	}
	void imc () {
		System.out.println("IMC = " + this.peso / (this.altura * this.altura));
	}
}
