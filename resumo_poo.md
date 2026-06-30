# Resumo — Programação Orientada a Objetos (Java)

---

## 1. Fundamentos

### Scanner (Entrada de Dados)
```java
Scanner teclado = new Scanner(System.in);

int n         = teclado.nextInt();
double d      = teclado.nextDouble();
teclado.nextLine(); // limpar buffer após nextInt/nextDouble
String linha  = teclado.nextLine();
String palavra = teclado.next(); // lê até o primeiro espaço

teclado.close();
```
> ⚠️ Sempre chame `teclado.nextLine()` para limpar o buffer depois de `nextInt()` ou `nextDouble()`, antes de ler uma String.

---

### Arrays (Vetores)
```java
// Declaração e inicialização separadas
int[] vetor = new int[5];
vetor[0] = 10;
vetor[1] = 20;

// Declaração com valores
int[] vetor2 = {1, 2, 3, 4, 5};

// Array de objetos
String[] nomes = new String[3];
```

#### Percorrer array — for normal (quando precisa do índice)
```java
for (int i = 0; i < vetor.length; i++) {
    System.out.println("Posição " + i + ": " + vetor[i]);
}
```

#### Percorrer array — for-each (quando só precisa dos valores)
```java
for (int valor : vetor) {
    System.out.println(valor);
}
```
> ✅ Prefira o **for-each** sempre que não precisar manipular o índice — é mais limpo e menos propenso a erro.

---

### Matriz (Array 2D)
```java
int[][] matriz = new int[2][3]; // 2 linhas, 3 colunas

// Percorrer
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + "\t");
    }
    System.out.println();
}
```

---

### Laços de Repetição
```java
// for — quando se sabe quantas iterações
for (int i = 0; i < 10; i++) { ... }

// while — quando a condição é verificada antes
int i = 0;
while (i < 10) { i++; }

// do-while — executa pelo menos uma vez
do { i++; } while (i < 10);
```

---

## 2. POO Básico

### Classe e Objeto
- **Classe**: molde/plano que define estrutura e comportamento.
- **Objeto**: instância concreta de uma classe, com seu próprio estado.
- **Atributo**: variável declarada dentro da classe; descreve o estado do objeto.
- **Método**: bloco de código que define o comportamento do objeto.

```java
public class Pessoa {
    String nome;
    int idade;
    String genero;
}

// Criando objeto
Pessoa p = new Pessoa();
p.nome = "Joseph";
```

---

### Modificadores de Acesso
| Modificador | Acessível por |
|-------------|--------------|
| `public`    | Qualquer classe, qualquer pacote |
| `private`   | Somente a própria classe |
| `protected` | Mesma classe, mesmo pacote, subclasses |
| _(default)_ | Mesmo pacote apenas |

---

### Encapsulamento
Protege os dados com `private` e fornece acesso controlado via **getters** e **setters**.

```java
public class ContaBancaria {
    private double saldo;
    private double limite;

    public ContaBancaria(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public double getSaldo() { return saldo; }

    public void setSaldo(double saldo) {
        if (saldo >= 0) this.saldo = saldo;
        else System.out.println("Saldo não pode ser negativo.");
    }
}
```

---

### Construtores
Inicializam o objeto no momento da criação. Mesmo nome da classe, sem tipo de retorno.

```java
public Pedido(int numero, String produto, double preco, int quantidade) {
    this.numero = numero;
    this.produto = produto;
    this.preco = preco;
    this.quantidade = quantidade;
}
```
> `this` referencia o próprio objeto, diferenciando atributo de parâmetro com mesmo nome.

---

### Métodos
Definem o comportamento da classe. Podem retornar valores ou ser `void`.

```java
public boolean sacarSaldo(float valor) {
    if (saldo >= valor) {
        saldo -= valor;
        return true;
    }
    return false;
}
```

---

### toString()
Sobrescreve a representação textual padrão do objeto (usada em `System.out.println(obj)`).

```java
@Override
public String toString() {
    return "Número: " + numero + "\nTitular: " + titular + "\nSaldo: R$ " + saldo;
}
```

---

