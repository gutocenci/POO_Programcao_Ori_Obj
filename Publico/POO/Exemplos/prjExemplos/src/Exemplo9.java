
import java.util.Scanner;

/**
 *
 * @author dimas
 */
public class Exemplo9 {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        int Ra;
        String Nome;
        double Nota1, Nota2, Media;

        System.out.println("Ra: ");
        Ra = Entrada.nextInt();
        System.out.println("Nome: ");
        Nome = Entrada.next();
        System.out.println("1a. nota: ");
        Nota1 = Entrada.nextDouble();
        System.out.println("2a. nota: ");
        Nota2 = Entrada.nextDouble();
        Media = (Nota1 + Nota2) / 2;
        System.out.println("Media: " + Media);
        if (Media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

}
