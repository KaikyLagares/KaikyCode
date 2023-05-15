
#include <iostream>
#include <vector>
#include <string>

using namespace std;

class Veiculo {
public:
    string marca;
    string modelo;
    int ano;
    double preco;

    Veiculo(const string& marca, const string& modelo, int ano, double preco)
        : marca(marca), modelo(modelo), ano(ano), preco(preco) {}
};

class Cliente {
public:
    string nome;
    string endereco;
    string telefone;

    Cliente(const string& nome, const string& endereco, const string& telefone)
        : nome(nome), endereco(endereco), telefone(telefone) {}
};

class Venda {
public:
    Veiculo veiculo;
    Cliente cliente;
    double valor;

    Venda(const Veiculo& veiculo, const Cliente& cliente, double valor)
        : veiculo(veiculo), cliente(cliente), valor(valor) {}
};

class Concessionaria {
public:
    vector<Veiculo> estoque;
    vector<Veiculo> vendidos;
    vector<Cliente> clientes;
    vector<Venda> vendas;

    void cadastrarVeiculo(const Veiculo& veiculo) {
        estoque.push_back(veiculo);
    }

    void venderVeiculo(const Veiculo& veiculo, const Cliente& cliente, double valor) {
        vendidos.push_back(veiculo);
        vendas.push_back(Venda(veiculo, cliente, valor));
        // Atualiza o estoque e o registro de vendas no banco de dados
    }

    void cadastrarCliente(const Cliente& cliente) {
        clientes.push_back(cliente);
        // Atualiza o registro de clientes no banco de dados
    }
};

int main() {
    Concessionaria concessionaria;

    Veiculo veiculo1("Marca1", "Modelo1", 2022, 50000);
    Veiculo veiculo2("Marca2", "Modelo2", 2021, 40000);
    Veiculo veiculo3("Marca3", "Modelo3", 2023, 48000);
    Veiculo veiculo4("Marca4", "Modelo4", 2025, 57000);

    concessionaria.cadastrarVeiculo(veiculo1);
    concessionaria.cadastrarVeiculo(veiculo2);
    concessionaria.cadastrarVeiculo(veiculo3);
    concessionaria.cadastrarVeiculo(veiculo4);

    Cliente cliente1("Cliente1", "Endereco1", "Telefone1");
    Cliente cliente2("Cliente2", "Endereco2", "Telefone2");
    Cliente cliente3("Cliente3", "Endereco1", "Telefone1");
    


    concessionaria.cadastrarCliente(cliente1);
    concessionaria.cadastrarCliente(cliente2);
    concessionaria.cadastrarCliente(cliente3);

    concessionaria.venderVeiculo(veiculo1, cliente1, 50000);
    concessionaria.venderVeiculo(veiculo2, cliente2, 48000);
    concessionaria.venderVeiculo(veiculo2, cliente3, 57000);

    // Exibição dos veículos vendidos
    cout << "Relatório de vendas:" << endl;
    for (const auto& venda : concessionaria.vendas) {
        cout << "Marca: " << venda.veiculo.marca << ", Modelo: " << venda.veiculo.modelo
            << ", Ano: " << venda.veiculo.ano << ", Valor: " << venda.valor << endl;

        cout << "Dados do comprador: " << endl;
        cout << "Nome: " << venda.cliente.nome << ", Endereço: " << venda.cliente.endereco
            << ", Telefone: " << venda.cliente.telefone << endl;

        cout << "Transação: ";
        // Verifica se o valor da venda é maior que zero para indicar que a transação foi um sucesso
        if (venda.valor > 0) {
            cout << "Sucesso" << endl;
            cout << "Valor recebido pelo cliente " << venda.valor <<" Marca do veículo adquirida pelo cliente: " << venda.veiculo.marca << endl;
        }
        else {
            cout << "Falha" << endl;
        }
    }

    return 0;
}
