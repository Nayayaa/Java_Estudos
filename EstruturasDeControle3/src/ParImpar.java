import java.util.Scanner;

public class ParImpar {

        public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);

            System.out.print("Digite o primeiro número (menor): ");
            int primeiroNumero = teclado.nextInt();

            System.out.print("Digite o segundo número (maior): ");
            int segundoNumero = teclado.nextInt();

            if (segundoNumero <= primeiroNumero) {
                System.out.println("O segundo número deve ser maior que o primeiro. Por favor, reinicie o programa.");
                teclado.close();
                return;
            }

            System.out.print("Escolha entre 'par' ou 'impar': ");
            String escolha = teclado.next();

            for (int i = segundoNumero; i >= primeiroNumero; i--) {

                if (escolha.equalsIgnoreCase("par") && i % 2 == 0) {
                    System.out.println(i);
                }

                else if (escolha.equalsIgnoreCase("impar") && i % 2 != 0) {
                    System.out.println(i);
                }
            }
            teclado.close();
        }
}
