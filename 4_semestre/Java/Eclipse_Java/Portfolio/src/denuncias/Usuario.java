package denuncias;

public class Usuario {
	protected int id;
	protected boolean admin;
	protected String cpf, bairro, rua, email, telefone, senha;
	
    public int getId() { return id; }
    public boolean isAdmin() { return admin; }
    public String getCpf() { return cpf; }
    public String getBairro() { return bairro; }
    public String getRua() { return rua; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }
    public String getSenha() { return senha; }
    
    public void setId(int id) { this.id = id; }
    public void setAdmin(boolean admin) { this.admin = admin; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setBairro(String bairro) { this.bairro = bairro; }
    public void setRua(String rua) { this.rua = rua; }
    public void setEmail(String email) { this.email = email; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setSenha(String senha) { this.senha = senha; }
}