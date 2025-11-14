package denuncias;

public class Denuncia {
	int id, user, orgao;
	String data, bairro, rua, pontoReferencia, descricao;
	boolean resolvido;
	
	public int getId() { return id; }
	public int getUser() { return user; }
	public int getOrgao() { return orgao; }
	public String getData() { return data; }
	public String getBairro() { return bairro; }
	public String getRua() { return rua; }
	public String getRef() { return pontoReferencia; }
	public String getDescricao() { return descricao; }
	public boolean isResolvido() { return resolvido; }

	public void setId(int id) { this.id = id; }
	public void setUser(int user) { this.user = user; }
	public void setOrgao(int orgao) { this.orgao = orgao; }
	public void setData(String data) { this.data = data; }
	public void setBairro(String bairro) { this.bairro = bairro; }
	public void setRua(String rua) { this.rua = rua; }
	public void setRef(String ref) { this.pontoReferencia = ref; }
	public void setDescricao(String descricao) { this.descricao = descricao; }
	public void setResolvido(boolean resolvido) { this.resolvido = resolvido; }
}
