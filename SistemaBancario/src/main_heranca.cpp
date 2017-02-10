#include <iostream>
#include "ContaPoupanca.h"
#include "ContaEspecial.h"
using namespace std;

int main() {
	// Herança
	ContaPoupanca* conta = new ContaPoupanca(987, "Beutrano");

	conta->efetuaDeposito(100);
	conta->acrescentaRendimento(0.1);
	cout << conta->getSaldo() << endl;

	delete conta;
	return 0;
}

