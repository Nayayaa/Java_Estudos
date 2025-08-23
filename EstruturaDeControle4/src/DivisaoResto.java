import java.util.Scanner;

public class DivisaoResto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número inicial: ");

        int numeroInicial = teclado.nextInt();

        while (true) {
            System.out.print("Digite um número: ");
            int numero = teclado.nextInt();

            if (numero < numeroInicial) {
                System.out.println("Número " + numero + " ignorado (menor que " + numeroInicial + ")");
                continue;
            }

            int resto = numero % numeroInicial;

            System.out.println(numero + " ÷ " + numeroInicial + " = resto " + resto);

            if (resto != 0) {
                System.out.println("Resto diferente de 0!");
                break;
            }
        }
        teclado.close();
    }
}
