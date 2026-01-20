/*
* Peça o saldo de várias pessoas. Ao final, mostre quantas delas
* apresentam saldo negativo e quantas delas positivo. Porém deve ser
* classificado da seguinte forma: Se 50% ou mais do total de pessoas
* apresentaram saldo positivo, deve ser mostrado "Nenhum risco"!, caso
* contrário deve ser mostrado "Risco ao banco!". Após informar
*
*
*/


import java.util.Scanner;

public class Saldo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de pessoas: ");
        int totalPessoas = scanner.nextInt();

        int positivos = 0;
        int negativos = 0;

        for(int i = 1; i <= totalPessoas; i++){
            System.out.println("Informe o saldo da pessoa " + i + ": ");
            double saldo = scanner.nextDouble();

            if (saldo > 0){
                positivos++;
            }
            else {
                negativos++;
            }
        }

        System.out.println("\nResumo: ");
        System.out.println("Saldos positivos: " + positivos);
        System.out.println("Saldos negativos: " + negativos);

        if (positivos >= totalPessoas / 2.0) {
            System.out.println("Nenhum risco!");
        }
        else  {
            System.out.println("Risco ao banco");
        }
    }
}
