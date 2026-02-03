package classeAbstrata;

public class Lider extends Funcionario {
	protected int salBase;
	
	private void setSalBase(int _salbase) { this.salBase = _salbase; }	
	public int getSalBase() { return this.salBase; }
	
	public Lider() {
		super();		
		setSalBase(0);
	}
	public Lider(int _idade, String _nome, String _setor, int _salbase) {
		super(_idade, _nome, _setor);
		this.setSalBase(_salbase);
	}
	
	public void liderados() {
		
	}
	
	@Override //Sobrescreve a função da classe pai (Era vazia)
	public int calcSalario() {
		return getSalBase() * 4;
	}
}