### Exceções (try-catch)
```java
try {
    int[] numeros = {1, 2, 3};
    System.out.println(numeros[5]); // lança exceção
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Índice fora do array: " + e.getMessage());
} catch (Exception e) {
    System.out.println("Exceção genérica: " + e.toString());
}
```
> A ordem importa: exceções mais específicas sempre **antes** das genéricas.

---

### Relacionamentos entre Classes
Um objeto pode ter outro objeto como atributo (composição).

```java
public class Pessoa2 {
    private String nome;
    private Endereco endereco; // outro objeto
}
```

---

## 3. POO Intermediário

### Herança (`extends`)
Subclasse herda atributos e métodos da superclasse. Use `super()` para chamar o construtor pai.

```java
public class Computador {
    protected String marca;
    private String modelo;

    public Computador(String marca) {
        this.marca = marca;
        this.modelo = "Portátil";
    }
}

public class Notebook extends Computador {
    public Notebook(String marca) {
        super(marca); // chama o construtor de Computador
    }
}
```

> `protected` — atributo visível na própria classe **e** nas subclasses.

#### Herança em cascata
```
Desenho → Desenho2D → Quadrado
```
Cada nível herda tudo do anterior.

---

### Sobrescrita (`@Override`)
A subclasse redefine um método da superclasse.

```java
public class ReservaDeHotel extends Reserva {
    @Override
    public void cancelar() {
        System.out.println("Reserva de hotel cancelada com taxa de 10%.");
    }
}
```

---

### Sobrecarga (Overload)
Mesmo nome de método, parâmetros diferentes — na mesma classe.

```java
public class NotificacaoEmail extends Notificacao {
    @Override
    public void enviar() { ... }                          // sobrescrita

    public void enviar(String dest) { ... }               // sobrecarga
    public void enviar(String dest1, String dest2) { ... } // sobrecarga
}
```

---

### `super` — acessar método da classe pai
```java
@Override
public void desconto(double valor) {
    valor = this.getPreco() - (this.getPreco() * 0.3);
    super.desconto(valor); // chama o desconto da classe pai
}
```

---

### Classes Abstratas

Uma classe abstrata é uma classe que **não pode ser instanciada diretamente** — ela existe apenas para ser herdada. Serve como molde que impõe um contrato às subclasses, mas já pode fornecer implementações compartilhadas.

#### Regras fundamentais
- Declarada com `abstract class`.
- Pode ter atributos normais, construtores e métodos concretos.
- Pode ter **métodos abstratos** (`abstract`) — sem corpo, que as subclasses **são obrigadas** a implementar.
- Se uma subclasse não implementar todos os métodos abstratos, ela também precisa ser declarada `abstract`.
- ❌ `new ClasseAbstrata()` — **não compila**.

#### Estrutura básica

```java
abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    // Construtor normal — subclasses chamam com super()
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos abstratos — cada subclasse DEVE implementar
    public abstract void acelerar();
    public abstract void frear();
}
```

#### Subclasses implementando os abstratos

```java
public class Carro extends Veiculo {
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano); // obrigatório chamar o construtor pai
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando.");
    }
}

public class Moto extends Veiculo {
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("A moto está freando.");
    }
}

// Uso
Carro c = new Carro("Toyota", "Corolla", 2020);
Moto m  = new Moto("Honda", "CBR", 2021);
c.acelerar();
m.frear();
```

#### Classe abstrata com método concreto + método abstrato

A grande vantagem: o método concreto é herdado por todos, enquanto o abstrato força cada subclasse a ter sua própria lógica.

```java
abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Método concreto — herdado por todos sem precisar reescrever
    public double calcularSalario() {
        return salario; // comportamento padrão
    }
}

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario() {
        return salario + (salario * 0.20); // +20% de bônus
    }
}

public class Vendedor extends Funcionario {
    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario() {
        return salario + (salario * 0.10); // +10% de comissão
    }
}

// Uso
Gerente g  = new Gerente("João", 5000.0);
Vendedor v = new Vendedor("Maria", 3000.0);
System.out.println("Salário do Gerente: "  + g.calcularSalario()); // 6000.0
System.out.println("Salário do Vendedor: " + v.calcularSalario()); // 3300.0
```

