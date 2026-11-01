# Simulador de Conta Bancária

Projeto Java que simula operações bancárias através do terminal/console, demonstrando fundamentos da linguagem e conceitos de Programação Orientada a Objetos.

## Funcionalidades

- **Abertura de Conta**: Coleta dados do cliente (nome, agência, número da conta e saldo inicial)
- **Depósito**: Permite adicionar valores à conta
- **Saque**: Permite retirar valores da conta (com verificação de saldo)
- **Consulta**: Exibe todos os dados da conta

## Conceitos Demonstrados

### Fundamentos da Linguagem Java
- Variáveis e tipos de dados (String, int, double)
- Operadores aritméticos e lógicos
- Estruturas condicionais (if/else, switch)
- Estruturas de repetição (do-while)
- Entrada de dados via Scanner
- Formatação de saída (printf, String.format)

### Programação Orientada a Objetos
- **Classes e Objetos**: Criação da classe `Conta` com atributos e métodos
- **Encapsulamento**: Atributos privados com getters e setters
- **Construtores**: Inicialização de objetos com parâmetros
- **Métodos**: Operações de depósito, saque e consulta
- **Sobrescrita**: Método `toString()` para representação textual

## Estrutura do Projeto

```
conta-bancaria/
├── src/
│   ├── ContaBancaria.java    # Classe principal com método main
│   └── Conta.java            # Classe que representa a conta bancária
└── README.md
```

## Como Executar

1. **Compilar os arquivos Java:**
   ```bash
   cd conta-bancaria/src
   javac *.java
   ```

2. **Executar o programa:**
   ```bash
   java ContaBancaria
   ```

## Exemplo de Uso

```
====================================
   BEM-VINDO AO BANCO JAVA BANK    
====================================

Por favor, informe seus dados para abrir a conta:

Nome do cliente: João Silva
Agência: 1234-5
Número da conta: 67890
Saldo inicial: R$ 1000.00

====================================
   CONTA CRIADA COM SUCESSO!       
====================================

Olá João Silva, obrigado por criar uma conta em nosso banco!
Agência: 1234-5
Conta: 67890
Saldo: R$ 1000.00

====================================
          MENU DE OPERAÇÕES        
====================================
1 - Depositar
2 - Sacar
3 - Consultar Dados da Conta
4 - Sair
====================================
Escolha uma opção: 1

Digite o valor do depósito: R$ 500.00

Depósito de R$ 500.00 realizado com sucesso!
Saldo atual: R$ 1500.00
```

## Requisitos

- Java JDK 8 ou superior
- Terminal/Console

## Autor

Desenvolvido como parte do desafio "Java Challengers" para praticar fundamentos da linguagem Java e conceitos de POO.
