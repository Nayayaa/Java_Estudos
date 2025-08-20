import java.time.OffsetDateTime;
import java.util.Scanner;

// Exercicíos de fundamentos
public class Fundamentos {
        public static void main(String[] args) {

            int baseYear = OffsetDateTime.now().getYear();
            int baseMonth = OffsetDateTime.now().getMonthValue();
            String nome;
            int ano;
            int mes;

            Scanner teclado = new Scanner(System.in);
            System.out.print("Informe o seu nome: ");
            nome = teclado.next();
            System.out.print("Informe ano de nascimento: ");
            ano = teclado.nextInt();
            System.out.print("Informe o mês de nascimento em número: ");
            mes = teclado.nextInt();

            int idade = baseYear - ano;

            if (baseMonth < mes) {
                idade--;
            }

            System.out.printf("Olá %s você tem %s anos", nome , idade);
        }
}
