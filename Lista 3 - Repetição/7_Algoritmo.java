/*
    Crie um algoritmo que peça o nome, a altura e o peso de 6 pessoas
    e apresente o nome e peso da mais pesada e o nome e a altura da mais alta
 */

import java.util.Scanner;

public class Algoritmo {
    public static void main(String[] args){

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Seja bem vindo!");

        String nomeMaisPesado = "";
        String nomeMaisAlto = "";

        double maiorPeso = 0;
        double maiorAltura = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("\nPessoa" + i);

            System.out.println("Insira seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Insira sua altura: (em metros)");
            double altura = scanner.nextDouble();

            System.out.println("Insira seu peso: (em kg)");
            double peso = scanner.nextDouble();

            scanner.nextLine();

            if (peso > maiorPeso){
                maiorPeso = peso;
                nomeMaisPesado = nome;
            }

            if (altura > maiorAltura){
                maiorAltura = altura;
                nomeMaisAlto = nome;
            }
        }

        System.out.println("\n =========================== Resultado final ==============================");
        System.out.println("Pessoa mais pesada: "  + nomeMaisPesado);
        System.out.println("Pessoa mais alta: " + nomeMaisAlto);

        scanner.close();

    }
}
