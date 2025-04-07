package conta.banco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        String accountNumber;
        int agency;
        String customerName;
        double balance;

        // TODO: Conhecer e importar a classe Scanner.

        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o usuário
        // Obter pela classe Scanner os valores digitados no terminal
        System.out.println("Por favor, informe o nome do titular da conta:");
        customerName = scanner.nextLine();

        System.out.println("Agora, informe o número da agência:");
        agency = scanner.nextInt();
        scanner.nextLine(); // linha adicionada, não sei o motivo, mas o programa estava pulando a proxima linha sempre que apertava enter. POG!?

        System.out.println("Informe, também, o número da conta, com o digito:");
        accountNumber = scanner.nextLine();

        System.out.println("Informe o valor do depósito inicial:");
        balance = scanner.nextDouble();

        // Exibir a mensagem conta criada
        System.out.printf(
            "Olá %s, obrigado por criar uma conta em nosso banco,\n" //
            + "sua agência é %d, conta %s e seu saldo R$ %.2f já disponível" //
            + " para saque.\n", customerName, agency, accountNumber, balance
        );

        scanner.close();
    }
}
