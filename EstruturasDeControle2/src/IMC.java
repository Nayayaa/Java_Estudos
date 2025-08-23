import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = teclado.nextDouble();

        System.out.print("Digite seu altura: ");
        double altura = teclado.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);
        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade III (Mórbida)");
        }
        teclado.close();
    }
}
