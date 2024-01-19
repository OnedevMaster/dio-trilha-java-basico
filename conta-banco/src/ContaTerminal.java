import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar número da agência
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();

        // Solicitar número da conta
        System.out.println("Agora, por favor, digite o número da Conta!");
        int numero = 0;
        boolean numeroValido = false;
        while (!numeroValido) {
            try {
                numero = Integer.parseInt(scanner.nextLine());
                numeroValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido para a Conta!");
            }
        }

        // Solicitar nome do cliente
        System.out.println("Digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicitar saldo
        System.out.println("Digite o saldo inicial da conta:");
        double saldo = 0;
        boolean saldoValido = false;
        while (!saldoValido) {
            try {
                saldo = Double.parseDouble(scanner.nextLine());
                saldoValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um valor válido para o Saldo!");
            }
        }

        // Exibir mensagem com os dados inseridos
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechar o scanner para evitar vazamento de recursos
        scanner.close();
    }
}
