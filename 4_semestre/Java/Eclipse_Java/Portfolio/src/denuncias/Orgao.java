package denuncias;

public class Orgao {
	int id, qntdDenuncias;
	String nome, endereco, email, telefone;
	
	public int getId() { return id; }
	public int getQntdDenuncias() { return qntdDenuncias; }
	public String getNome() { return nome; }
	public String getEndereco() { return endereco; }
	public String getEmail() { return email; }
	public String getTelefone() { return telefone; }

	public void setId(int id) { this.id = id; }
	public void setQntdDenuncias(int qntdDenuncias) { this.qntdDenuncias = qntdDenuncias; }
	public void setNome(String nome) { this.nome = nome; }
	public void setEndereco(String endereco) { this.endereco = endereco; }
	public void setEmail(String email) { this.email = email; }
	public void setTelefone(String telefone) { this.telefone = telefone; }
}
