<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java Badge"/>
  <img src="https://img.shields.io/badge/POO-Concepts-blue?style=for-the-badge" alt="POO Badge"/>
  <img src="https://img.shields.io/badge/Status-Complete-brightgreen?style=for-the-badge" alt="Status Badge"/>
</p>

<h1 align="center">🏦 Simulador de Conta Bancária</h1>

<p align="center">
  <em>Projeto educacional demonstrando fundamentos de Java e Programação Orientada a Objetos através de uma simulação interativa de conta bancária via terminal.</em>
</p>

---

## 📋 Sobre o Projeto

Este projeto foi desenvolvido como parte do desafio **Java Challengers**, com o objetivo de colocar em prática os fundamentos da linguagem Java e conceitos de Programação Orientada a Objetos (POO).

A aplicação simula operações bancárias básicas através de uma interface de linha de comando (CLI), permitindo que o usuário interaja com sua conta realizando depósitos, saques e consultas.

---

## ✨ Funcionalidades

| Funcionalidade | Descrição |
|----------------|-----------|
| 🆕 **Abertura de Conta** | Coleta dados do cliente e cria uma nova conta bancária |
| 💰 **Depósito** | Adiciona valores à conta com validação |
| 🏧 **Saque** | Retira valores da conta com verificação de saldo |
| 📊 **Consulta** | Exibe todos os dados cadastrais e saldo atual |

---

## 🎯 Conceitos Demonstrados

### Fundamentos da Linguagem Java

| Conceito | Implementação |
|----------|---------------|
| **Tipos de Dados** | `String`, `int`, `double` para armazenar informações |
| **Operadores** | Aritméticos (`+`, `-`, `+=`) e lógicos (`>`, `<=`, `&&`) |
| **Estruturas Condicionais** | `if/else` para validações, `switch` para menu |
| **Estruturas de Repetição** | `do-while` para loop do menu |
| **Entrada de Dados** | Classe `Scanner` para leitura via teclado |
| **Formatação** | `printf()` e `String.format()` para saída formatada |

### Programação Orientada a Objetos

| Conceito | Aplicação no Projeto |
|----------|----------------------|
| 📦 **Classes e Objetos** | Classe `Conta` modela a entidade bancária |
| 🔒 **Encapsulamento** | Atributos privados com getters e setters |
| 🏗️ **Construtores** | Inicialização de objetos com parâmetros obrigatórios |
| ⚙️ **Métodos** | Operações encapsuladas (depositar, sacar, toString) |
| 🔄 **Sobrescrita** | Método `toString()` personalizado |

---

## 📁 Estrutura do Projeto

```
conta-bancaria/
│
├── 📄 README.md                    # Documentação do projeto
│
└── 📂 src/
    ├── 📄 Conta.java               # Classe modelo (entidade)
    ├── 📄 Conta.class              # Bytecode compilado
    ├── 📄 ContaBancaria.java       # Classe principal (main)
    └── 📄 ContaBancaria.class      # Bytecode compilado
```

### Descrição das Classes

#### `Conta.java`
Classe que representa a entidade **Conta Bancária**, contendo:
- **Atributos privados**: nomeCliente, agencia, numero, saldo
- **Construtor**: Inicialização com todos os dados
- **Métodos de negócio**: depositar(), sacar()
- **Getters/Setters**: Acesso e modificação controlada
- **toString()**: Representação textual formatada

#### `ContaBancaria.java`
Classe principal que contém o método `main`, responsável por:
- Coletar dados do usuário via terminal
- Instanciar objeto `Conta`
- Gerenciar menu de operações
- Controlar fluxo da aplicação

---

## 🚀 Como Executar

### Pré-requisitos

- ☕ **Java JDK 8** ou superior
- 💻 Terminal/Console (PowerShell, CMD, Bash, etc.)

### Passo a Passo

1️⃣ **Clone ou navegue até o diretório do projeto:**

```bash
cd c:\Develompment\WS-Personal\1 - Java_Challengers\conta-bancaria\src
```

2️⃣ **Compile os arquivos Java:**

```bash
javac *.java
```

3️⃣ **Execute a aplicação:**

```bash
java ContaBancaria
```

---

## 💻 Exemplo de Execução

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

---

## 🔒 Validações Implementadas

✅ **Depósito**: Aceita apenas valores positivos

✅ **Saque**: 
- Verifica se o valor é positivo
- Verifica se há saldo suficiente antes de debitar

✅ **Menu**: Trata opções inválidas com mensagem de erro

---

## 📚 Aprendizados

Este projeto permitiu praticar:

- ✅ Criação de classes e objetos em Java
- ✅ Aplicação do princípio de encapsulamento
- ✅ Uso de construtores para inicialização de objetos
- ✅ Implementação de métodos com lógica de negócio
- ✅ Manipulação de entrada de dados via Scanner
- ✅ Formatação de saída com printf e String.format
- ✅ Estruturação de código em múltiplas classes

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Uso |
|------------|-----|
| ![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white) | Linguagem de programação principal |
| ![Terminal](https://img.shields.io/badge/Terminal-4D4D4D?style=flat-square&logo=windows-terminal&logoColor=white) | Interface de interação com o usuário |

---

## 👨‍💻 Autor

Desenvolvido como parte do desafio **Java Challengers** para prática e consolidação de conhecimentos em Java e POO.

---

<p align="center">
  <img src="https://img.shields.io/badge/Made%20with-☕-orange?style=for-the-badge" alt="Made with Java"/>
</p>

<p align="center">
  <strong>⭐ Se este projeto foi útil, deixe uma estrela! ⭐</strong>
</p>
