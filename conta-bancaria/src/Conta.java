/**
 * Classe que representa uma conta bancária.
 * Contém atributos e métodos para operações bancárias básicas.
 */
public class Conta {
    
    // Atributos da classe (encapsulamento)
    private String nomeCliente;
    private String agencia;
    private int numero;
    private double saldo;
    
    /**
     * Construtor da classe Conta.
     * 
     * @param nomeCliente Nome do titular da conta
     * @param agencia Número da agência bancária
     * @param numero Número da conta
     * @param saldo Saldo inicial da conta
     */
    public Conta(String nomeCliente, String agencia, int numero, double saldo) {
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }
    
    /**
     * Realiza um depósito na conta.
     * 
     * @param valor Valor a ser depositado
     */
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.printf("\nDepósito de R$ %.2f realizado com sucesso!\n", valor);
            System.out.printf("Saldo atual: R$ %.2f\n", this.saldo);
        } else {
            System.out.println("\nValor de depósito inválido!\n");
        }
    }
    
    /**
     * Realiza um saque na conta.
     * 
     * @param valor Valor a ser sacado
     */
    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= this.saldo) {
                this.saldo -= valor;
                System.out.printf("\nSaque de R$ %.2f realizado com sucesso!\n", valor);
                System.out.printf("Saldo atual: R$ %.2f\n", this.saldo);
            } else {
                System.out.println("\nSaldo insuficiente para realizar o saque!");
                System.out.printf("Saldo disponível: R$ %.2f\n", this.saldo);
            }
        } else {
            System.out.println("\nValor de saque inválido!\n");
        }
    }
    
    // Métodos getters (acessadores)
    public String getNomeCliente() {
        return nomeCliente;
    }
    
    public String getAgencia() {
        return agencia;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    // Métodos setters (modificadores)
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    /**
     * Retorna uma representação textual dos dados da conta.
     * 
     * @return String formatada com os dados da conta
     */
    @Override
    public String toString() {
        return String.format(
            "Olá %s, obrigado por criar uma conta em nosso banco!\n" +
            "Agência: %s\n" +
            "Conta: %d\n" +
            "Saldo: R$ %.2f",
            nomeCliente, agencia, numero, saldo
        );
    }
}
