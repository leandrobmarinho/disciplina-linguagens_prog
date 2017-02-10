#include "ContaPoupanca.h"

ContaPoupanca::ContaPoupanca(int numero, string cliente) : ContaSimples(numero, cliente){

}

ContaPoupanca::~ContaPoupanca() {
	//std::cout << "'destruindo' poupanca\n";
}

void ContaPoupanca::acrescentaRendimento(double taxa){
	this->saldo *= 1 + taxa;
}
