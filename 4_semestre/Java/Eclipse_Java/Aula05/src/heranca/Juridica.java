package heranca;

import javax.swing.JOptionPane;

public class Juridica extends Pessoa {
	private String cnpj, IE;
	
	public void setCnpj(String _cnpj) {this.cnpj = _cnpj;}
	public void setIE(String _ie) {this.IE = _ie;}
	
	public String getCnpj() {return this.cnpj;}
	public String getIE() {return this.IE;}
	
	public void MostrarDados() {
		//Vai mostrar uma tela com mensagem. (Aviso)
		JOptionPane.showMessageDialog(null, "====Dados da Pessoa===="+"\n- Nome: "+this.getName()+"\n- Telefone: "+this.getPhone()+"\n- E-mail: "+this.getMail()+"\n- CNPJ: "+this.getCnpj()+"\n- Inscrição Estadual: "+this.getIE());
	}
}
