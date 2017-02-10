
public class ContaPoupanca extends ContaSimples{
	
	public ContaPoupanca() {}
	
	public ContaPoupanca(int numero, String cliente){
		super(numero, cliente);
	}
	
	void acrescentaRendimento(double taxa){
		setSaldo(getSaldo() * (1 + taxa));
	}


}
