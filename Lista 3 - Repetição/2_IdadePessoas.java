/*
    Peça a idade, peso e altura de 10 pessoas
    e mostre:
    - Quantas tem idade acima de 50 anos
    - Quantas tem altura acima de 1.60m
    - Quantas tem peso abaixo de 80kg
 */

import java.util.Scanner;

public class IdadePessoas {
    public static void main(String[] args) {

        System.out.println("Seja bem vindo!\n");

        Scanner scanner = new Scanner(System.in);

        int[] idade = new int [10];
        double[] altura = new double[10];
        double [] peso = new double [10];

        int idadePessoa = 0;
        int alturaPessoa = 0;
        int pesoPessoa = 0;

        System.out.println("Digite a idade de 10 pessoas: ");
        for (int i = 0; i < 10; i++){
            System.out.print((i + 1) + "º número: ");
            idade[i] = scanner.nextInt();
        }

        System.out.println("Digite a altura de 10 pessoas: (Ex: 1,20)");
        for (int i = 0; i < 10; i++){
            System.out.print((i + 1) + "º número: ");
            altura[i] = scanner.nextDouble();
        }

        System.out.println("Digite o peso de 10 pessoas: ");
        for (int i = 0; i < 10; i++){
            System.out.print((i + 1) + "º número: ");
            peso[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 10; i++){
            if (idade[i] > 50) idadePessoa++;
            if (altura[i] > 1.60) alturaPessoa++;
            if (peso[i] < 80) pesoPessoa++;
        }

        System.out.println(" Resultados");
        System.out.println("--------------------------------------------------");
        System.out.println("Pessoas com idade acima de 50 anos: " + idadePessoa);
        System.out.println("Pessoas com altura acima de 1.60m: " + alturaPessoa);
        System.out.println("Pessoas com peso abaixo de 80kg: " + pesoPessoa);
        System.out.println("--------------------------------------------------");
    }
}
