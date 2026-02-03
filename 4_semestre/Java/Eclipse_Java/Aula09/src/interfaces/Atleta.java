package interfaces;
					//implements é usado para falar que usa a interface especificada
public class Atleta implements Contrato{
				//Diferente de heranças de classe
	private String nome, categoria;
	
	private void setNome(String _nome) { this.nome = _nome; }
	private void setCat(String _cat) { this.categoria = _cat; }
	
	private String getNome() { return this.nome; }
	private String getCat() { return this.categoria; }
	
	public Atleta() {
		this.setNome("");
		this.setCat("");
	}
	public Atleta(String _nome, String _cat) {
		this.setNome(_nome);
		this.setCat(_cat);
	}
	
	@Override
	public void Regra01() {
		System.out.println("O atleta nao pode andar de moto");
	}
	
	@Override
	public void Regra02() {
		System.out.println("O atleta nao pode chapar o coco");
	}
}
