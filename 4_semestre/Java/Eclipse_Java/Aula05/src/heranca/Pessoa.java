package heranca;

import javax.swing.JOptionPane; //JOption é o metodo de mostrar mensagens
//swing é a classe que tem os objetos gráficos. (Caixa de seleção, botão, etc.)

public class Pessoa {
	//protected diz que só as classes filhas tem acesso
	protected String name, phone, mail;
	
	//Setters
	public void setName(String _name) {this.name = _name;} 
	public void setPhone(String _phone) {this.phone = _phone;}
	public void setMail(String _mail) {this.mail = _mail;}
	//"public" disponivel para todos / "void" Não retorna nada
	
	//Getters
	public String getName() {return this.name;}
	public String getPhone() {return this.phone;}
	public String getMail() {return this.mail;}
	
	public void MostrarDados() {
		//Vai mostrar uma tela com mensagem. (Aviso)
		JOptionPane.showMessageDialog(null, "====Dados da Pessoa===="+"\n- Nome: "+this.getName()+"\n- Telefone: "+this.getPhone()+"\n- E-mail: "+this.getMail());
	}
}