#### Classe abstrata com atributos `protected`

Atributos `protected` são acessíveis diretamente nas subclasses (sem getter):

```java
abstract class Animal {
    private String especie;
    private int idade;

    public Animal(String especie, int idade) {
        this.especie = especie;
        this.idade = idade;
    }

    // Método concreto disponível para todas as subclasses
    public void exibirInfo() {
        System.out.println("Espécie: " + especie);
        System.out.println("Idade: " + idade);
    }

    // Método abstrato — cada animal emite som diferente
    public void emitirSom() {
        System.out.println("Emitindo som genérico");
    }
}

public class Cachorro extends Animal {
    public Cachorro(String especie, int idade) {
        super(especie, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }

    // Subclasse pode ter métodos próprios além dos herdados
    public void cuidarPatio() {
        System.out.println("Cuidando do pátio");
    }
}

public class Tigre extends Animal {
    public Tigre(String especie, int idade) {
        super(especie, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Grrr Grrr");
    }
}

// Uso
Cachorro cachorro = new Cachorro("Canis lupus", 5);
Tigre tigre       = new Tigre("Panthera leo", 10);

cachorro.emitirSom();   // Au Au
tigre.emitirSom();      // Grrr Grrr
cachorro.exibirInfo();  // método herdado da abstrata
cachorro.cuidarPatio(); // método exclusivo de Cachorro
```

#### Polimorfismo com classe abstrata

Você pode usar o tipo da abstrata para guardar qualquer subclasse:

```java
// Variável do tipo pai, objeto do tipo filho
Animal a1 = new Cachorro("Canis lupus", 5);
Animal a2 = new Tigre("Panthera leo", 10);

a1.emitirSom(); // Au Au       — chama o de Cachorro
a2.emitirSom(); // Grrr Grrr  — chama o de Tigre

// Para acessar método exclusivo da subclasse, precisa de cast
Cachorro c = (Cachorro) a1;
c.cuidarPatio();
```

#### Exemplo completo: Conta bancária abstrata

```java
abstract class Conta {
    protected double saldo;
    protected double limite;

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public abstract void depositar(double valor); // cada tipo implementa diferente
    public abstract void sacar(double valor);
}

public class ContaCorrente extends Conta {
    public ContaCorrente(double saldo, double limite) {
        super(saldo, limite);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito na Conta Corrente. Saldo: R$ " + saldo);
    }

    @Override
    public void sacar(double valor) {
        if (saldo + limite >= valor) {
            saldo -= valor;
            System.out.println("Saque na Conta Corrente. Saldo: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}

public class ContaInvestimento extends Conta {
    public ContaInvestimento(double saldo, double limite) {
        super(saldo, limite);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito na Conta Investimento. Saldo: R$ " + saldo);
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) { // investimento não usa limite
            saldo -= valor;
            System.out.println("Saque na Conta Investimento. Saldo: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
}

// Uso
ContaCorrente cc    = new ContaCorrente(1000, 500);
ContaInvestimento ci = new ContaInvestimento(5000, 0);

cc.depositar(200);  // saldo: 1200
cc.sacar(1500);     // usa o limite: saldo: -300

ci.depositar(1000); // saldo: 6000
ci.sacar(3000);     // saldo: 3000
```

#### Classe abstrata com herança de outra classe

Subclasses de uma abstrata podem também ser abstratas, formando hierarquias:

```java
abstract class Pessoa {
    private String nome;
    private String cidade;

    public Pessoa(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public void efetuarCompra() {} // método concreto vazio (padrão)
}

public class PessoaFisica extends Pessoa {
    private String CPF;
    private String RG;

    public PessoaFisica(String nome, String cidade, String CPF, String RG) {
        super(nome, cidade);
        this.CPF = CPF;
        this.RG  = RG;
    }

    @Override
    public void efetuarCompra() {
        System.out.println("Pessoa Física efetuou uma compra.");
    }
}

public class PessoaJuridica extends Pessoa {
    private String CNPJ;

    public PessoaJuridica(String nome, String cidade, String CNPJ) {
        super(nome, cidade);
        this.CNPJ = CNPJ;
    }

    @Override
    public void efetuarCompra() {
        System.out.println("Pessoa Jurídica efetuou uma compra.");
    }
}
```

