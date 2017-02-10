
public class ContaSimples {
	private int numero;
	private String cliente;
	private double saldo;

	public ContaSimples(int numero, String cliente){
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = 0;
	}

	public ContaSimples(){
	}

	int getNumero(){
		return this.numero;
	}

	double getSaldo(){
		return this.saldo;
	}
	
	void setSaldo(double valor){
		this.saldo = valor;
	}

	void efetuaDeposito(double valor){
		this.saldo += valor;
	}

	boolean efetuaSaque(double valor){
		if(this.saldo >= valor){
			this.saldo -= valor;
			return true;
		}
		return false;
	}

}
