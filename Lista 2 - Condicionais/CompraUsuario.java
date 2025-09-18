/*
    Pergunte ao usuário o valor unitário de um produto e a quantidade que ele quer
    comprar desse produto. Se a quantidade for até 12, o valor do produto é valor
    unitário normal vezes a quantidade. Se ele comprar mais do que 12, o valor terá
    um desconto de 10% ou o valor total da compra. Mostre o valor da compra baseado nessas
    condições.
 */
import java.util.Scanner;

public class CompraUsuario {
    public static void main(String[] args) {

        System.out.println("Seja bem vindo!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual produto você gostaria de comprar?");
        String nomeProduto = scanner.nextLine();

        System.out.println("Qual o valor dele?");
        int valorProduto = scanner.nextInt();

        System.out.println("Quantas unidades você gostaria de comprar deste produto?");
        int quantidadeProduto = scanner.nextInt();

        double valorTotal;

        if (quantidadeProduto <= 12){
            valorTotal = quantidadeProduto * valorProduto;
            System.out.println("O valor total da sua compra foi: " + valorTotal);
        }
        else {
            valorTotal = quantidadeProduto * valorProduto * 0.9;
            System.out.println("O valor total da sua compra com desconto foi: " + valorTotal);
        }
    }
}
