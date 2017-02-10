#include "ContaSimples.h"
class ContaPoupanca : public ContaSimples{
public:
	ContaPoupanca(int numero, string cliente);
	~ContaPoupanca();
	void acrescentaRendimento(double taxa);
};
