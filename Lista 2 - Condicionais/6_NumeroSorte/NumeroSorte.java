/*
    Faça um programa que gere um número da sorte para uma pessoa.
    Esse número deve ser de 1 a 100 aleatório.
    O programa deverá solicitar um número para a pessoa, com a finalidade
    dela acertar esse número. Caso acerte, mostre uma mensagem de "Você acertou",
    caso contrário "Você errou"

    Desafio: Fazer o programa dar 3 oportunidades ao utilizador de acertar o número.
 */


import java.util.Scanner;
import java.util.Random;

public class NumeroSorte {
    public static void main(String[] args) {

        System.out.println("Seja bem vindo ao Teste sua Sorte!");

        System.out.println("-----------------------------------\n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número (1 a 100): ");
        int numero = scanner.nextInt();

        Random random = new Random();
        int min = 1;
        int max = 100;

        int numeroAleatorio = random.nextInt((max - min) + 1) + min;

        if (numero == numeroAleatorio){
            System.out.println("Você acertou!");
        }
        else{
            System.out.println("Você errou!");
        }
    }
}
