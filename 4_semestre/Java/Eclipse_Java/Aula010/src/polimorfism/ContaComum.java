package polimorfism;

public class ContaComum {
	protected int nroConta;
	protected String cpf;
	protected double saldo;
	
	protected int getNroConta() { return this.nroConta; }
	protected String getCpf() { return this.cpf; }
	protected double getSaldo() { return this.saldo; }
	
	private void setNroConta(int _num) { this.nroConta = _num; }
	private void setCpf(String _cpf) { this.cpf = _cpf; }
	protected void setSaldo(double _num) { this.saldo = _num; }
	
	public ContaComum() {
		this.setNroConta(0);
		this.setCpf("000.000.000-00");
		this.setSaldo(0);
	}
	public ContaComum(int _num, String _cpf, double _saldo) {
		this.setNroConta(_num);
		this.setCpf(_cpf);
		this.setSaldo(_saldo);
	}
	
	public void Saque(double _valorSaque) {
		if ( this.getSaldo() - _valorSaque >= 0) {
			this.setSaldo(this.getSaldo() - _valorSaque);
			System.out.println("Sacado: R$"+_valorSaque);
			System.out.println("Saldo: R$"+this.getSaldo());
		} else {
			System.out.println("Saldo insuficiente");
			System.out.println("Você tem: R$"+this.getSaldo());
		}
	}
}
