package lista;

public class Produtos {
	private String nome;
	private float preco;
	private int quant;
	
	//getters
	public String getNome()	{return this.nome;}
	public float getPreco()	{return this.preco;}
	public int getQuant() {return this.quant;}
	
	//setters
	public void setNome(String _nome) {this.nome  = _nome;}
	public void setPreco(float _preco) {this.preco = _preco;}
	public void setQuant(int _quant) {this.quant = _quant;}
}
