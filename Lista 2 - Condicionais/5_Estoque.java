/*
    Ler a quantidade atual em estoque, quantidade máxima em estoque e quantidade minima
    em estoque de um produto. Calcular e escrever a quantidade média:
    ((quantidade média = quantidade máxima + quantidade minima)/2.
    Se a quantidade em estoque for maior ou igual a quantidade média, retornar a mensagem
    "não efetuar compra", se não escrever a mensagem "efetuar compra"
 */

import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        System.out.println("Seja bem vindo ao controle de estoque!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.println("Insira a quantidade atual em estoque: ");
        int quantidadeAtual = scanner.nextInt();

        System.out.println("Insira a quantidade máxima em estoque: ");
        int quantidadeMaxima = scanner.nextInt();

        System.out.println("Insira a quantidade mínima em estoque: ");
        int quantidadeMinima = scanner.nextInt();


        int quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;

        System.out.println("----- Resumo da Compra ------");
        System.out.println("Nome: " + nomeProduto);
        System.out.println("Quantidade média atual: " + quantidadeAtual);
        
        if (quantidadeAtual >= quantidadeMedia){
            System.out.println("Situação: Não efetuar compra!");
        }
        else{
            System.out.println("Situação: Efetuar compra!");
        }
        System.out.println("------------------------------");
        scanner.close();
    }
}

