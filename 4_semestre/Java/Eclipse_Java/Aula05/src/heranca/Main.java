package heranca;

import javax.swing.JOptionPane;

public class Main {
	//Para caso fosse usar no cmd, se passaria os argumentos
	//static significa que o metódo é relacionado a classe inteira, não somente a uma instancia
	public static void main(String[] args) {		
		Pessoa pes1 = new Pessoa();
		
		//Vai abrir uma tela de Input bonitinha
		pes1.setName(JOptionPane.showInputDialog("Digite o nome: "));
		pes1.setPhone(JOptionPane.showInputDialog("Digite o telefone: "));
		pes1.setMail(JOptionPane.showInputDialog("Digite o E-mail: "));
		
		pes1.MostrarDados();
		
		Fisica pes2 = new Fisica();
		
		pes2.setName(JOptionPane.showInputDialog("Digite o nome: "));
		pes2.setPhone(JOptionPane.showInputDialog("Digite o telefone: "));
		pes2.setMail(JOptionPane.showInputDialog("Digite o E-mail: "));
		
		pes2.setCpf(JOptionPane.showInputDialog("Digite o CPF: "));
		pes2.setSex(JOptionPane.showInputDialog("Digite seu sexo: "));
		
		pes2.MostrarDados();
		
		Juridica pes3 = new Juridica();
		
		pes3.setName(JOptionPane.showInputDialog("Digite o nome: "));
		pes3.setPhone(JOptionPane.showInputDialog("Digite o telefone: "));
		pes3.setMail(JOptionPane.showInputDialog("Digite o E-mail: "));
		
		pes3.setCnpj(JOptionPane.showInputDialog("Digite o CNPJ: "));
		pes3.setIE(JOptionPane.showInputDialog("Digite a inscrição estadual: "));
		
		pes3.MostrarDados();
	}
}
