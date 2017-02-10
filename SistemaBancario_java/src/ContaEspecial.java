
public class ContaEspecial extends ContaSimples{
	
	private double limite;
	
	public ContaEspecial(){}
	
	public ContaEspecial(int numero, String cliente, double limite){
		super(numero,cliente);
		this.limite = limite;
	}
	
	
	boolean efetuaSaque(double valor){
		if(super.getSaldo() + this.limite >= valor){
			setSaldo(super.getSaldo() - valor);
			return true;
		}
		return false;
	}

	double getSaldo(){
		return super.getSaldo() + this.limite;
	}

	double getLimite(){
		return this.limite;
	}


}
