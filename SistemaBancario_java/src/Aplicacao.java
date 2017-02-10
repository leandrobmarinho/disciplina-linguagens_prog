import java.util.Scanner;


public class Aplicacao {

	public static void main(String[] args) {
		
		ContaSimples conta = null;
		
		Scanner s = new Scanner(System.in);
		int opc = s.nextInt();
		
		switch (opc) {
			case 1:
				conta = new ContaSimples(1234, "Maria");
				break;
			case 2:
				conta = new ContaPoupanca(1234, "Maria");
				break;
			case 3:
				conta = new ContaEspecial(1234, "Maria", 3000);
		}

		conta.efetuaDeposito(1000);
		if (conta.efetuaSaque(2000)){
			System.out.println("Saque efetuado com sucesso!");
		}else{
			System.out.println("Saldo insuficiente para o saque.");
			
		}
		System.out.println("Cliente: " + conta.getNumero());
		System.out.println("Saldo: " + conta.getSaldo());

	}

}
