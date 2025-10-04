/*
    Pergunte onde o usuário pretende passar as férias, pergunte também se ele
    deseja o valor com almoço/janta incluso ou não e mostrar o valor final da viagem
    na tela. O valor base para todas as viagens é de R$ 3.000,00

    Condições:
    1 - Maceió
    Sim - +100% do valor base
    Não - + 85% do valor base

    2 - Porto de Galinhas
    Sim - +60% do valor base
    Não - +45% do valor base
 */

import java.util.Scanner;

public class FeriasUsuario {
    public static void main(String[] args) {

        System.out.println("Seja bem vindo!");

        Scanner scanner = new Scanner(System.in);

        double valorBase = 3000.0;
        double valorTotalViagem = 0.0;

        System.out.println("Insira o seu destino (Maceió ou Porto de Galinhas): ");
        String destinoFerias = scanner.nextLine();

        System.out.println("Você gostaria de ter almoço/jantar inclusos? (Sim/Não): ");
        String inclusosFerias = scanner.nextLine();

        if (destinoFerias.equals("Maceió")){

            if (inclusosFerias.equals("Sim")){
                valorTotalViagem = valorBase + (valorBase * 1.0);
            }
            else {
                valorTotalViagem = valorBase + (valorBase * 0.85);
            }
        }

        else if (destinoFerias.equals("Porto de Galinhas"))
        {
            if (inclusosFerias.equals("Sim")){
                valorTotalViagem = valorBase + (valorBase * 0.60);
            }
            else {
                valorTotalViagem = valorBase + (valorBase * 0.45);
            }
        }

        else {
            System.out.println("Destino inválido");
            return;
    }

        System.out.println("O valor da sua viagem para " + destinoFerias + "é R$" +valorTotalViagem);
        scanner.close();
    }
}
