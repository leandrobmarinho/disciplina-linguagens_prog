#pragma once
#include <string>
#include <iostream>
using namespace std;

class ContaSimples{
public:
	ContaSimples(int numero, string cliente);
	virtual ~ContaSimples();
	int getNumero();
	virtual double getSaldo();
	void efetuaDeposito(double valor);
	virtual bool efetuaSaque(double valor);

protected:
	int numero;
	string cliente;
	double saldo;
};
