package classeAbstrata;

//Transforma a classe em abstrata (Sem objeto)
public abstract class Funcionario {
	protected int idade;
	protected String nome, setor;
	
	private void setIdade(int _idade) { this.idade = _idade; }
	private void setNome(String _nome) { this.nome = _nome; }
	private void setSetor(String _setor) { this.setor = _setor; }
	public int getIdade() { return this.idade; }
	public String getNome() { return this.nome; }
	public String getSetor() { return this.setor; }
	
	//Construtoras
	public Funcionario() {
		this.setIdade(0);
		this.setNome("");
		this.setSetor("");
	} //Isso é sobrecarga (Duas classes construtoras diferenciando pelos parametros)
	public Funcionario(int _idade, String _nome, String _setor) {
		this.setIdade(_idade);
		this.setNome(_nome);
		this.setSetor(_setor);
	}
	
	public abstract int calcSalario(); //Vai ser implementado na classe filha
		
}
