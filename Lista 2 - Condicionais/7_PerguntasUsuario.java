/*
    Elabore 2 perguntas com 3 alternativas de resposta cada.
    O programa deverá perguntar ao usuário se ele quer responder a pergunta 1 ou 2
    Exiba a pergunta e as alternativas correspondentes
    Caso o usuário acerte a resposta, informe "Você acertou, pode retirar seu bônus"
    Caso ele erre, informe "Você não acertou, mas tente novamente numa próxima"

    (Desafio feito aqui junto :D)
 */

import java.util.Scanner;

public class PerguntasUsuario {
    public static void main(String[] args) {

        System.out.println("Seja bem vindo!\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da questão que você quer responder (1/2)");
        int pergunta = scanner.nextInt();

        scanner.nextLine();

        if (pergunta == 1){
            System.out.println("Qual desses animais é o mais rápido do mundo?");
            System.out.println("A - Leão");
            System.out.println("B - Guepardo");
            System.out.println("C - Cavalo");
            System.out.println("---------------------------------------------");
            System.out.println("Insira sua resposta: ");
            String resposta1 = scanner.nextLine();

            if (resposta1.equalsIgnoreCase("A")){ //Equalignorecase serve pra ignorar maiusculas e minusculas :D
                System.out.println("Você não acertou, mas tente novamente numa próxima");
            }

            else  if (resposta1.equalsIgnoreCase("B")){
                System.out.println("Você acertou, pode retirar seu bônus!");
            }
            else  if (resposta1.equalsIgnoreCase("C")){
                System.out.println("Você não acertou, mas tente novamente numa próxima");
            }
        }

        else if (pergunta == 2){
            System.out.println("Qual é o planeta conhecido como o planeta Vermelho?");
            System.out.println("A - Marte");
            System.out.println("B - Vênus");
            System.out.println("C - Júpiter");
            System.out.println("---------------------------------------------");
            System.out.println("Insira sua resposta: ");
            String resposta2 = scanner.nextLine();

            if (resposta2.equalsIgnoreCase("A")){
                System.out.println("Você acertou, pode retirar seu bônus!");
            }

            else  if (resposta2.equalsIgnoreCase("B")){
                System.out.println("Você não acertou, mas tente novamente numa próxima");
            }
            else  if (resposta2.equalsIgnoreCase("C")){
                System.out.println("Você não acertou, mas tente novamente numa próxima");
            }
        }
    }
}
