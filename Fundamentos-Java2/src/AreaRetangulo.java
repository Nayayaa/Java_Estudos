import java.util.Scanner;

public class AreaRetangulo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a base do retângulo: ");
        double base = teclado.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = teclado.nextDouble();
        double area = base * altura;

        System.out.println("A área do retângulo é: " + area);
        teclado.close();
    }
}