package construtor_heranca;

public class Associados {
	//Perguntar se não seria protected
	private int id;
	private String nome, logradouro, numero, cep, bairro, cidade, uf, telefone, cpf_cnpj;

	public int getId() { return this.id; }
	public String getNome() { return this.nome; }
	public String getLogra() { return this.logradouro; }
	public String getNum() { return this.numero; }
	public String getCep() { return this.cep; }
	public String getBairro() { return this.bairro; }
	public String getCidade() { return this.cidade; }
	public String getUf() { return this.uf; }
	public String getTel() { return this.telefone; }
	public String getCpfCnpj() { return this.cpf_cnpj; }
	
	public void setId(int _id) { this.id = _id; }
	public void setNome(String _nome) { this.nome = _nome; }
	public void setLogra(String _logra) { this.logradouro =  _logra; }
	public void setNum(String _num) { this.numero = _num; }
	public void setCep(String _cep) { this.cep = _cep; }
	public void setBairro(String _bairro) { this.bairro = _bairro; }
	public void setCidade(String _cidade) { this.cidade = _cidade; }
	public void setUf(String _uf) { this.uf = _uf; }
	public void setTel(String _tel) { this.telefone = _tel; }
	public void setCpfCnpj(String _cpfcnpj) { this.cpf_cnpj = _cpfcnpj; }
	
	//Metodo construtor (PRECISA TER O MESMO NOME DA CLASSE)
	//A classe que vai ser chamada depende dos parametros, não dá conflito de nome
	//Sem parametros
	public Associados() {
		//Inicia as variaveis da instancia (Objetos) vazias
		this.setId(0);
		this.setNome(" - ");
		this.setLogra(" - ");
		this.setNum(" - ");
		this.setCep(" - ");
		this.setBairro(" - ");
		this.setCidade(" - ");
		this.setUf(" - ");
		this.setTel(" - ");
		this.setCpfCnpj(" - ");
	}
	//COM parametros
	public Associados(int _id, String _nome, String _logra, String _num, String _cep, String _bairro, String _cidade, String _uf, String _tel, String _doc) {
		//Inicia as variaveis da instancia (Objetos) com os parametros já setados
		this.setId(_id);
		this.setNome(_nome);
		this.setLogra(_logra);
		this.setNum(_num);
		this.setCep(_cep);
		this.setBairro(_bairro);
		this.setCidade(_cidade);
		this.setUf(_uf);
		this.setTel(_tel);
		this.setCpfCnpj(_doc);
	}
	
	public void MostrarDados() {
		System.out.println("------Dados------");
		System.out.println("ID: " + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.println("Logradouro: " + this.logradouro);
		System.out.println("Numero: " + this.numero);
		System.out.println("CEP: " + this.cep);
		System.out.println("Bairro: " + this.bairro);
		System.out.println("UF: " + this.uf);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("CPF/CNPJ: " + this.cpf_cnpj + "\n\n\n\n");
	}
}