#### Resumo rápido — o que pode e o que não pode

```java
// ❌ Instanciar classe abstrata diretamente
Veiculo v = new Veiculo("Toyota", "Corolla", 2020); // ERRO

// ✅ Instanciar subclasse concreta
Veiculo v = new Carro("Toyota", "Corolla", 2020);   // OK — polimorfismo

// ❌ Subclasse que não implementa todos os abstratos sem ser abstract
public class Barco extends Veiculo {
    // esqueceu de implementar acelerar() e frear() → ERRO de compilação
}

// ✅ Subclasse abstrata não precisa implementar tudo
public abstract class Barco extends Veiculo {
    // implementará os abstratos quem herdar de Barco
}
```

---

### Interfaces

Define um **contrato**: lista de métodos que qualquer classe implementadora é obrigada a ter. Não guarda estado (sem atributos de instância) e não pode ser instanciada diretamente.

```java
// Declaração
public interface Animal {
    void emitirSom();   // implicitamente public abstract
    void exibirInfo();
}
```

#### Implementando uma interface
```java
public class Cachorro implements Animal {
    public String nome;
    public String raca;
    public int idade;

    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Raça: " + this.raca);
        System.out.println("Idade: " + this.idade);
    }
}

// Uso
Cachorro cachorro = new Cachorro();
cachorro.nome = "Rex";
cachorro.emitirSom();
cachorro.exibirInfo();
```

#### Múltiplas interfaces (vantagem sobre herança)
Uma classe pode implementar quantas interfaces quiser, mas só pode herdar de **uma** classe.

```java
public interface Celular {
    void realizarChamada();
}

public interface PC {
    void verificaEmail();
}

// Smartphone é Celular E PC ao mesmo tempo
public class Smartphone implements PC, Celular {
    private String tel;
    private String email;

    public Smartphone(String tel, String email) {
        this.tel = tel;
        this.email = email;
    }

    @Override
    public void realizarChamada() {
        System.out.println("Realizando chamada...");
    }

    @Override
    public void verificaEmail() {
        System.out.println("Verificando email...");
    }
}
```

#### Interface como tipo (polimorfismo com interface)
```java
// Interface como tipo da variável — aceita qualquer implementador
Animal a = new Cachorro();
a.emitirSom(); // chama o método de Cachorro
```

#### Exemplos de interfaces do projeto
```java
// Contrato para operações de banco de dados
public interface AcessarDados {
    void conectar();
    void desconectar();
    void inserir();
    void excluir();
    void atualizar();
}

// Classe que cumpre o contrato
public class BancoDeDados implements AcessarDados {
    @Override public void conectar()    { System.out.println("Conectado."); }
    @Override public void desconectar() { System.out.println("Desconectado."); }
    @Override public void inserir()     { System.out.println("Registro inserido."); }
    @Override public void atualizar()   { System.out.println("Registro atualizado."); }
    @Override public void excluir()     { System.out.println("Registro excluído."); }
}
```

#### Quando interface, quando classe abstrata?

| | Classe Abstrata | Interface |
|---|---|---|
| Instanciável? | ❌ | ❌ |
| Pode ter atributos de instância? | ✅ | ❌ (só `static final`) |
| Herança múltipla? | ❌ (só uma) | ✅ (várias) |
| Pode ter métodos concretos? | ✅ | `default` (Java 8+) |
| Quando usar | Compartilhar **código** entre classes relacionadas | Definir **capacidades** sem implementação |

**Resumo prático:**
- Classe abstrata → quando as subclasses **compartilham código** (ex: `Funcionario` com `calcularSalario` padrão).
- Interface → quando você quer garantir que classes **diferentes e sem parentesco** implementem um mesmo contrato (ex: `BancoDeDados`, `Smartphone` e `Cachorro` todos implementando interfaces distintas).

