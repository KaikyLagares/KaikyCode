#include <iostream>

int main()
{
	int Numero;
	Numero = 78;
	std::cout << "valor Numero: " << Numero << std::endl;
	std::cout << "Tamanho da variavel Numero: " << sizeof(Numero) << "Bytes"  <<"\n";

	std::cout << "Tamanho da variavel Numero: " << &Numero <<"\n";
	system("PAUSE");

}