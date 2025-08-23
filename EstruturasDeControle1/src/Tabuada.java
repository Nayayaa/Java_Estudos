import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número de 1 ao 10: ");
        int num = teclado.nextInt();

        System.out.println("Tabuada do " + num + ":");
        int i = 1;

        while (i <= 10) {
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);
            i++;
        }
    }
}
