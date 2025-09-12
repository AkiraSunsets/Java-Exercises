/*
    Mostre a divisão dos números somente se o segundo número não for 0
    Caso o número seja 0, mostrar uma mensagem: A divisão não pode ser realizada

 */

import java.util.Scanner;

public class DesafioDivisao {
    public static void main(String[] args) {

        System.out.println("Seja Bem vindo! Insira dois números inteiros: ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Insira o segundo número: ");
        int num2 = scanner.nextInt();

        if (num2 > 0){
            int divisao = (num1/num2);
            System.out.printf("%s / %s = %s", num1,num2,divisao);
        }
        else
            System.out.println("A divisão não pode ser realizada.");
    }
}
