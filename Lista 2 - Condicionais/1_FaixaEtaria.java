/* Determine com base na idade do usuário em qual categoria ele está:
    - 0 a 14 - criança
    - 15 a 17 - adolescente
    - 18 a 30 - jovem adulto
    - 30 ou mais - adulto
 */

import java.util.Scanner;

public class FaixaEtaria {
    public static void main(String[] args) {

        System.out.println("Seja bem vindo!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 0 && idade < 14 ){
            System.out.println("Você é uma criança.");
        }
        else if (idade >= 15 && idade < 17) {
            System.out.println("Você é um adolescente.");
        }
        else if (idade >= 18 && idade < 30) {
            System.out.println("Você é um jovem adulto.");
        }
        else if (idade >30) {
            System.out.println("Você um adulto.");
        }
        else{
            System.out.println("Entrada inválida");
        }
        scanner.close();
    }
}
