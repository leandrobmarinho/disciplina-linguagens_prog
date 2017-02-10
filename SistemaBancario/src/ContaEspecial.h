#include "ContaSimples.h"
class ContaEspecial : public ContaSimples{
public:
	ContaEspecial(int numero, string cliente, double limite);
	~ContaEspecial();
	bool efetuaSaque(double valor);
	double getLimite();
	double getSaldo();
private:
	double limite;
};
