#include <iostream>

int main() {
	int capacidadeAtual, aumentoPercentual;
	int NovoAumento;

	std::cout << "Digite o Primeiro Numero: ";
	std::cin >> capacidadeAtual;

	std::cout << "Digite o segundo Numero: ";
	std::cin >> aumentoPercentual;

	NovoAumento =  (aumentoPercentual/10 );
	std::cout << NovoAumento<< "\n";

	
	std::cout << "Capacidade total:  " << NovoAumento  + capacidadeAtual  << "\n";

	return 0;
}

