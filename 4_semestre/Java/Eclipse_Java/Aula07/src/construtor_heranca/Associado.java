package construtor_heranca;

public class Associado extends Pessoa {
	protected boolean ativo;
	protected int num_asso;
	
	public boolean getAtivo() { return this.ativo; }
	public int getNumAsso() { return this.num_asso; }
	
	public void setAtivo(boolean _ativo) { this.ativo = _ativo; }
	public void setNumAsso(int _num) { this.num_asso = _num; }
	
	public Associado() {
		super(); //Chama o construtor da classe pai
		//Tem sempre que ser o primeiro
		this.setAtivo(false);
		this.setNumAsso(0);
	}
	
	public Associado(int _id, String _nome, String _logra, String _num,
			String _cep, String _bairro, String _cidade,
			String _uf, String _tel, String _doc, boolean ativo, int num_asso) {
		super(_id, _nome, _logra, _num, _cep, _bairro, _cidade, _uf, _tel, _doc);
	}
	//super vai representar a classe pai em todo contexto
	public void MostrarDados() {
		super.MostrarDados();
		System.out.println("---Info Associado---");
		System.out.println("Ativo: " + this.ativo);
		System.out.println("Num associado: " + this.num_asso);
	}
	
}
