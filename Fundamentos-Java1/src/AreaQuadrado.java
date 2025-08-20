import java.util.Scanner;

public class AreaQuadrado {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o tamanho do lado do quadrado: ");
        double lado = teclado.nextDouble();
        double area = lado * lado;

        System.out.println("A área do quadrado é: " + area);
        teclado.close();
    }
}
