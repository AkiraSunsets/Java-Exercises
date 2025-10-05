/*
    Peça 10 números ao usuário
    em seguida pergunte o que ele quer saber
    Quantos números:
    - Pares
    - Impares
    - Negativos
    - Positivos

    (use switch)
 */

import java.util.Scanner;

public class DezNumerosUsuario {
    public static void main(String[] args) {

        System.out.println("Seja bem vindo!\n");

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10]; //cria listinha pra 10 numeros
        int pares = 0, impares = 0, positivos = 0, negativos = 0;

        System.out.println("Digite 10 números: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) pares++;
            else impares++;

            if (numeros[i] >= 0) positivos++;
            else negativos++;
        }

        System.out.println("\n O que você deseja saber?");
        System.out.println("1 - Quantos números são pares");
        System.out.println("2 - Quantos números são ímpares");
        System.out.println("3 - Quantos números são positivos");
        System.out.println("4 - Quantos números são negativos");
        System.out.println("Escolha: (1-4)");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Quantidade de números pares: " + pares);
                break;
                case 2:
                    System.out.println("Quantidade números ímpares: " + impares);
                    break;
                    case 3:
                        System.out.println("Quantidade de números positivos: " + positivos);
                        break;
                        case 4:
                            System.out.println("Quantidade de números negativos: " + negativos);
                            break;
                            default:
                                System.out.println("Opção inválida!");
        }
        scanner.close();
    }
}
