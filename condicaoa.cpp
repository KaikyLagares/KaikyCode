#include <iostream>
#include <string>

int main() {

	bool bFezSol, bCarroPronto, bSalarioDepositado;
	bool bAcesso;

	std::string SenhaDeAcesso = "cmaismais";
	std::string SenhaDigitada;
	std::cout << "Digite a senha de acesso: ";
	std::cin >> SenhaDigitada;
	if (SenhaDigitada == SenhaDeAcesso)
	{
		std::cout << "\nAcesso Permitido!" << "\n";
		bAcesso = true;

	}
	else {
		std::cout << "\n Acesso Negado!!" << "\n";
		system("PAUSE");
		exit(0);
	}
	bFezSol = false;
	bCarroPronto = false;
	bSalarioDepositado = false;
	if (bAcesso) {
		if (bFezSol || bCarroPronto || bSalarioDepositado)
		{

			std::cout << " \nVai ser Praia " << std::endl;

		}


		else if (!bSalarioDepositado)
		{

			std::cout << " Nao vai ser praia, mas o salario foi depositado com sucesso!! " << "\n";
		}

	}
	system("PAUSE");
}
   