---

### ArrayList

Diferente de um array comum, o `ArrayList` tem **tamanho dinâmico** — cresce conforme você adiciona elementos. Precisa importar `java.util.ArrayList`.

```java
import java.util.ArrayList;

// Criação — sempre com o tipo entre < >
ArrayList<String> nomes = new ArrayList<>();
ArrayList<Integer> numeros = new ArrayList<>(); // int → Integer (tipo wrapper)
```

#### Métodos essenciais
```java
lista.add("item");           // adiciona no final
lista.add(0, "primeiro");    // adiciona em posição específica
lista.get(0);                // acessa elemento pelo índice
lista.set(0, "novo");        // substitui elemento na posição
lista.remove(0);             // remove pelo índice
lista.remove("item");        // remove pelo valor
lista.size();                // quantidade de elementos
lista.contains("item");      // verifica se contém (true/false)
lista.clear();               // esvazia a lista
lista.isEmpty();             // verifica se está vazia (true/false)
```

#### Percorrer ArrayList
```java
// For-each — mais comum, use quando não precisar do índice
for (String nome : nomes) {
    System.out.println(nome);
}

// For normal — use quando precisar do índice
for (int i = 0; i < nomes.size(); i++) {
    System.out.println(i + ": " + nomes.get(i));
}
```

> ⚠️ Com ArrayList use `.size()`, **não** `.length` (isso é só para arrays comuns).

---

### ArrayList de Objetos

O uso mais comum em POO: guardar uma coleção de objetos de uma classe.

```java
// A classe Aluno tem: nome, nota1, nota2, calcularMedia(), getNome()
ArrayList<Aluno> alunos = new ArrayList<>();

alunos.add(new Aluno("Joseph", 8, 7));
alunos.add(new Aluno("Maria",  5, 4));
alunos.add(new Aluno("Carlos", 9, 10));

// Percorrer e chamar métodos de cada objeto
for (Aluno a : alunos) {
    double media = a.calcularMedia();
    System.out.println("Aluno: " + a.getNome());
    System.out.println("Média: " + media);

    if (media >= 6) System.out.println("Aprovado");
    else            System.out.println("Reprovado");
}
```

#### Buscar/filtrar dentro da lista
```java
// Contar pessoas do sexo feminino
int quantidade = 0;
for (Pessoa p : pessoas) {
    if (p.getSexo().equalsIgnoreCase("Feminino")) {
        quantidade++;
    }
}
```

#### Encontrar o maior/menor valor
```java
// Conta com maior saldo
Conta maior = contas.get(0); // começa assumindo o primeiro como maior
for (Conta c : contas) {
    if (c.getSaldo() > maior.getSaldo()) {
        maior = c;
    }
}
System.out.println(maior); // chama toString()
```

#### Passar ArrayList como parâmetro de método
```java
// Método estático que recebe a lista
public static Conta maiorSaldo(ArrayList<Conta> contas) {
    Conta maior = contas.get(0);
    for (Conta c : contas) {
        if (c.getSaldo() > maior.getSaldo()) maior = c;
    }
    return maior;
}

// Chamada
Conta resultado = maiorSaldo(contas);
```

#### Ordenar ArrayList com `Collections`
```java
import java.util.Collections;
import java.util.Comparator;

// Ordena a lista de livros pelo ano (crescente)
Collections.sort(livros, Comparator.comparing(Livro::getAno));

// Para percorrer em seguida
for (Livro l : livros) {
    System.out.println(l);
}
```
> `Livro::getAno` é uma **referência de método** — diz ao `Comparator` qual getter usar para comparar.

---

### Polimorfismo
Tratar objetos de subclasses diferentes pelo tipo da superclasse. Cada objeto executa seu próprio comportamento.

```java
FuncionarioExercicio6[] funcionarios = new FuncionarioExercicio6[2];
funcionarios[0] = new GerenteExercicio6("Carlos", 8000, 5000);
funcionarios[1] = new Desenvolvedor("Ana", 4500, 20);

for (FuncionarioExercicio6 f : funcionarios) {
    f.aumentarSalario(10); // cada um executa seu próprio método
    System.out.println(f); // chama o toString() correto
}

// Cast explícito para acessar método específico da subclasse
GerenteExercicio6 gerente = (GerenteExercicio6) funcionarios[0];
gerente.aumentarSalario(5, 2000); // sobrecarga exclusiva do Gerente
```

