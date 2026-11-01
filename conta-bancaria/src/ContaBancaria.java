import java.util.Scanner;

/**
 * Classe principal que simula operações bancárias através do terminal.
 * Demonstra fundamentos de Java e conceitos de POO.
 */
public class ContaBancaria {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Exibição inicial
        System.out.println("====================================");
        System.out.println("   BEM-VINDO AO BANCO JAVA BANK    ");
        System.out.println("====================================\n");
        
        // Coleta de dados do cliente
        System.out.println("Por favor, informe seus dados para abrir a conta:\n");
        
        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.print("Agência: ");
        String agencia = scanner.nextLine();
        
        System.out.print("Número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha
        
        System.out.print("Saldo inicial: R$ ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Consumir quebra de linha
        
        // Criar objeto Conta
        Conta conta = new Conta(nomeCliente, agencia, numeroConta, saldo);
        
        // Exibir mensagem de confirmação
        System.out.println("\n====================================");
        System.out.println("   CONTA CRIADA COM SUCESSO!       ");
        System.out.println("====================================\n");
        System.out.println(conta.toString());
        
        // Menu de operações
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha
            
            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o valor do depósito: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    scanner.nextLine();
                    conta.depositar(valorDeposito);
                    break;
                    
                case 2:
                    System.out.print("\nDigite o valor do saque: R$ ");
                    double valorSaque = scanner.nextDouble();
                    scanner.nextLine();
                    conta.sacar(valorSaque);
                    break;
                    
                case 3:
                    System.out.println("\n" + conta.toString());
                    break;
                    
                case 4:
                    System.out.println("\nObrigado por utilizar o Java Bank!");
                    System.out.println("Tenha um ótimo dia!");
                    break;
                    
                default:
                    System.out.println("\nOpção inválida! Tente novamente.\n");
            }
            
        } while (opcao != 4);
        
        scanner.close();
    }
    
    /**
     * Exibe o menu de opções para o usuário.
     */
    private static void exibirMenu() {
        System.out.println("\n====================================");
        System.out.println("          MENU DE OPERAÇÕES        ");
        System.out.println("====================================");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Consultar Dados da Conta");
        System.out.println("4 - Sair");
        System.out.println("====================================");
        System.out.print("Escolha uma opção: ");
    }
}
