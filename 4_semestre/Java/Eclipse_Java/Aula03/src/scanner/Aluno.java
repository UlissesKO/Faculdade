package scanner;

public class Aluno {
	int RA;
	String nome, disciplina;
	float notaProv, notaEx, media;
	
	// SETTERS - Setam um valor para a variável
	void setRa(int _ra) { //_ é uma prática do professor para diferenciar o input da variável em si
		this.RA = _ra; //Seta a variável nome dentro da função
	}
	void setNome(String _nome) {
		this.nome = _nome;
	}
	void setDisciplina(String _dis) {
		this.disciplina = _dis;
	}
	void setProv(float _prov) {
		this.notaProv = _prov;
	}
	 void setEx(float _ex) {
		 this.notaEx = _ex;
	 }
	 void setMedia(float _med) {
		 this.media = _med;
	 }
	 
	 //GETTERS - Pega o valor de uma variável
	 int getRa() {
		 return this.RA;
	 }
	 String getNome() {
		 return this.nome;
	 }
	 String getDisciplina() {
		 return this.disciplina;
	 }
	 float getProv() {
		 return this.notaProv;
	 }
	 float getEx() {
		 return this.notaEx;
	 }
	 
	 
	 float  CalculaMedia() {
		 float ex, prov, media = 0; //Declara as variaveis da função
		 ex = this.getEx(); //Busca o valor e guarda na variavel
		 prov = this.getProv();
		 media = (ex * 4 + prov * 5) / 10;
		 
		 return media;
	 }
	 
	 void MostraDados() {
		 System.out.println("RA : " + this.getRa());
		 System.out.println("Nome: " + this.getNome());
		 System.out.println("Disciplina: " + this.getDisciplina());
		 System.out.println("Media geral: " + this.CalculaMedia());
		 if (this.CalculaMedia() >= 6) {
			 System.out.println("Parabéns, seu arrombado. Passou");
		 } else {
			 System.out.println("Burro filho de uma puta. Reprovou");
		 }
	 }
}
