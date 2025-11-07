package scanner;

import java.util.Scanner; //Biblioteca usada para inputs

public class Main {
	public static void main(String[] args) {
		//Foi criado um objeto da classe Scanner para captar os inputs
		Scanner input = new Scanner(System.in); //.in de input
		
		//Objeto que vai guardar todas as informações
		Aluno aluno1 = new Aluno();
		
		System.out.print("Digita a porra do seu RA: ");
		aluno1.setRa(input.nextInt());//nextInt() é a função do objeto Scanner que prepara uma variavel do tipo INT
		
		System.out.print("Digite a buceta do seu nome: ");
		aluno1.setNome(input.next());//next() o objeto prepara uma variavel do tipo STRING
		
		System.out.print("Digita a disciplina, filha da puta: ");
		aluno1.setDisciplina(input.next());
		
		System.out.print("Agora a nota do caralho do exercicio: ");
		aluno1.setEx(input.nextFloat());//nextFloat prepara uma variavel do tipo float
		
		System.out.print("Agora a nota da porra da prova: ");
		aluno1.setProv(input.nextFloat());
		
		aluno1.setMedia(aluno1.CalculaMedia());
		
		aluno1.MostraDados();
	}
}
