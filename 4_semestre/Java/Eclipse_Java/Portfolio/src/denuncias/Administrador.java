package denuncias;

public class Administrador extends Usuario {
	private int id, nivelAcesso;
	
	public int getId() { return this.id; }
	public int getAcesso() { return this.nivelAcesso; }
	
	public void setId(int id) { this.id = id; }
	public void setAcesso(int acesso) { this.nivelAcesso = acesso; }
}
