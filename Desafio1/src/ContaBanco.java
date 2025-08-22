import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número da Agência: ");
        String agencia = teclado.nextLine();

        System.out.print("Digite o número da Conta: ");
        int numero = teclado.nextInt();
        teclado.nextLine();

        System.out.print("digite o nome do Cliente: ");
        String nomeCliente = teclado.nextLine();

        System.out.print("Digite o saldo da conta: ");
        double saldo = teclado.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        teclado.close();
    }
}
