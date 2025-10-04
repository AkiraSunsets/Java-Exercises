/*
    Peça a quantidade de gols de um time A e de um time B
    em um jogo qualquer. Ao final mostre quem venceu ou se houve
    um empate baseado na quantidade de gols de cada tipo
*/
import java.util.Scanner;

public class Times {
    public static void main(String[] args) {
        System.out.println("Seja bem vindo!");
        System.out.println("===================================");


        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a quantidade de gols do time A: ");
        int golsTimeA = scanner.nextInt();

        System.out.println("Insira a quantidade de gols do time B: ");
        int golsTimeB = scanner.nextInt();

        double timeVencedor;

        if (golsTimeA > golsTimeB) {
            System.out.println("O time vencedor foi o time A");
        } else {
            System.out.println("O time vencedor foi o time B");
        }
    }
}