---

### Manipulação de Arquivos
```java
import java.io.*;
import java.util.ArrayList;

// Gravar em arquivo
FileWriter arqw = new FileWriter("dados.txt", true); // true = append
BufferedWriter escritor = new BufferedWriter(arqw);
escritor.write("linha de dados");
escritor.newLine();
escritor.close();
arqw.close();

// Ler de arquivo
FileReader arqr = new FileReader("dados.txt");
BufferedReader leitor = new BufferedReader(arqr);
String linha;
while ((linha = leitor.readLine()) != null) {
    String[] campos = linha.split(","); // separa por vírgula
    String placa = campos[0];
    int ano = Integer.parseInt(campos[3]);
    double km = Double.parseDouble(campos[4]);
}
leitor.close();
arqr.close();
```
> Sempre feche `BufferedWriter`/`BufferedReader` **antes** de fechar o `FileWriter`/`FileReader`.  
> Use `try-catch (IOException e)` para tratar erros de arquivo.

---

## 4. Referência Rápida

### Array vs ArrayList — comparação direta
| | Array | ArrayList |
|---|---|---|
| Tamanho | Fixo (definido na criação) | Dinâmico |
| Sintaxe de tamanho | `.length` | `.size()` |
| Adicionar elemento | Não existe | `.add(elemento)` |
| Acessar elemento | `v[i]` | `lista.get(i)` |
| Tipos primitivos | ✅ `int`, `double`... | ❌ precisa de wrapper: `Integer`, `Double` |
| Quando usar | Tamanho fixo e conhecido | Tamanho variável ou desconhecido |

### Declarar e percorrer — resumo
```java
// Array simples
int[] v = new int[5];
for (int x : v) System.out.println(x);           // for-each (só leitura)
for (int i = 0; i < v.length; i++) v[i] = i;     // for normal (leitura/escrita)

// ArrayList de tipos simples
ArrayList<String> lista = new ArrayList<>();
lista.add("item");
for (String s : lista) System.out.println(s);     // for-each

// ArrayList de objetos — padrão mais comum em POO
ArrayList<Aluno> alunos = new ArrayList<>();
alunos.add(new Aluno("Joseph", 8, 7));
for (Aluno a : alunos) System.out.println(a.getNome());
```

### Hierarquia de chamada do `super`
```
Construtores: super() deve ser a PRIMEIRA linha do construtor filho.
Métodos: super.metodo() pode ser chamado em qualquer ponto do método filho.
```

### Quando usar cada coisa
| Situação | Use |
|---|---|
| Só precisa do valor ao percorrer | `for-each` |
| Precisa do índice ou modificar elemento | `for` normal |
| Coleção de tamanho fixo | Array `[]` |
| Coleção de tamanho variável | `ArrayList` |
| Compartilhar código e forçar implementação | Classe abstrata |
| Apenas definir contrato, sem implementação | Interface |
| Implementar múltiplos "tipos" numa classe | Interface |
| Reutilizar código com especialização | `extends` |
| Acessar membro específico de subclasse | Cast explícito: `(Subclasse) obj` |

### Armadilhas comuns
```java
// ❌ .length em ArrayList
lista.length // ERRO — use lista.size()

// ❌ int em ArrayList
ArrayList<int> lista // ERRO — use ArrayList<Integer>

// ❌ super() no meio do construtor
public Filho(String nome) {
    System.out.println("teste");
    super(nome); // ERRO — super() deve ser a primeira linha
}

// ❌ Instanciar classe abstrata ou interface
Conta c = new Conta();     // ERRO se Conta for abstract
Animal a = new Animal();   // ERRO se Animal for interface

// ✅ Correto: instanciar a implementação, guardar no tipo pai
Conta c = new ContaCorrente(1000, 500);
Animal a = new Cachorro();
```
