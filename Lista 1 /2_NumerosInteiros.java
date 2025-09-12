/*
    Receba dois números inteiros e mostre na tela:
    Soma, subtração. multiplicação, divisão, o primeiro elevado ao segundo número, o resto da divisão do primeiro número pelo segundo.
 */

import java.util.Scanner;

public class NumerosInteiros {
    public static void main(String[] args) {

        System.out.println("Seja bem vindo! Insira dois números inteiros abaixo: \n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Insira o segundo número: ");
        int num2 = scanner.nextInt();


        System.out.println("================================================");
        int adicao = (num1+num2);
        System.out.printf("Adição - %s = %s \n", num1,num2, adicao);

        int subtracao = (num1-num2);
        System.out.printf("Subtração - %s - %S = %s \n", num1,num2, subtracao);

        int multiplicao = (num1 * num2);
        System.out.printf("Multiplicação - %s * %s = %s \n", num1, num2, multiplicao);

        int divisao = (num1/num2);
        System.out.printf("Divisão - %s / %s = %s \n", num1, num2, divisao);

        int restoDivisao = (num1%num2);
        System.out.printf("Resto da divisão: %s \n",restoDivisao);

        double elevado = Math.pow(num1,num2);
        System.out.printf("o primeiro número elevado ao segundo: %s\n", elevado);

        System.out.println("================================================");
    }
}
