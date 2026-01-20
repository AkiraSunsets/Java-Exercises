/*
    dado um número, mostre sua tabuada de 0 a 10, no seguinte formato
    2 x 0
    2 x 1
 */


import java.util.Scanner;

public class Tabuada {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem vindo!");
        System.out.println("Digite o número da tabuada: ");

        int numero = scanner.nextInt();

        System.out.println("Tabuada de " + numero + ":");

        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + "x" + i + "=" + (numero * i));
        }

        scanner.close();
    }
    }
