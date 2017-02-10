#include <iostream>
#include "ContaPoupanca.h"
#include "ContaEspecial.h"
using namespace std;

int main() {
	// Polimorfismo
	ContaSimples *conta = NULL;
	int opc;
	cin >> opc;
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

	conta->efetuaDeposito(1000);
	if (conta->efetuaSaque(2000)){
		cout << "Saque efetuado com sucesso!" << endl;
	}else{
		cout << "Saldo insuficiente para o saque." << endl;
	}
	cout << "Cliente: " << conta->getNumero() << endl;
	cout << "Saldo: " << conta->getSaldo() << endl;

	delete conta;
	return 0;
}

