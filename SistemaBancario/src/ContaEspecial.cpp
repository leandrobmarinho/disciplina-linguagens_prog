#include "ContaEspecial.h"
ContaEspecial::ContaEspecial(int numero, string cliente, double limite) : ContaSimples(numero, cliente){
	this->limite = limite;
}
ContaEspecial::~ContaEspecial(){
	//std::cout << "'destruindo' especial\n";
}

bool ContaEspecial::efetuaSaque(double valor){
	if(this->saldo + this->limite >= valor){
		this->saldo -= valor;
		return true;
	}
	return false;
}

double ContaEspecial::getSaldo(){
	return this->saldo + this->limite;
}

double ContaEspecial::getLimite(){
	return this->limite;
}
