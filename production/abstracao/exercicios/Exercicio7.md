Questão 7 - Implementações que podem ser desenvolvidas com Interface

As seguintes abstrações poderiam ser implementadas utilizando interfaces:

Conta interface OperacoesConta {
void depositar(double valor);
void sacar(double valor);
}

A interface define apenas os comportamentos relacionados às operações bancárias, sem armazenar atributos.

Veículo interface Movimentacao {
void acelerar();
void frear();
}

Nesse caso, qualquer classe que represente um meio de transporte poderia implementar essa interface.

Pessoa interface Comprador {
void efetuarCompra(double valor);
}

A interface representa a capacidade de realizar compras, independentemente do tipo de pessoa.

Funcionário interface Calculavel {
double calcularSalario();
}

Essa interface padroniza o cálculo salarial para diferentes tipos de funcionários.