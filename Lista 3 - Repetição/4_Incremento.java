/*
    Peça ao usuário um número e um incremento.
    Após mostre na tela do 0 a este número respeitando o incremento informado
    Ex:
    Número = 20
    Incremento = 5
    saída do programa = 0, 5, 10, 15, 20.
*/


import java.util.Scanner;

public class Incremento {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem vindo!");
        System.out.println("---------------");

        System.out.println("Insira um número máximo: ");
        int numeroMaximo = scanner.nextInt();

        System.out.println("Insira o valor do incremento: ");
        int incremento = scanner.nextInt();

        System.out.println("Saída do programa: ");

        for (int i = 0; i <= numeroMaximo; i += incremento) {
            System.out.print(i);

            if (i + incremento <= numeroMaximo) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}
