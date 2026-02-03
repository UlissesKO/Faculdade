package polimorfism;

public class ContaEspecial extends ContaComum {
	protected double limite;
	
	protected double getLimite() { return this.limite; }
	private void setLimite(double _lim) { this.limite = _lim; }
	
	public ContaEspecial() {
		super();
		this.setLimite(0);
	}
	public ContaEspecial(int _num, String _cpf, double _saldo) {
		super(_num, _cpf, _saldo);
		this.setLimite(_saldo * 2);
	}
	
	public void Saque(double _valorSaque) {
		double novoSaldo = (this.getSaldo() + this.getLimite()) - _valorSaque;
		if (novoSaldo >= this.getLimite()) {
			this.setSaldo(novoSaldo);
			System.out.println("Sacado: R$"+_valorSaque);
			System.out.println("Saldo: R$"+this.getSaldo());
		} else {
			System.out.println("Saldo insuficiente");
			System.out.println("Você tem: R$"+this.getSaldo());
		}
	}
}
