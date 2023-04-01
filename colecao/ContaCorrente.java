package colecao;

public class ContaCorrente {
	
	public double saldo;
	
	Cliente cliente = new Cliente();
	
		
	public void depositar(double deposito) {
		this.saldo = this.saldo + deposito;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
