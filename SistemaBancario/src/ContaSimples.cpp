#include "ContaSimples.h"

ContaSimples::ContaSimples(int numero, string cliente){
		this->numero = numero;
		this->cliente = cliente;
		this->saldo = 0;
}

ContaSimples::~ContaSimples(){
	//std::cout << "'destruindo' base\n";
}

int ContaSimples::getNumero(){
	return this->numero;
}

double ContaSimples::getSaldo(){
	return this->saldo;
}

void ContaSimples::efetuaDeposito(double valor){
	this->saldo += valor;
}

bool ContaSimples::efetuaSaque(double valor){
	if(this->saldo >= valor){
		this->saldo -= valor;
		return true;
	}
	return false;
}

