import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite a agência: ");
        agencia = sc.nextLine(); 

        System.out.print("Por favor, digite o número da conta: ");
        numero = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Por favor, digite o nome do cliente: ");
        nomeCliente = sc.nextLine(); 

        System.out.print("Por favor, digite o saldo da conta: ");
        saldo = sc.nextDouble();

        sc.close();

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco%n", nomeCliente);
        System.out.printf("Sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.%n", agencia, numero, saldo);


    }
}
