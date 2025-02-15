import java.util.Locale;
import java.util.Scanner;

/**
 * <h1>Conta Terminal</h1>
 * <p>Este projeto em Java simula a criação de uma conta bancária por meio do terminal, onde o usuário informa seus dados e recebe uma mensagem de confirmação com as informações inseridas.</p>
 * <br>
 * @author Suzy Cruz
 * @version 1.0
 * @since 15/02/2025
 */

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta: ");
        int numero = Integer.parseInt(scanner.nextLine().trim());

        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o valor do depósito: ");
        String valorStr = scanner.nextLine().trim().replace(",", ".");

        double saldo = 0.0;
        try {
            saldo = Double.parseDouble(valorStr);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Valor inválido para depósito. Certifique-se de digitar um número.");
            System.exit(1);
        }

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque");

        scanner.close();
    }
}
