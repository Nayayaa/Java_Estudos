import java.util.Scanner;

public class DiferencaIdade {

    public static void main(String[] args) {

        int diferenca;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = teclado.nextLine();
        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = teclado.nextLine();

        System.out.print("Digite a idade de " + nome1 + ": ");
        int idade1 = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Digite a idade de " + nome2 + ": ");
        int idade2 = teclado.nextInt();

        if (idade1 > idade2) {
            diferenca = idade1 - idade2;
        } else {
            diferenca = idade2 - idade1;
        }

        System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é de " + diferenca + " anos");
        teclado.close();
    }
}
